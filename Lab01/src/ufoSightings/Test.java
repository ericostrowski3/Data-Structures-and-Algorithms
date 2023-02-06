package ufoSightings;
import java.util.Scanner;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException {
		File sightings = new File("ufoSightings.csv");
		Scanner inputFile = new Scanner(sightings);
		inputFile.nextLine();
		
		int line = 0;
		
		int highestDuration = 0;
		int lineOfHighestDuration = 0;
		//cant initialize lowest lat at 0 because its possible all sightings happened in northern hemisphere.  So we initialize at 91.0, 1 above the highest possible latitude
		double lowestLat = 91.0;
		int lineOfLowestLat = 0;
		//While loop to complete objectives for each 
		while (inputFile.hasNextLine()) {
			String fileLine = inputFile.nextLine();
			UFOSighting test = new UFOSighting(fileLine);
			
			// increment i to count the lines of data
			line++;
			
			//Use a simple if statement to store highest duration value and which line of data it takes place in
			
			
			if (test.getDuration() > highestDuration) {
				highestDuration = test.getDuration();
				lineOfHighestDuration = line;
			}
			
			//Find and store lowest latitude value and which line it takes place 
			if (lowestLat > test.getLatitude()) {
				lowestLat = test.getLatitude();
				lineOfLowestLat = line;
			}
			
		}
		System.out.println("There were " + line + " lines of data");
		System.out.println("The longest duration of a sighting was " + highestDuration + " seconds long and occured in data set " + lineOfHighestDuration);
		System.out.println("The lowest latitude of a sighting was at " + lowestLat + " and occured in data set " + lineOfLowestLat);


	}

}
