import java.time.LocalTime;

public class Appointment {
    HealthProfessional healthProfessional;
    String patientName;
    LocalTime appointmentTime;

    public Appointment(HealthProfessional healthProfessional, String patientName, LocalTime appointmentTime) {
        this.healthProfessional = healthProfessional;
        this.patientName = patientName;
        this.appointmentTime = appointmentTime;
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }

    public String getPatientName() {
        return patientName;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "healthProfessional=" + healthProfessional.getName() +
                ", patientName='" + patientName + '\'' +
                ", appointmentTime=" + appointmentTime +
                '}';
    }
}