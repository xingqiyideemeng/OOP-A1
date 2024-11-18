public class GeneralPractitioner extends HealthProfessional {
    String phoneNumber;


    public GeneralPractitioner() {
    }

    public GeneralPractitioner(int ID, String name, String email, String phoneNumber) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void printMessage(){
        super.printMessage();
        System.out.println("Phone Number: " + phoneNumber);
    }
}
