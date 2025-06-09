package model;
/**
 * @author Islam/......... <br>
 *          Created on 05/11/2021
 * @version 1.0
 */
public class Sport {
	private String name;
	private String webSite;
	
	/**
	 * @param name    : the name of the sport
	 * @param webSite : the website of the sport
	 */
	public Sport(String name, String webSite) {
		this.name = name;
		this.webSite = webSite;
	}
	
	/**
	 * @return the name of the sport of type String
	 */
	public String getName() {
		return name;
	}
	/**
	 * this method sets the name field for Sport object
	 * @param name: string value that represents the name of the sport
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the website of the sport of type String
	 */
	public String getWebSite() {
		return webSite;
	}
	/**
	 * this method sets the website field for Sport object
	 * @param website : string value that represents the website of the sport
	 */
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	
	/**
	 * a toString() method that returns a formatted String that contains the <br>
	 * Sport object information : name and website
	 */
	@Override
	public String toString() {
		return "Sport Name : " + name + "\tWebsite : " + webSite ;
	}

}
