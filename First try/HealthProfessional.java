public abstract class HealthProfessional {
    private String name;
    private String specialty;

    public HealthProfessional(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public abstract void seePatient(String patientName);
}
