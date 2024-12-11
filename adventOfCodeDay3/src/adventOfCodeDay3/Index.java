package adventOfCodeDay3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;


public class Index {
	
	
	

	public static void main(String[] args) {
		

		// is in your project
		
		File file = new File("input4.txt");
		


		try {

			Scanner scan = new Scanner(file);
			int count = 0;
			
			
			while(scan.hasNext()) {
				
				
				//grab 1 line
				System.out.println(scan.next());
				System.out.println("---------------");
			
		
		
				//split the line into a string array
				
				
				
			}
			
			System.out.println(count);
			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		

	}

}