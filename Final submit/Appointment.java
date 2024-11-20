package src;
public class Appointment {
    String Name;
    String phoneNumber;
    String AppointmentTime;
    String disease;
    String Doctor;

    // Default constructor
    public Appointment() {
    }
    // A constructor with arguments
    public Appointment( String Name,String phoneNumber,String AppointmentTime,String disease,String Doctor){
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.AppointmentTime = AppointmentTime;
        this.disease =disease;
        this.Doctor = Doctor;
    }
    //Method for printing details
    public void printAppointment() {
      System.out.println("Patient Name: "+ Name);
      System.out.println("Patient Phone Number: "+ phoneNumber);
      System.out.println("Patient Appointment Time: "+ AppointmentTime);
      System.out.println("Patient Disease: "+disease );
      System.out.println("Patient Doctor: "+Doctor);
    }
}

