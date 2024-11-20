package src;
public class Surgeon extends HealthProfessional {
    String age;

    // Default constructor
    public Surgeon() {
    }

    // A constructor with arguments
    public Surgeon(int ID,String name, String email, String age){
        this.ID= ID;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    //Method for printing details
    @Override
    public void printMessage() {
        super.printMessage();
        System.out.println("Doctor Age: "+age);
    }
}