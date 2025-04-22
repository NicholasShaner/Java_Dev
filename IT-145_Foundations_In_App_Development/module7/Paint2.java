package module7;

// Paint2.java

/********************
 * IT-145 7-3 Assignment: Using Java API Documentation
 * Pet.java
 * 
 * Nicholas Shaner
 * SNHU
 * IT-145-X3343 Found in App Development 23EW3
 * Dr. Vivian Lyon
 * February 25, 2024
 * 
 * ******************/

import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;


        // Prompt user to input wall's height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();


        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();
        
        scnr.close();

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:  " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        /*
         * Additional evaluation performed to determine number of cans of 
         * paint needed by utilizing the Math.ceil() method to round value 
         * of gallonsPaintNeeded to next greater whole number double
         */
        cansNeeded = Math.ceil(gallonsPaintNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
        
    }
}
