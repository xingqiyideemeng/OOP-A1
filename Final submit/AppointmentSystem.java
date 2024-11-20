package src;
import java.util.ArrayList;
import java.util.Scanner;
public class AppointmentSystem {

    // How to create an appointment
    public static void createAppointment(ArrayList<Appointment> appointments, String Name, String phoneNumber, String AppointmentTime, String disease,String Doctor) {
        //Create and add appointments to a collection
        appointments.add(new Appointment(Name, phoneNumber, AppointmentTime, disease, Doctor));
    }

    // A way to print an existing appointment
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Existing Appointments:");
            for (Appointment appointment : appointments) {
                appointment.printAppointment();
            }
        }
    }

    // A way to cancel appointment
    public static void cancelBooking(ArrayList<Appointment> appointments, String phoneNumber) {
        boolean CancelAppointment = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).phoneNumber.equals(phoneNumber)) {
                appointments.remove(i);
                CancelAppointment = true;
                break;
            }
        }
        if (!CancelAppointment) {
            System.out.println("Appointment not found for the provided mobile number.");
        }
    }

    public static void main(String[] args) {
        // Create a health professional object
        HealthProfessional GeneralPractitioner1 = new GeneralPractitioner(1, "Dr. Swift", "A692997599@163.com", "13775158871");
        HealthProfessional GeneralPractitioner2 = new GeneralPractitioner(2, "Dr. Jack", "a692997599@gmail.com", "123456789");
        HealthProfessional GeneralPractitioner3 = new GeneralPractitioner(3, "Dr. Archer", "a692997299@qq.com", "1122344566");
        HealthProfessional Surgeon1 = new Surgeon(4, "Dr. Lee", "a689286778@163.com", "50");
        HealthProfessional Surgeon2 = new Surgeon(5, "Dr. Liang", "a5684568584@qq.com", "45");

        // Print health professional details
        System.out.println("// Part 3 – Using classes and objects");
        System.out.println("Doctor details:");
        GeneralPractitioner1.printMessage();
        GeneralPractitioner2.printMessage();
        GeneralPractitioner3.printMessage();
        Surgeon1.printMessage();
        Surgeon2.printMessage();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println(" // Part 5 – Collection of appointments");
        System.out.println("Patient details:");
        // Declares an ArrayList capable of storing instances of the Appointment class
        ArrayList<Appointment> appointments = new ArrayList<>();

        // Use the createAppointment method to create the appointment
        createAppointment(appointments, "Alice", "12787867890", "08:00", "Catch a cold", "GeneralPractitioner1");
        createAppointment(appointments, "Hank", "09876557821", "10:00", "Catch a cold","GeneralPractitioner2");
        createAppointment(appointments, "David", "4445279746", "09:00", "fracture","Surgeon1");
        createAppointment(appointments, "Eva", "77788876573", "11:00", "Arm burn","Surgeon1");

        // Print existing appointment
        printExistingAppointments(appointments);

        // Cancel an appointment
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient's phone number to cancel appointment: ");
        String cancelPhoneNumber = scanner.nextLine();
        cancelBooking(appointments, cancelPhoneNumber);

        // Print the updated appointment collection
        System.out.println("Updated Appointments:");
        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }
}