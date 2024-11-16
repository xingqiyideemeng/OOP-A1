import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentSystem {
    List<Appointment> appointments;

    public AppointmentSystem() {
        this.appointments = new ArrayList<>();
    }

    public void bookAppointment(HealthProfessional healthProfessional, String patientName, LocalTime appointmentTime) {
        // For simplicity, let's assume no two appointments can be at the same time.
        for (Appointment app : appointments) {
            if (app.getAppointmentTime().equals(appointmentTime)) {
                System.out.println("Appointment time is already taken at " + appointmentTime);
                return;
            }
        }
        appointments.add(new Appointment(healthProfessional, patientName, appointmentTime));
        System.out.println("Appointment booked: " + new Appointment(healthProfessional, patientName, appointmentTime));
    }

    public void listAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments for today.");
        } else {
            System.out.println("Today's appointments:");
            for (Appointment app : appointments) {
                System.out.println(app);
            }
        }
    }

    public static void main(String[] args) {
        AppointmentSystem system = new AppointmentSystem();

        GeneralPractitioner gp = new GeneralPractitioner("Dr. Smith");
        Specialist specialist = new Specialist("Dr. Johnson", "Cardiology");

        LocalTime morningSlot = LocalTime.of(9, 0);
        LocalTime afternoonSlot = LocalTime.of(14, 0);

        system.bookAppointment(gp, "John Doe", morningSlot);
        system.bookAppointment(specialist, "Jane Smith", afternoonSlot);

        system.listAppointments();
    }
}