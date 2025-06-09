package model;

import java.io.Serializable;

/**
 * @author Islam/202004552, Anfal/201804370, Alreem/201901898 <br>
 * <br>Created on 05/11/2021
 * @version 1.0
 *
 */
public class Coach extends Person  implements Serializable{
	private String speciality;

	/**
	 * @param id:          The ID number of the coach
	 * @param name:        The name of the coach
	 * @param gender:      The gender of the coach
	 * @param nationality: The nationality of the coach
	 * @param mobileNo:    The mobile number of the coach
	 * @param speciality:  The speciality of the coach
	 */
	public Coach(int id, String name, Gender gender, String nationality, String mobileNo, String speciality) {
		super(id, name, gender, nationality, mobileNo);
		this.speciality = speciality;
	}

	/**
	 * @return The speciality of the coach of type String
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * this method sets the speciality field for Coach object
	 * @param speciality: string value that represents the speciality of the coach
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 *  * a toString() method that returns a formatted String that returns<br>
	 * the coach information:(the class name, ID, name, gender, nationality, mobile number, speciality)<br>
	 * these instances: ID, name, gender, nationality, mobile number have been called <br>
	 * from the superclass Person by using "super.toString()"

	 */
	public String toString() {
		String className = getClass().getSimpleName();
		return className + " : " + super.toString() + "\t" + " Speciality: " + speciality;
	}
}
