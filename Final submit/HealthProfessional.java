package src;
public class HealthProfessional {
    int ID;
    String name;
    String email; // Used to distinguish between different types of health professionals

    // Default constructor
    public HealthProfessional() {
    }

    // A constructor with arguments
    public HealthProfessional(int ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    //A way to print health professional details
    public void printMessage() {
        System.out.println("Doctor ID: "+ ID);
        System.out.println("Doctor Name: "+ name);
        System.out.println("Doctor Email: "+ email);
    }
}