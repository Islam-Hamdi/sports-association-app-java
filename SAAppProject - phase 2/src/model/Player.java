package model;

import java.io.Serializable;

/**
 * @author Islam/202004552, Anfal/201804370, Alreem/201901898 
 * <br>Created on 05/11/2021
 * @version 1.0
 *
 */
public class Player extends Person implements Serializable{
	private Sport sport;
	private int rating;

	/**
	 * @param id:          The ID number of the player
	 * @param name:        The name of the player
	 * @param gender:      The gender of the player
	 * @param nationality: The nationality of the player
	 * @param mobileNo:    The mobile number of the player
	 * @param sport:       The sport name in which the player plays
	 * @param rating:      The rating of the player
	 */
	public Player(int id, String name, Gender gender, String nationality, String mobileNo, Sport sport, int rating) {
		super(id, name, gender, nationality, mobileNo);
		this.sport = sport;
		this.rating = rating;
	}

	/**
	 * @return The sport of the player of type Sport
	 */
	public Sport getSport() {
		return sport;
	}

	/**
	 * this method sets the sport field for Player object
	 * @param sport: Sport value that represents the sport of the player
	 *
	 */
	public void setSport(Sport sport) {
		this.sport = sport;
	}

	/**
	 * @return The rating of the player of type int
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * this method sets the sport field for Player object
	 * 
	 * @param rating: int value that represents the rating of the player
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * a toString() method that returns a formatted String that returns<br>
	 * the player's class name, ID, name, gender, nationality , mobile number,sport and rating<br>
	 * these instances: ID, name, gender, nationality, mobile number have been called <br>
	 * from the superclass Person by using "super.toString()"
	 */
	@Override
	public String toString() {
		String className = getClass().getSimpleName();

		return className + ": " + super.toString() + "\tSport: " + sport.getName() + "\tRating: " + rating;
	}
}
