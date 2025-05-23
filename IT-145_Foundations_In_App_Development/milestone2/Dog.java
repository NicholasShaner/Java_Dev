package wk5milestone2;

public class Dog extends RescueAnimal {

    public static String getTrainingStatus = "intake";
	// Instance variable
    private String breed;

    // Constructor
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }
    // Accessor Method
    public String getBreed() {
        return breed;
    }



}
