package module6;
/********************
 * IT-145 6-6 xyBooks Lab Activities
 * DrawHalfArrow.java
 * 
 * Nicholas Shaner
 * SNHU
 * IT-145-X3343 Found in App Development 23EW3
 * Dr. Vivian Lyon
 * February 18, 2024
 * 
 * ******************/
import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);  //creates Scanner object
      Scanner inSS = null;  // creates input string stream (inSS)
      String firstWord;  //declared variable for first name
      String lastWord;  //declared variable for last name
      String userStr;  //declared variable for user entered string
      Boolean strDone = false;  //declared boolean for while loop iteration
      
      while (!strDone) {  //wile loop to iterate until user initiates exit
         System.out.println("Enter input string: ");  //direction print statement
         userStr = scnr.nextLine();  //user input
         
         if (userStr.equals("q") || userStr.equals("Q")) {  //defined exit loop ("q" to quit)
        	 strDone = true;  //sets boolean to true
        	 break;  //exits loop/terminates class
         }
         if (!userStr.contains(",")) {  //user entry verification loop for required ","
        	 System.out.println("Error: No comma in string");  //reminds user to input requirement
        	 continue;  //restarts loop
         }
         
         /* 
          * else iteration, replaces all comma with space.
          *  Placed after input verification statement so not to receive false negative 
          */
         else {userStr = userStr.replaceAll(",", " ");
         }
         /*
          * if all criteria met run final if statement block
          */
         if (!userStr.equals("q") || !userStr.equals("Q")) {  
        	 inSS = new Scanner(userStr);  //create input string stream with user input
        	 firstWord = inSS.next();  //receives first string of input string stream
             firstWord = firstWord.trim();  //trims all whitespace before/after string
        	 lastWord = inSS.next();  //receives last string of input string stream
        	 lastWord = lastWord.trim();  //trims all whitespace before/after string
        	 
        	 //print statements for required output
        	 System.out.println("First word: " + firstWord);
        	 System.out.println("Second word: " + lastWord);
        	 System.out.println("\n");
         } 
      }
      return;  //return statement to rerun while loop until escape sequence obtained
      
   }
}