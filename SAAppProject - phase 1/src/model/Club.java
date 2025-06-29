package model;

import java.util.ArrayList;

/**
 * @author Islam/202004552, Anfal/201804370, Alreem/201901898 <br>
 *         Created on 05/11/2021
 * @version 1.0
 *
 */
public class Club {
	private String name;
	private String city;
	private Administrator chairperson;
	private ArrayList<Sport> sports;
	private ArrayList<Person> members;

	/**
	 * @param name :  the name of the club 
	 * @param city : the city of the club
	 * @param chairperson : the chairperson of the club
	 * <br>ArrayList<Sport> sports : sports' list which contains sports in the club
	 * <br>ArrayList<Person> members : members' list which contains players and coaches in the club
	 */
	public Club(String name, String city, Administrator chairperson) {
		this.members = new ArrayList<Person>();
		this.sports = new ArrayList<Sport>();
		this.name = name;
		this.city = city;
		this.chairperson = chairperson;
	}

	/**
	 * @return the name of the club of type String
	 */
	public String getName() {
		return name;
	}

	/**
	 * this method sets the name field for Club object
	 * @param name: string value that represents the name of the club
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the city of the club of type String
	 */
	public String getCity() {
		return city;
	}

	/**
	 * this method sets the city field for Club object 
	 * @param city: string value that represents the city of the club
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the chairperson of the club of type Administrator
	 */
	public Administrator getChairperson() {
		return chairperson;
	}

	/**
	 * this method sets the chairperson field for Club object
	 * @param chairperson : Administrator value that represents the chairperson of the club
	 *                    
	 */
	public void setChairperson(Administrator chairperson) {
		this.chairperson = chairperson;
	}

	/**
	 * @return a list of sports of the club of type ArrayList
	 */
	public ArrayList<Sport> getSports() {
		return sports;
	}
	/** this method sets the sports field for Club object
	 * @param sports: ArrayList<Sport> value that represents the sports of the club
	 */
	public void setSports(ArrayList<Sport> sports) {
		this.sports = sports;
	}

	/**
	 *  @return members of the club of type ArrayList
	 */
	public ArrayList<Person> getMembers() {
		return members;
	}
	/** this method sets the members field for Club object
	 * @param members: ArrayList<Person> value that represents the sports of the club
	 */
	public void setMembers(ArrayList<Person> members) {
		this.members = members;
	}

	/**
	 * addMember(Person person): that adds a person to the members list. <br>
	 * It should only add the person if she/he is a coach or a player.<br>
	 * It should not add an administrator as a member.
	 * @param person : Person value that represents a member

	 */
	public void addMember(Person person) {
		if (person instanceof Player || person instanceof Coach)
			members.add(person);
		else
			System.out.println("---------------------------\nError! This member is not a player, nor a coach!"
					+ "\n---------------------------");
	}

	/**
	 * removeMember(Person person): that removes the person from the list of members.<br>
	 * @param person : Person value that represents a member
	 */
	public void removeMember(Person person) {
		if (members.contains(person)) {
			members.remove(person);
			System.out.println("---------------------------\na member has beed removed sucessfully"
					+ "\n---------------------------");
		} else
			System.out.println("This member is not found!");
	}

	/**
	 * @param id that we search the member that have same id that we enter
	 * @return that returns the member with that ID, it returns null if not found.
	 */
	public Person findMember(int id) {

		for (Person person : members) {
			if (person.getId() == id)
				return person;
		}
		return null;
	}
	/**
	 * getTotalNumMembers() : returns the number of members in a club<br>
	 * (coaches, players and chairperson)
	 * @return the number of members the number in a club of type String
	 */
	public String getTotalNumMembers() {
		return "The total number of persons in Club "+ this.getName()+": "+ (this.members.size() + 1);
	}

	/**
	 * addSport(Sport sport) : that adds a sport to the sports list.<br>
	 * @param sport : Sport value that represents a new sport
	 */
	public void addSport(Sport sport) {
		sports.add(sport);
	}

	/**
	 *  displayMemebers(): that displays all the information about the members
	 */
	public void displayMemebers() {
		System.out.printf("Members of this Club: \n");
		for (Person person : members) {
			System.out.println(person);
		}
	}

	/**
	 * displaySports() : that displays all the information about the sports
	 */
	public void displaySports() {
		System.out.printf("Sports of this Club: \n");
		for (Sport sport : sports) {
			System.out.println(sport);
		}
	}

	/**
	 * a toString() method that returns a formatted String that contains the <br>
	 * club information( name, city and chairperson)<br>
	 * the chairperson's information have been called through "chairperson.toString()"
	 */
	@Override
	public String toString() {
		return "Club info:\n\tClub Name = " + name + "\n\tCity = " + city + "\n\t" + chairperson.toString();

	}

}
