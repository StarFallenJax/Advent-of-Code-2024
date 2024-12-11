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
	 */
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
	
	
	
	

	public static void main(String[] args) {
		

		// is in your project
		
		File file = new File("input4.txt");
		


		try {

			Scanner scan = new Scanner(file);
			int count = 0;
			
			
			while(scan.hasNext()) {
				
				
				//grab 1 line
			
				
				String line = scan.next();
				String regex = "mul\\((\\d+),(\\d+)\\)";
				
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(line);
				
				List<String> validCalls = new ArrayList<>();
				
				while(matcher.find()) {
					
					validCalls.add(matcher.group());
					
					
					
				}
				
				System.out.println("Valid 'mul' calls:");
				for(String call : validCalls) {
					System.out.println(call);
				}
		
		
				//split the line into a string array
				
				
				
			}
			
			scan.close();
	
			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		

	}

}