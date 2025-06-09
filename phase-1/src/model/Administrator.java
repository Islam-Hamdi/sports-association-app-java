package model;

import java.time.LocalDate;

/**
 * @author Islam/......... <br>
 *          Created on 05/11/2021
 * @version 1.0
 */

public class Administrator extends Person {
	private LocalDate date;

	/**
	 * @param id:          The ID number of the administrator
	 * @param name:        The name of the administrator
	 * @param gender:      The gender of the administrator
	 * @param nationality: The nationality of the administrator
	 * @param mobileNo:    The mobile number of the administrator
	 * @param date:        The date on which he/she became the chairperson
	 */
	public Administrator(int id, String name, Gender gender, String nationality, String mobileNo, LocalDate date) {
		super(id, name, gender, nationality, mobileNo);
		this.date = date;
	}

	/**
	 * @return The date on which he/she became the chairperson of type LocalDate
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * this method sets the date field for Administrator object
	 * @param date: LocalDate value that represents the date on which he/she became the chairperson
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * a toString() method that returns a formatted String that contains the <br>
	 * Chairperson's information:(ID, name, gender, nationality, mobile number, LocalDate)<br>
	 * these instances: ID, name, gender, nationality, mobile number have been called <br>
	 * from the superclass Person by using "super.toString()"
	 */
	@Override
	public String toString() {
		return "Chairperson's information =\n\t" + super.toString() + "\tFrom: " + date + "\n";
	}

}
