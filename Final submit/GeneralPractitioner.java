package src;
public class GeneralPractitioner extends HealthProfessional {
    String PhoneNumber;

    // Default constructor
    public GeneralPractitioner() {
    }
    // A constructor with arguments
    public GeneralPractitioner(int ID, String name, String email, String PhoneNumber) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }
    //Method for printing details
    public void printMessage(){
        super.printMessage();
        System.out.println("Phone Number: " + PhoneNumber);
    }
}