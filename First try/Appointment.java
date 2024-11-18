public class Appointment {
    String Name;
    String phoneNumber;
    String time;
    String disease;
    String Doctor;


    public Appointment() {
    }
    public Appointment( String Name,String phoneNumber,String time,String disease,String Doctor){
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.time = time;
        this.disease =disease;
        this.Doctor = Doctor;
    }

    public void printAppointment() {
      System.out.println("Patient Name: "+ Name);
      System.out.println("Patient Phone Number: "+ phoneNumber);
      System.out.println("Patient Appointment Time: "+ time);
      System.out.println("Patient Disease: "+disease );
      System.out.println("Patient Doctor: "+Doctor);
    }

}
