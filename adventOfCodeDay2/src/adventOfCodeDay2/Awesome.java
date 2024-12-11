package adventOfCodeDay2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;


public class Awesome {
	
	public static int save = 1;
	
	public static boolean increasing(String[] list) {

		for(int i = 1; i < list.length;i++) {
			
			//check if it doesnt meet requirements, exit right away
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);

			if(el1 <= el0) {
				if(save != 1) {
				return false;
				}else {
				save++;
				}
			}
			else if(el1 - el0 > 3) 
			{ //if the diff is > 3
				if(save != 1) {
				return false;
				}else {
					save++;
					}
			}
			
		}
		
		//if make out without false
		save = 1;
		return true;
		
	}
	
	
	
	
	
	
	
	public static boolean decreasing(String[] list) {
		
		for(int i = 1; i < list.length;i++) {
			
			//check if it doesnt meet requirements, exit right away
			int el1 = Integer.valueOf(list[i]);
			int el0 = Integer.valueOf(list[i-1]);

			if(el1 >= el0) {
				if(save != 1) {
				return false;
				}else {
					save++;
					}
			}
			else if(el0 - el1 > 3) 
			{ //if the diff is > 3
				if(save != 1) {
				return false;
				}else {
					save++;
					}
			}
			
			
		}
		save = 1;
		//if make out without false
		return true;
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		// Set up the file - make sure the file
		// is in your project
		
		File file = new File("input2.txt");
		


		try {

			Scanner scan = new Scanner(file);
			int count = 0;
			
			
			while(scan.hasNext()) {
				
				
				//grab 1 line
				String line = scan.nextLine();
				
			
		
		
				//split the line into a string array
				
				String[] elements = line.split(" ");
				
				
				if(increasing(elements) || decreasing(elements)) {
					count++;
					
					
				}else {
					
					System.out.println(Arrays.toString(elements));
				}
				
				
			}
			
			System.out.println(count);
			

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		

	}

}