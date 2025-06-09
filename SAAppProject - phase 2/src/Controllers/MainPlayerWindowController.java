package Controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Club;
import model.Person;
import model.Player;
import Repository.playerRepository;


public class MainPlayerWindowController implements Initializable {
	@FXML
	private Button AddButton;

	@FXML
	private Button UpdateButton;

	@FXML
	private Button DeleteButton;

	@FXML
	private Button SaveButton;

	@FXML
	private TableView<Person> PlayersTable;

	@FXML
	private TableColumn<Person, Integer> idCol ;
	
	@FXML
	private TableColumn<Person, String> NameCol;

	@FXML
	private TableColumn<Person, String> PhoneCol;

	@FXML
	private TableColumn<Person, String> GenderCol;

	@FXML
	private TableColumn<Person, String> NationalityCol;

	@FXML
	private TableColumn<Person, String> SportCol;

	@FXML
	private TableColumn<Person, Integer> ratingCol;

	

	static ObservableList<Person> PlayerList = null;
	Club club = new Club();

	@FXML
	void AddButtonPressed(ActionEvent event) throws IOException {
		Stage stage = new Stage();

		Parent root = FXMLLoader.load(getClass().getResource("/view/AddPlayer.fxml"));

		stage.setTitle("Add Player");

		stage.setScene(new Scene(root));
		((Stage) AddButton.getScene().getWindow()).close();
		stage.show();
	}

	@FXML
	void DeleteButtonPressed(ActionEvent event) {
		PlayersTable.getSelectionModel().getSelectedItem();
		if (PlayersTable.getSelectionModel().getSelectedItem() == null) {
			Alert a = new Alert(AlertType.INFORMATION);
			a.setTitle("message");
			a.setContentText("please select a Player to delete");
			a.showAndWait();
		} else {
			Alert a = new Alert(AlertType.CONFIRMATION);
			a.setTitle("Confirm");
			a.setContentText("Are you sure you want to delete Player with ID :  "
					+ PlayersTable.getSelectionModel().getSelectedItem().getId() + " Name : "+ PlayersTable.getSelectionModel().getSelectedItem().getName());
			Optional<ButtonType> action = a.showAndWait();
			if (action.get() == ButtonType.OK) {
				club.removeMember(PlayersTable.getSelectionModel().getSelectedItem());
				PlayerList.remove(PlayersTable.getSelectionModel().getSelectedIndex());
					}
		}
	}

	@FXML
	void SaveButtonPressed(ActionEvent event) {
		playerRepository.savePlayerData(club.getMembers());
	}

	@FXML
	void UpdateButtonPressed(ActionEvent event) throws IOException {
		
		PlayersTable.getSelectionModel().getSelectedItem();
		if (PlayersTable.getSelectionModel().getSelectedItem() == null) {
			Alert a = new Alert(AlertType.INFORMATION);
			a.setTitle("message");
			a.setContentText("please select a Player to Update");
			a.showAndWait();
		} else {
			
			Stage stage = new Stage();
			FXMLLoader Loader=new FXMLLoader();
			Loader.setLocation(getClass().getResource("/view/UpdatePlayer.fxml"));
			Parent root = Loader.load();
            stage.setTitle("Update Player");
	        stage.setScene(new Scene(root));
			UpdatePlayerController Controller=Loader.getController();
			Controller.InitData((Player) PlayersTable.getSelectionModel().getSelectedItem());
	        
	        
	        stage.show();
				

			}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
		NameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
		PhoneCol.setCellValueFactory(new PropertyValueFactory<>("mobileNo"));
		GenderCol.setCellValueFactory(cellData -> new SimpleObjectProperty<String>(cellData.getValue().getGender().toString()));
		NationalityCol.setCellValueFactory(new PropertyValueFactory<>("nationality"));
		SportCol.setCellValueFactory(cellData -> new SimpleObjectProperty<String>(((Player) cellData.getValue()).getSport().getName()));
		ratingCol.setCellValueFactory(new PropertyValueFactory<>("rating"));
		try {
			club.setMembers(playerRepository.loadPlayerData());
			PlayerList =FXCollections.observableArrayList(club.getMembers());
			PlayersTable.setItems(PlayerList);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void AddPlayer(Player c) {
		club.getMembers().add(c);
		PlayersTable.getItems().add(c);
	}

	public void UpdatePlayer(Player c) {
		Player OldPlayer = null;
		ArrayList<Person> Playerlist = club.getMembers();
		for (Person Player : Playerlist) {
			if (Player.getId() == c.getId()) {
				OldPlayer = (model.Player) Player;
				club.getMembers().set(club.getMembers().indexOf(Player), c);
				break;
			}
		}
		PlayersTable.getItems().remove(OldPlayer);
		PlayersTable.getItems().add(c);
	}

	public void BindPlayersTable() {
		ObservableList<Person> PlayerList = (ObservableList<Person>) club.getMembers();
		PlayersTable.setItems(PlayerList);
	}

}
