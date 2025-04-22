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

import java.util.Scanner;

public class CountingChar{
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
   
      userText = scnr.nextLine();  // Gets entire line, including spaces. 
      
      //replace functions to replace all instances of requested chars. 
      userText = userText.replace(" ", "");  //replace space with no-space
      userText = userText.replace(".", "");  //replace period with no-space
      userText = userText.replace("!", "");  //replace exclamation with no-space
      userText = userText.replace(",", "");  // replace comma with no-space
      
      System.out.println(userText.length());  //prints length of userText after modification made
      
   }
}

