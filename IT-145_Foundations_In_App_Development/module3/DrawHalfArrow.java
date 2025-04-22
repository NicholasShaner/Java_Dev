package module3;

/********************
 * IT-145 3-3 xyBooks Lab Activities
 * DrawHalfArrow.java
 * 
 * Nicholas Shaner
 * SNHU
 * IT-145-X3343 Found in App Development 23EW3
 * Dr. Vivian Lyon
 * January 28, 2024
 * 
 * ******************/
 
import java.util.Scanner;  //import scanner utility from java library

// class created by assignment to out a downward facing half arrow of *s
public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);  //create scanner object
      int arrowBaseHeight;  //declared variable for height of arrow base/shaft
      int arrowBaseWidth;  //declared variable for width of arrow base/shaft
      int arrowHeadWidth;  //declared variable for width of arrow head at widest point (base of arrow)
      
      //request user input for an int height of the arrow base
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      
      //request user input for int width of arrow base
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();
      
      //request user input for int width of arrow head
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      
      
      //user input verification loop created for step 4. continually iterates until expression is satisfied
      while (arrowHeadWidth <= arrowBaseWidth) {
         System.out.println("Enter arrow head width:");
         arrowHeadWidth = scnr.nextInt();
      }
      //println moved from original arrowHeadWidth input to after while loop to remove unwanted whitespacing
      System.out.println("");
      
      //temporary variables declared for iteration purpose only
      int row;
      int colm;
      
      // for loop iteration steps 1 & 2. evaluates number of *s wide by *s long
      for (row = arrowBaseHeight; row >0; --row ) {
    	  for (colm = arrowBaseWidth; colm > 0; --colm) {
    		  System.out.print('*');
    	  }
    	  System.out.println();
      }
      
      // for loop iteration step 3. evaluates the width of arrow head and decrements measurement for effect
      for (row = arrowHeadWidth; row > 0; --row) {
    	  for (colm = row; colm > 0; --colm) {
    		  System.out.print('*');
    	  }
    	  System.out.println();
      }
   }
}