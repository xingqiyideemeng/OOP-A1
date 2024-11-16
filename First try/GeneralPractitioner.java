public class GeneralPractitioner extends HealthProfessional {

    public GeneralPractitioner(String name) {
        super(name, "General Practice");
    }

    @Override
    public void seePatient(String patientName) {
        System.out.println(name + " is seeing patient: " + patientName);
    }
}
