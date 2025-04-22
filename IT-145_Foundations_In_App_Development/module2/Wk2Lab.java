/*
 * 2-2 zyBooks Lab Activity 2.17
 * Wk2Lab.java
 * 
 * Nicholas Shaner
 * Southern New Hampshire University
 * IT-145 Foundation in App Development
 * Dr. Vivian Lyon
 * Due: 1/21/2024
 * 
 */
package module2;

import java.util.Scanner;

public class Wk2Lab {
   
   public static double drivingCost(double milesPerGallon, 
      double dollarsPerGallon, double milesDriven) {
         double totalCost;
         
         totalCost = (milesDriven / milesPerGallon) * dollarsPerGallon;
         return totalCost;
	}
   
   public static void main(String[] args) {
      double milesPerGallon;
      double dollarsPerGallon;
      double costPerDistance10;
      double costPerDistance50;
      double costPerDistance400;
      Scanner scnr = new Scanner(System.in);
      
      dollarsPerGallon = scnr.nextDouble();
      milesPerGallon = scnr.nextDouble();
      
      costPerDistance10 = drivingCost(milesPerGallon, dollarsPerGallon, 10);
      costPerDistance50 = drivingCost(milesPerGallon, dollarsPerGallon, 50);
      costPerDistance400 = drivingCost(milesPerGallon, dollarsPerGallon, 400);
      
      System.out.printf("%.2f", costPerDistance10);
      System.out.print(" ");
      System.out.printf("%.2f", costPerDistance50);
      System.out.print(" ");
      System.out.printf("%.2f\n", costPerDistance400);
   }
}