package module5;
/********************
 * IT-145 5-3 xyBooks Lab Activities
 * DrawHalfArrow.java
 * 
 * Nicholas Shaner
 * SNHU
 * IT-145-X3343 Found in App Development 23EW3
 * Dr. Vivian Lyon
 * February 10, 2024
 * 
 * ******************/

public class ItemToPurchase {
   /*
	* The following are instance field variables, 
	* Private to the ItemsToPurchase class
	*/
   private String itemName;
   private int itemPrice;
   private int itemQuantity;  
   /*
    * The following are default Constructors
    */
   public ItemToPurchase() { 
      this.itemName = "none";
      this.itemPrice = 0;
      this.itemQuantity = 0;

    }
   /*
    * public member methods (mutators)
    */
   public void setName(String itemName) {
	   this.itemName = itemName;
   }
   public void setPrice(int itemPrice) {
	   this.itemPrice = itemPrice;
   }
   public void setQuantity(int itemQuantity) {
	   this.itemQuantity = itemQuantity;
   }
   /*
    * public member methods (accessors)
    */
   public String getName() {
	   return itemName;
   }
   public int getPrice() {
	   return itemPrice;
   }
   public int getQuantity() {
	   return itemQuantity;
   }
   
   //print item to purchase
   public void printItemPurchase() {
      System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice +  
                     " = $" + (itemPrice * itemQuantity));
   }
}


