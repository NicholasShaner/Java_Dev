package module6;

/********************
 * IT-145 6-3 Assignment
 * Paint1.java
 * 
 * Nicholas Shaner
 * SNHU
 * IT-145-X3343 Found in App Development 23EW3
 * Dr. Vivian Lyon
 * February 18, 2024
 * 
 * ******************/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /*
         * first error was initiating ALL double variable 
         * values as 0.0 causing error in output to always find 0 wallArea
         */
        double wallHeight = 0;
        double wallWidth = 0;
        double wallArea;
        double gallonsPaintNeeded;
        
        
        final double squareFeetPerGallons = 350.0;
        

        /*
         * Do-While loop to get wallHeight and verify user input range
         * Try-Catch to handle exception for invalid input and re-entry of input
         */
		do {
		    try {
		       System.out.println("Enter wall height (feet): ");
		       wallHeight = scnr.nextDouble();
		       if (wallHeight <= 0) {
		    	   System.out.println("Invalid height, must be more than 0");
		    	   continue;
		       }
		    }
		    /*
		     * Exception handling for any input NOT a double, to stop program termination and 
		     * request user input again
		     */
		    catch (InputMismatchException excpt) {
		    	System.out.println("Input must be a valid double!");
		    	scnr.nextLine();
		    }
		} while (wallHeight <= 0);
		
		/*
		 * Do-While loop to get wallWidth and verify acceptable user input range
		 * Try-Catch loop to handle exception for invalid input and re-entry of input
		 */
		do {    
		    try {
		       System.out.println("Enter wall width (feet): ");
		       /*
		        * second error corrected was mis-labeled variable for 
		        * width of wall. changed from wallHeight to wallWidth to correct
		        */
		       wallWidth = scnr.nextDouble();
		       if (wallWidth <= 0) {
		    	   System.out.println("Invalid width, input must be more than 0");
		    	   continue;
		       }
		    }
		    /*
		     * Exception handling for any input NOT a double, to stop program 
		     * termination and request input again.
		     */
		    catch (InputMismatchException excpt) {
		    	System.out.println("Input must be a valid double!");
		    	scnr.nextLine();
		    	
		    }
		} while (wallWidth <= 0);
		
		
	   // Calculate and output wall area
	   wallArea = wallHeight * wallWidth;
	   
	   System.out.println("\nWall area: " + wallArea + " square feet");
	
	   // Calculate and output the amount of paint (in gallons) needed to paint the wall
	   gallonsPaintNeeded = wallArea / squareFeetPerGallons;
	   
	   scnr.close();
	   /*
	    * Third error corrected, variable name not in proper format. 
	    * Changed gallonspaintneeded to gallonsPaintNeeeded to match declaration
	    */
	   System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
		   	       
    }
}
