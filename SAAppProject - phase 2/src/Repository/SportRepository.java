package Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import model.Sport;

public class SportRepository {

	public static void saveSportsData(ArrayList<Sport> list) {

		ObjectOutputStream objout = null;

		try {
			objout = new ObjectOutputStream(new FileOutputStream(new File("sportNames.dat"), false));

			objout.writeObject(list);
			objout.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static ArrayList<String> loadSportsData() throws ClassNotFoundException {

		ObjectInputStream objout1 = null;
		ArrayList<String> Sports = new ArrayList<String>();
		try {
			objout1 = new ObjectInputStream(new FileInputStream(new File("sportNames.dat")));
			Sports = (ArrayList<String>) objout1.readObject();
			objout1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Sports;

	}

	public static void createSportsNamesFile() {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream("sportNames.dat"));
			List<String> sportsNames = new ArrayList<>();

			sportsNames.add("Swimming");
			sportsNames.add("Football");
			sportsNames.add("Basket Ball");
			sportsNames.add("Volley Ball");
			sportsNames.add("Tennis");
			sportsNames.add("Hand Ball");
			sportsNames.add("Basket Ball");
			out.writeObject(sportsNames);
			out.close();

		} catch (IOException exception) {
			System.out.println(exception.getStackTrace());
		}
	}

}
