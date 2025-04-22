package wk5milestone2;

/*
 * declare class and extend to RescueAnimal as instructed.
 * all attributes from RescueAnimal will be inherited by Monkey class
 */
public class Monkey extends RescueAnimal {
	

 
	    // Instance variable specific to monkey class only
   private String species;
   private String tailLength;
   private String height;
   private String bodyLength;
   

 
	    // Monkey class Constructor, removed "breed" as replaced by species
   public Monkey(String name, String species, String gender, String age,
      String weight, String height, String tailLength, String bodylength,
	  String acquisitionDate, String acquisitionCountry,String trainingStatus,
	  boolean reserved, String inServiceCountry) {

       setName(name);
       setSpecies(species);
       setGender(gender);
       setAge(age);
       setWeight(weight);
       setHeight(height);
       setTailLength(tailLength);
       setBodyLength(bodyLength);
       setAcquisitionDate(acquisitionDate);
       setAcquisitionLocation(acquisitionCountry);
       setTrainingStatus(trainingStatus);
       setReserved(reserved);
       setInServiceCountry(inServiceCountry);

    }

	  // Mutator Methods for monkeyList
	  public void setSpecies(String monkeySpecies) {
	      this.species = monkeySpecies;
	  }
	  public void setTailLength(String tailLength) {
		  this.tailLength = tailLength;
	  }
	  public void setHeight(String height) {
		  this.height = height;
	  }
	  public void setBodyLength(String bodyLength) {
		  this.bodyLength = bodyLength;
	  }
	  
	  
	    // Accessor Method for monkeyList
	  public String getSpecies() {
	      return species;
	  }
	  public String getTailLength() {
		  return tailLength;
	  }
	  public String getHeight() {
		  return height;
	  }
	  public String getBodyLength() {
		  return bodyLength;
	  }



	}
