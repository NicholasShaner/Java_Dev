package wk5milestone2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Driver extends RescueAnimal {
   private static ArrayList<Dog> dogList = new ArrayList<Dog>();
   private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
   
   /*
	* ArrayList created of approved money species,
	* to be used for input validation during intake
	*/
   public static List<Object> monkeyKind = new ArrayList<Object> (List.of("Guenon", "Macaque",
		   "Marmoset", "Squirrel Monkey", "Tamarin"));
   /*
    * Create Public scnr Object for user input
    * */
   public static Scanner scnr = new Scanner(System.in);
   static String menuOpt;
   
   public static void main(String[] args) {
   
	  displayMenu();
      //String menuOpt = scnr.nextLine();

      initializeDogList();
      initializeMonkeyList();
      while (menuOpt != "q") {
	     String menuOpt = scnr.nextLine();
         switch (menuOpt) {
            case "1":
        	   intakeNewDog();
	           break;
            case "2":
        	   intakeNewMonkey();
        	   break;
            case "3":
        	   reserveAnimal();
        	   break;
            case "4":
        	   printAnimals("4");
        	   break;
            case "5":
        	   printAnimals("5");
        	   break;
            case "6":
        	   printAnimals("6");
        	   break;
            case "q":
        	   System.out.println("Thank you, goodbye!");
        	   System.exit(0);
            case "Q":
         	   System.out.println("Thank you, goodbye!");
         	   System.exit(0);
            default:
		       System.out.println("Try another selection.");		    
         }
      }
         
   }


        

    // This method prints the menu options
   public static void displayMenu() {
      System.out.println("\n\n");
      System.out.println("\t\t\t\tRescue Animal System Menu");
      System.out.println("[1] Intake a new dog");
      System.out.println("[2] Intake a new monkey");
      System.out.println("[3] Reserve an animal");
      System.out.println("[4] Print a list of all dogs");
      System.out.println("[5] Print a list of all monkeys");
      System.out.println("[6] Print a list of all animals that are not reserved");
      System.out.println("[q] Quit application");
      System.out.println();
      System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", null, null, null, false, "United States");
        Monkey monkey2 = new Monkey("Rex", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", null, null, null, false, "United States");
        
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog() {
        System.out.println("What is the dog's name?");
        String name = scnr.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
            else {
                System.out.println("What is the dog's breed?");
                String breed = scnr.nextLine();
                
                System.out.println("What is the dog's gender?");
                String gender = scnr.nextLine();
                
                System.out.println("What is the dog's age?");
                String age = scnr.nextLine();
                
                System.out.println("What is the dog's weight?");
                String weight = scnr.nextLine();
                
                System.out.println("When was this dog acquired?");
                String acquisitionDate = scnr.nextLine();
                
                System.out.println("Which country was this dog acquired?");
                String acquisitionCountry = scnr.nextLine();
                
                System.out.println("What is the dog's training status?");
                String trainingStatus = scnr.nextLine();
                
                System.out.println("Is this dog reserved?");
                boolean reserved = scnr.nextBoolean();
                
                System.out.println("Which country is the dog in service?");
                String inServiceCountry = scnr.nextLine();
                
                Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, 
                trainingStatus, reserved, inServiceCountry);
                dogList.add(newDog);
                System.out.println("Your entry has been added to the dog list.");
            }
        }
    }

        /*
         *  Completed intakeNewMonkey method. instantiate appropriated attributes,
         *  and created loops to perform necessary input validation for name, 
         *  and species 
         */
	//
        public static void intakeNewMonkey() {
        	System.out.println("What is the monkey's name?");
            String name = scnr.nextLine();
            for(Monkey monkey: monkeyList) {
               if(monkey.getName().equalsIgnoreCase(name)) {
                   System.out.println("\n\nThis monkey is already in our system\n\n");
                   continue; //returns to menu
               }
               else {
               	System.out.println("welcome, " + name + "!");
                	
               }
            }
            System.out.println("What is your monkey's species: ");
            System.out.println("Currently we are only accepting " + monkeyKind);
      	    String species = scnr.nextLine();
      	    if (monkeyKind.contains(species)) {
      	    	System.out.println("Great! We are accepting that species of monkey");
      	    }
      	    else {
      	    	System.out.println("I'm sorry, we are currently only accepting certain"
      	    			+ "species of monkey.");
      	    	System.exit(0);
      	    }
      	    
            System.out.println("What is your monkey's gender: ");
            String gender = scnr.nextLine();
        	  
    	    System.out.println("What is your monkey's age: ");
    	    String age = scnr.nextLine();
    	  
    	    System.out.println("What is your monkey's weight: ");
    	    String weight = scnr.nextLine();
    	  
    	    System.out.println("What is your monkey's height: ");
    	    String height = scnr.nextLine();
    	    
    	    System.out.println("What is your monkey's tail length: ");
    	    String tailLength = scnr.nextLine();
    	    
    	    System.out.println("What is your monkey's body length: ");
    	    String bodyLength = scnr.nextLine();
    	    
    	    System.out.println("What date did you aquire your monkey: ");
    	    String acquisitionDate = scnr.nextLine();
    	    
    	    System.out.println("What country did you aquire your monkey from: ");
    	    String acquisitionCountry = scnr.nextLine();
    	    
    	    String trainingStatus = "intake";
    	    Boolean reserved = false;
    	    String inServiceCountry = "null";
    	    
    	    Monkey newMonkey = new Monkey(name, species, gender, age, weight, height, tailLength,
    	           bodyLength, acquisitionDate, acquisitionCountry, trainingStatus,
    	 		   reserved, inServiceCountry);
    	    monkeyList.add(newMonkey);
    	    System.out.println("Complete");
    	    
         } 
            
        

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal() {
           System.out.println("Enter animal type: ");
           String animalType = scnr.nextLine();
           if (animalType.equalsIgnoreCase("Monkey")) {
              System.out.println("Enter the monkey's name: ");
              String mName = scnr.nextLine();
              for(Monkey monkey: monkeyList) {
                 if(monkey.getName().equalsIgnoreCase(mName)) {
                    monkey.setReserved(true);
                    System.out.println("This monkey is now reserved.");
                    return;
                  }
              }
                System.out.println("The monkey entered is not in the list");
            }
           
            else if (animalType.equalsIgnoreCase("Dog")) {
               System.out.println("Enter the dog's name: ");
               String dName = scnr.nextLine();
               for(Dog dog: dogList){
                  if(dog.getAcquisitionLocation().equalsIgnoreCase(dName)){
                     dog.setReserved(true);
                        System.out.println("This dog is now reserved.");
                        return;
                  }

               }
                System.out.println("The dog entered is not in the list");
                }  
            else {
               System.out.println("Type not found");
            }
            

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String menuOpt) {
        	String tempHold;
        	if (menuOpt == "4") {
        		for (Dog getName: dogList) {
        			tempHold = getName.toString();
        		System.out.println(tempHold);
        		}
        	}
        		
        	else if (menuOpt == "5") {
        		for (Monkey getName: monkeyList) {
        			tempHold = getName.toString();
        			System.out.println(tempHold);
        		}
        	}
        	else if (menuOpt == "6") {
        		for (int i = 0; i < dogList.size(); i++) {
					if (Dog.getTrainingStatus.equals("in service") &&
        					dogList.get(i).getReserved() == false) {
						tempHold = dogList.get(i).toString();
        				System.out.println(tempHold);
        			}
        		}
        		for (int i = 0; i < monkeyList.size(); ++i) {
					if (Monkey.getTrainingStatus().equals("in service") &&
        					monkeyList.get(i).getReserved() == false) {
						tempHold = monkeyList.get(i).toString();
        				System.out.println(monkeyList.get(i));
        			}
        		}
        	}

        }
}

