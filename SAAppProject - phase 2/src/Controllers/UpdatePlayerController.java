package Controllers;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import Repository.SportRepository;
import Repository.countriesRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.Club;
import model.Player;
import model.Sport;

public class UpdatePlayerController {

	@FXML
	private TextField playeridTextField;

	@FXML
	private TextField phoneTextField;

	@FXML
	private TextField nameTextField;

	@FXML
    private ChoiceBox<String> chCountries;


	@FXML
	private TextField RatingTextField;

	@FXML
	private Button addButton;

	@FXML
	private Button closeButton;

	@FXML
	private RadioButton rdMail;

	@FXML
	private ToggleGroup GenderOption;

	@FXML
	private RadioButton rdFemail;

	@FXML
	private ChoiceBox<String> chSports;

	Club club = new Club();

	@FXML
	void addButtonAction(ActionEvent event) {
		try {
			if (chSports.getValue() != null && playeridTextField.getText() != null && nameTextField.getText() != null
					&& chCountries.getValue() != null && RatingTextField.getText() != null
					&& phoneTextField.getText() != null) {

				int PlayerId = Integer.parseInt(playeridTextField.getText());
				String phone = phoneTextField.getText();
				String name = nameTextField.getText();
				String nationality = chCountries.getValue();
				int rate = Integer.parseInt(RatingTextField.getText());
				Sport sport =new Sport(chSports.getValue(), "") ;
				String gender = "";

				if (rdFemail.isSelected())
					gender = "FEMALE";
				else
					gender = "MALE";
				if (rate >= 0 && rate <= 10) {
					
					Player player = new Player(PlayerId, name, model.Gender.valueOf(gender), nationality, phone, sport,
							rate);
					Stage stage = new Stage();
					FXMLLoader Loader = new FXMLLoader();
					Loader.setLocation(getClass().getResource("/view/MainPlayerView.fxml"));
					Parent root = Loader.load();
					stage.setTitle("Main Player");
					stage.setScene(new Scene(root));
					MainPlayerWindowController Controller = Loader.getController();
					Controller.UpdatePlayer(player);
					((Stage) closeButton.getScene().getWindow()).close();
					stage.show();
				} else {
					Alert a = new Alert(AlertType.WARNING);
					a.setTitle("message");
					a.setContentText("rating should not be greater than 10");
					a.showAndWait();
				}

			} else

			{
				Alert a = new Alert(AlertType.INFORMATION);
				a.setTitle("message");
				a.setContentText("please Enter Player Data");
				a.showAndWait();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void closeButtonAction(ActionEvent event) throws IOException {
		((Stage) closeButton.getScene().getWindow()).close();
	}

	public void InitData(Player selectedPlayer) {
		fillAllSports();

		Player selected = (Player) selectedPlayer;
		playeridTextField.setEditable(false);
		playeridTextField.setText(Integer.valueOf(selected.getId()).toString());
		nameTextField.setText(selected.getName());
		phoneTextField.setText(selected.getMobileNo());
		chCountries.setValue(selected.getNationality());
		if (selected.getGender() == model.Gender.FEMALE)
			rdFemail.setSelected(true);
		else
			rdMail.setSelected(true);
		RatingTextField.setText(Integer.valueOf(selected.getRating()).toString());
		chSports.setValue(selected.getSport().getName());

	}

	private void fillAllSports() {

		chSports.getItems().clear();
		ObservableList<String> sportOL;
		ObservableList<String> CountriesOL;
		try {
			sportOL = FXCollections.observableArrayList(SportRepository.loadSportsData());
			chSports.setItems(sportOL);
			CountriesOL = FXCollections.observableArrayList(countriesRepository.loadCountriesData());
			chCountries.setItems(CountriesOL);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
