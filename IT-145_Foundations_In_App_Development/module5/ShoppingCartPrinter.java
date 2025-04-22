package module5;
/********************
 * IT-145 5-3 xyBooks Lab Activities
 * ShoppingCartPrinter.java
 * 
 * Nicholas Shaner
 * SNHU
 * IT-145-X3343 Found in App Development 23EW3
 * Dr. Vivian Lyon
 * February 10, 2024
 * 
 * ******************/
	
//import Scanner utility from java library
import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
	   
	  // Scanner object created for user input
      Scanner scnr = new Scanner(System.in);
	     int i = 0;
	     String productName;
	     int productPrice = 0;
	     int productQuantity = 0;
	     int cartTotal;
	 
         ItemToPurchase item1 = new ItemToPurchase();
	     ItemToPurchase item2 = new ItemToPurchase();

	      // Get item 1 details from user, create itemToPurchase object
	     System.out.println("Item 1");
	     System.out.println("Enter the item name: ");
	      productName = scnr.nextLine();  //user input for name of item1
	      item1.setName(productName);  // set user input to item1
	      System.out.println("Enter the item price: ");
	      productPrice = scnr.nextInt();  // user input for price of item1
	      item1.setPrice(productPrice);  //set user input to item1
	      System.out.println("Enter the item quantity: ");
	      productQuantity = scnr.nextInt();  //user input for Quantity of item1
	      item1.setQuantity(productQuantity);  //set user input for item1
	      scnr.nextLine();
	      
	      
	      // Get item 2 details from user, create itemToPurchase object
	      System.out.println("\nItem 2");
	      System.out.println("Enter the item name: ");
	      productName = scnr.nextLine();  //user input for name of item2
	      item2.setName(productName);  // set user input to item2
	      System.out.println("Enter the item price: ");
	      productPrice = scnr.nextInt();  // user input for price of item2
	      item2.setPrice(productPrice);  //set user input to item2
	      System.out.println("Enter the item quantity: ");
	      productQuantity = scnr.nextInt();  //user input for Quantity of item2
	      item2.setQuantity(productQuantity);  //set user input for item2

	      
	      i = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
	      cartTotal = i;

	      System.out.println("\nTOTAL COST");
	      item1.printItemPurchase();
	      item2.printItemPurchase();
	      System.out.println("\nTotal: $" + i);
	      
	      // Add costs of two items and print total
	      // cartTotal = item one price + item two price
	      // Total Cost
	      // item one information
	      // item two information
	      // Total output
	      
	      return;
   }


	
}
