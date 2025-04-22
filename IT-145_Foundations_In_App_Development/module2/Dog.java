package module2;

/* * 2-3 Assignment: Write a Class
 * Dog.java
 * 
 * Nicholas Shaner
 * Southern New Hampshire University
 * IT-145 Foundation in App Development
 * Dr. Vivian Lyon
 * Due: 1/21/2024
 * 
 */


public class Dog {
   //Instance Fields
   private int dogSpaceNumber;
   private int dogWeight;
   private boolean grooming;
   
   // constructor
   // defaults set to explicit invalid values for easy recognition
   public Dog(int spaceNum, int weight, boolean groom) {  
	   spaceNum = -1;
	   weight = -1;
	   groom = false;
   }
   
   // mutators
   // allows modifying attributes with method call and user input
   public void setDogSpaceNumber(int spaceNum) {
	   dogSpaceNumber = spaceNum;  // 
   }
   public void setDogWeight(int weight) {
	   dogWeight = weight;
   }
   public void setGrooming(boolean groom) {
	   grooming = groom;
   }

   // Accessors
   // allows return of attribute values on request
   public int getDogSpaceNumber() {
	   return dogSpaceNumber;
   }
   public int getDogWeight () {
	   return dogWeight;
   }
   public boolean getGrooming () {
	   return grooming;
   }
}
