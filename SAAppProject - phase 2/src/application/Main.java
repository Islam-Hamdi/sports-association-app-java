package application;

import Repository.SportRepository;
import Repository.countriesRepository;
import Repository.playerRepository;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
playerRepository pRepository =new playerRepository ();
SportRepository sRepository =new SportRepository ();

pRepository.createPlayersFile();
sRepository.createSportsNamesFile();

System.out.println(playerRepository.loadPlayerData());
System.out.println(sRepository.loadSportsData());
System.out.println(countriesRepository.loadCountriesData());
	}

}
