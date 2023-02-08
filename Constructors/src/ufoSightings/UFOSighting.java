package ufoSightings;
import java.io.*;
import java.util.*;



// Creating the class UFOSighting which will contain the two contstructors, the getters and setters, and the ToString method
public class UFOSighting implements Comparable<UFOSighting> {
	
	protected String dateTime;
	protected String city;
	protected String state;
	protected String country;
	protected String shape;
	protected int duration;
	protected String durationDescr;
	protected String comments;
	protected String datePosted;
	protected double latitude;
	protected double longitude;
	//Constructor 1 that takes in all pieces of data as parameters
	public UFOSighting(String dateTimeFinal, String cityFinal, String stateFinal, String countryFinal, String shapeFinal, int durationFinal, String durationDescrFinal, String commentsFinal, String datePostedFinal, double latitudeFinal, double longitudeFinal) {
		dateTime = dateTimeFinal;
		city = cityFinal;
		state = stateFinal;
		country = countryFinal;
		shape = shapeFinal;
		duration = durationFinal;
		durationDescr = durationDescrFinal;
		comments = commentsFinal;
		datePosted = datePostedFinal;
		latitude = latitudeFinal;
		longitude = longitudeFinal;
	}
	
	

	public String getDateTime() {
		return dateTime;
	}



	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getShape() {
		return shape;
	}



	public void setShape(String shape) {
		this.shape = shape;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public String getDurationDescr() {
		return durationDescr;
	}



	public void setDurationDescr(String durationDescr) {
		this.durationDescr = durationDescr;
	}



	public String getComments() {
		return comments;
	}



	public void setComments(String comments) {
		this.comments = comments;
	}



	public String getDatePosted() {
		return datePosted;
	}



	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}



	public double getLatitude() {
		return latitude;
	}



	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}



	public double getLongitude() {
		return longitude;
	}



	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


// Constructor 2 that takes in a String line from the input file.  The file and scanner will be opened and created in the main class
	public UFOSighting(String line) {
		String[] values = line.split(",");
		dateTime = values[0];
		city = values[1];
		state = values[2];
		country = values[3];
		shape = values[4];
		duration = (int)(double)(Double.parseDouble(values[5]));
		durationDescr = values[6];
		comments = values[7];
		datePosted = values[8];
		latitude = Double.parseDouble(values[9]);		
		longitude = Double.parseDouble(values[10]);	
	}
	// the toString method that takes advantage of getters to return a string type of the object
	public String toString() {
		return "Date: " + this.getDateTime() + " City: " + this.getCity() + " State: " + this.getState() + " Country: " + this.getCountry() + " Shape: " + this.getShape() + " Duration (seconds): " + this.getDuration() + " Duration Description: " + this.getDurationDescr() + " Comments: " + this.getComments() + " Date Posted: " + this.getDatePosted() + " Latitude: " + this.getLatitude() + " Longitude: " + this.getLongitude();
	}
	
			
		
	
	public int compareTo(UFOSighting other) {
		return this.getCity().compareTo(other.getCity());
	}
	
	public boolean equals(UFOSighting other) {
		return this.getCity().equals(other.getCity());
	}
	
	public boolean equalsIgnoreCase(UFOSighting other) {
		return this.getCity().equalsIgnoreCase(other.getCity());
	}
}
		
		
		
		
		
		
		
		
		//File sightings = new File("ufoSightinsShort.csv");
		//Scanner inputFile = new Scanner(sightings);
		//String line = inputFile.nextLine();
		//String[] values = line.split(",");
		


