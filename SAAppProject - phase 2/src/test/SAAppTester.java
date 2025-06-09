package test;

import java.time.LocalDate;

import model.*;
/**
 * @author Islam/202004552, Anfal/201804370, Alreem/201901898 <br>
 *         Created on 05/11/2021
 * @version 1.0
 *
 */
public class SAAppTester {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * creating an Administrator object 
		 */
		Administrator admin1 = new Administrator(12334, "Joan Laporta", Gender.MALE, "Spanish", "+34 6655442276",
				LocalDate.of(2021, 3, 7));
		/**
		 * creating a Club object 
		 */
		Club club1 = new Club("FCB", "Catalonia", admin1);
		System.out.println(club1);

		club1.addMember(admin1);

		/**
		 * creating coaches objects and adding them to the members list of club 1
		 */
		/*Coach coach1 = new Coach(1, "Sarunas Jasik", Gender.MALE, "Lithuanian", "+34 1238542", "Basketball");
		Coach coach2 = new Coach(2, "Ronald Koeman", Gender.MALE, "Dutch", "+34 54323111", "Football");
		Coach coach3 = new Coach(3, "Xavi Hernandez", Gender.MALE, "Spanish", "+34 43535356", "Football");
		Coach coach4 = new Coach(4, "Georgina Tomas", Gender.FEMALE, "Spanish", "+34 32221698", "Volleyball");

		club1.addMember(coach1);
		club1.addMember(coach2);
		club1.addMember(coach3);
		club1.addMember(coach4);
		*/

		/**
		 * creating sports objects and adding them to the sports list of club 1
		 */
		
		Sport sport1 = new Sport("Football  ", "https://www.fcbarcelona.com/en/");
		Sport sport2 = new Sport("Volleyball", "https://www.fcbarcelona.com/en/amateur-sports/volleyball/");
		Sport sport3 = new Sport("Basketball", "https://www.fcbarcelona.com/en/basketball");

		club1.addSport(sport1);
		club1.addSport(sport2);
		club1.addSport(sport3);

		/**
		 * creating players objects and adding them to the members list of club 1
		 */
		
		Player player1 = new Player(10, "Leonel Messi", Gender.MALE, "Argentine", "+32 44323232", sport1, 9);
		Player player2 = new Player(22, "Katherina Sun", Gender.FEMALE, "Italian", "+36 66666543", sport2, 8);
		Player player3 = new Player(2, "Colombus frio", Gender.MALE, "Brazilian", "+54 99885621", sport1, 7);
		Player player4 = new Player(6, "Micheal Jordan", Gender.MALE, "American", "+1 00011100", sport3, 10);
		Player player5 = new Player(15, "Sandy Clerk", Gender.FEMALE, "British", "+45 76662333", sport3, 5);

		club1.addMember(player1);
		club1.addMember(player2);
		club1.addMember(player3);
		club1.addMember(player4);
		club1.addMember(player5);
		
		// calling the displayMemebers() method from the Club class
		// to display the members' information 
		club1.displayMemebers();
		// calling the removeMember(Person person) method from the Club class
		// to remove a member
		club1.removeMember(player5);
		// calling the displayMemebers() method from the Club class
		// to display the members' information after removing a member
		club1.displayMemebers();
		// calling getTotalNumMembers() method from the Club class
		// to get the total number of members in club 1
		System.out.println(club1.getTotalNumMembers());
 
		/**
		 * creating an Administrator object 
		 */
		Administrator admin2 = new Administrator(34785, "Tamim Bin Fahad", Gender.MALE, "Qatari", "+974 55000001",
				LocalDate.of(2020, 9, 9));
		/**
		 * creating a Club object 
		 */
		Club club2 = new Club("Alarabi", "Qatar", admin2);
		System.out.println(club2);

		/**
		 * creating coaches objects and adding them to the members list of club 2
		 */
		
		/*Coach coach01 = new Coach(5678, "Jiovani Caballero", Gender.MALE, "French", "+974 32778987", "Swimming");
		Coach coach02 = new Coach(5679, "Zain Zidan", Gender.MALE, "Algerian", "+974 66774211", "Football");
		Coach coach03 = new Coach(5680, "Tarek fahad", Gender.MALE, "Qatari", "+974 44566689", "Handball");

		club2.addMember(coach01);
		club2.addMember(coach02);
		club2.addMember(coach03);
		*/

		/**
		 * creating sports objects and adding them to the sports list of club 2
		 */
		
		Sport sport01 = new Sport("Football", "https://alarabi.qa/first-team/");
		Sport sport02 = new Sport("Handball",
				"https://alarabi.qa/%d9%83%d8%b1%d8%a9-%d8%a7%d9%84%d9%8a%d8%afhandball/");
		Sport sport03 = new Sport("Swimming", "https://alarabi.qa/%d8%a7%d9%84%d8%b3%d8%a8%d8%a7%d8%ad%d8%a9swimming/");

		club2.addSport(sport01);
		club2.addSport(sport02);
		club2.addSport(sport03);

		/**
		 * creating players objects and adding them to the members list of club 2
		 */
		
		Player player01 = new Player(19, "Ibrahim Nasser", Gender.MALE, "Qatar", "+974 66777833", sport01, 9);
		Player player02 = new Player(28, "Yousef Elmsekni", Gender.MALE, "Tunisian", "+54 99885621", sport01, 9);
		Player player03 = new Player(17, "Aron Gonarson", Gender.MALE, "Iceland", "+974 12233344", sport02, 8);
		Player player04 = new Player(28, "Dalanda Rio", Gender.FEMALE, "Cuba", "+974 66553311", sport03, 9);

		club2.addMember(player01);
		club2.addMember(player02);
		club2.addMember(player03);
		club2.addMember(player04);
		
		// calling the displaySports() method from the Club class
		// to display the sports' information
		club2.displaySports();
		// calling getTotalNumMembers() method from the Club class
		// to get the total number of members in club 2
		System.out.println(club2.getTotalNumMembers());
		// calling findMember(int id) method from the Club class
		// to find the desired member using the id number
		// if the member is not found, we will get an error message
		Person p1 = club1.findMember(10);
		if(p1==null)
			System.out.println("---------------------------\nThis member is not found!\n---------------------------");
		else
			System.out.println(p1);
		Person p2 = club2.findMember(1);
		if(p2==null)
			System.out.println("---------------------------\nThis member is not found!\n---------------------------");
		else
			System.out.println(p2);
					

club1.saveAllData();
	}

}
