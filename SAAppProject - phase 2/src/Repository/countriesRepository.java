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

public class countriesRepository {



	public static ArrayList<String> loadCountriesData() throws ClassNotFoundException {

		ObjectInputStream objout1 = null;
		ArrayList<String> Countries = new ArrayList<String>();
		try {
			objout1 = new ObjectInputStream(new FileInputStream(new File("countriesNames.dat")));
			Countries = (ArrayList<String>) objout1.readObject();
			objout1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Countries;

	}

}
