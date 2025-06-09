package Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Gender;
import model.Person;
import model.Player;
import model.Sport;

public class playerRepository {
	
	
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Person> loadPlayerData() throws ClassNotFoundException {

		ObjectInputStream objout = null;
		ArrayList<Person>	Players_list=null;

		try {

			objout = new ObjectInputStream(new FileInputStream(new File("players.dat")));

			Players_list = (ArrayList<Person>) objout.readObject();
			objout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Players_list;

	}
	
	public static void createPlayersFile() {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("players.dat"));
			List<Player> players = new ArrayList<Player>();

			players.add(new Player(1, "Ali", Gender.MALE, "UAE", "123-456", new Sport("Swimming", "swimming.com"), 8));
			players.add(new Player(2, "Bob", Gender.MALE, "USA", "123-456", new Sport("Football", "football.com"), 6));
			players.add(new Player(3, "Cat", Gender.FEMALE, "UK", "123-456", new Sport("Tennis", "tennis.com"), 9));
			out.writeObject(players);
			out.close();

		} catch (IOException exception) {
			System.out.println(exception.getStackTrace());
		}
	}


	public static void savePlayerData(ArrayList<Person> arrayList) {
		ObjectOutputStream objout = null;

		try {
			objout = new ObjectOutputStream(new FileOutputStream(new File("players.dat"), false));

			objout.writeObject(arrayList);
			objout.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
