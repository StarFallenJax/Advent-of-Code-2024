package adventOfCodeDay3;
import java.io.File;
import java.util.regex.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;


public class Index {
	
	
	/*
	 * Extract the next mult command from the given line
	 *
	 * Returns an empty string if none exists
	 
	public String extractMult(String line) {
		
		if(line.indexOf("mul") == -1) 
		{
			return ""; 							//not a valid command found in line :>
		}
		else
		{
			int start = line.indexOf("mul");
			int end = line.indexOf(")");
			
			//STOP! if there is no closing ")" then
			//this is not the one we want :>
			
			return line.substring(start,end);
		}
	}
*/	
	
	
	

	public static void main(String[] args) {
        // The file where your input data is stored
        File file = new File("input4.txt");

        try {
            Scanner scan = new Scanner(file);
            long totalSum = 0;  // Use long to handle large numbers

            // Loop through each line in the file
            while (scan.hasNextLine()) {
                String line = scan.nextLine();  // Read the entire line
                String regex = "mul\\((\\d+),(\\d+)\\)";  // Regular expression to find mul(X,Y)

                // Create a matcher to find mul(X,Y) patterns
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(line);

                // Loop through all matches of mul(X,Y) in the line
                while (matcher.find()) {
                    // Extract the values of X and Y from the match
                    int X = Integer.parseInt(matcher.group(1));
                    int Y = Integer.parseInt(matcher.group(2));

                    // Calculate the product and add it to the total sum
                    totalSum += (long) X * Y;  // Use long to handle potential overflow

                    // Optional: print each multiplication and sum
                    System.out.println("Found: mul(" + X + "," + Y + ") = " + (X * Y));
                }
            }

            // After processing all lines, print the total sum
            System.out.println("Total sum of all multiplications: " + totalSum);

            // Close the scanner
            scan.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}