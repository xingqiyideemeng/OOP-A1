public class Specialist extends HealthProfessional {

    public Specialist(String name, String specialty) {
        super(name, specialty);
    }

    @Override
    public void seePatient(String patientName) {
        System.out.println(name + " (Specialty: " + getSpecialty() + ") is seeing patient: " + patientName);
    }
}