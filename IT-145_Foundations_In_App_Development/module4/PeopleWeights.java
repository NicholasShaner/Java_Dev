package module4;

/********************
 * IT-145 4-2 xyBooks Lab Activities
 * DrawHalfArrow.java
 * 
 * Nicholas Shaner
 * SNHU
 * IT-145-X3343 Found in App Development 23EW3
 * Dr. Vivian Lyon
 * February 3, 2024
 * 
 * ******************/

//import Scanner utility from java library
import java.util.Scanner;

public class PeopleWeights {

	public static void main(String[] args) {
		
		//create new scanner object named scnr
		Scanner scnr = new Scanner(System.in);
		
		//create new array named getWeight and allocate 5 elements 
		double[] getWeight = new double[5];
		
		//declare necessary variables for process and evaluations
		int i;
		double sum = 0.0;
		double maxWeight;
		
		/*for loop to request and store 5 user input 
		 * weights as doubles in array getWeight
		 */
		for (i= 0; i < getWeight.length; ++i) {
			System.out.println("Enter weight " + (i + 1) + ": ");
			getWeight[i] = scnr.nextDouble();
		}
		
		System.out.println();
		
		//for loop to iterate through array indices and print element values
		System.out.print("You entered: ");
		for (i=0; i < getWeight.length; i++) {
			System.out.print(getWeight[i] + " ");
		}
		
		System.out.println();
		
		//for loop iterate through array indices and calculate sum of getWeight elements
		for (i = 0; i < getWeight.length; ++i) {
			sum += getWeight[i];
		}
		
		/*for loop to iterate array elements and evaluate maximum 
		 * weight value entered and assign to maxWeight variable
		 */
		maxWeight = getWeight[0];
		for (i = 0; i < getWeight.length; ++i) {
			if (getWeight[i] > maxWeight) {
				maxWeight = getWeight[i];
			}
		}
		
		/*print statements to display calculated values of 
		 *Total weight, Average weight, and Maximum weight entered
		 */
		System.out.println("Total weight: " + sum);
		System.out.println("Average weight: " + sum/5);
		System.out.println("Max weight: " + maxWeight);
		return;
	}

}