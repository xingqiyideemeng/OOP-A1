public class Specialist extends HealthProfessional {
    String age;


    public Specialist() {
    }


    public Specialist(int ID,String name, String email, String age){
        this.ID= ID;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public void printMessage() {
        super.printMessage();
        System.out.println("Doctor Age: "+age);
    }
}
