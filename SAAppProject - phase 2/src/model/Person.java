package model;

import java.io.Serializable;

/**
 * @author Islam/......... <br>
 *          Created on 05/11/2021
 * @version 1.0
 */
public abstract class Person implements Serializable {
	private int id;
	private String name;
	private Gender gender;
	private String nationality;
	private String mobileNo;

	/**
	 * @param id:          The ID number of the person
	 * @param name:        The name of the person
	 * @param gender:      The gender of the person
	 * @param nationality: The nationality of the person
	 * @param mobileNo:    The mobile number of the person
	 */
	public Person(int id, String name, Gender gender, String nationality, String mobileNo) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.mobileNo = mobileNo;
	}

	/**
	 * @return The ID of the person of type int
	 */
	public int getId() {
		return id;
	}

	/**
	 * this method sets the id field
	 * @param id: int value that represents the id of the person
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return The name of the person of type String
	 */
	public String getName() {
		return name;
	}

	/**
	 * this method sets the name field
	 * @param name: string value that represents the name of the person
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The gender of the person of type Gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * this method sets the gender field
	 * @param gender: Gender value that represents the name of the person
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return The Nationality of the person of type String
	 */
	public String getNationality() {
		return nationality;
	}

	/***
	 * this method sets the nationality field
	 * 
	 * @param nationality: string value that represents the nationality of the person
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	/**
	 * @return The mobile number of the person of type String
	 */
	public String getMobileNo() {
		return mobileNo;
	}

	/***
	 * this method sets the mobileNo field
	 * @param mobileNo :string value that represents the mobile number of the person
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	/**
	 * a toString() method that returns a formatted String that returns<br>
	 * the perosn's ID, name, gender, nationality and mobile number.
	 */
	public String toString() {
		return "ID: " + id + "\tName: " + name + "\tGender: " + gender + "\tNationality: " + nationality
				+ "\tMobile No: " + mobileNo;
	}

}
