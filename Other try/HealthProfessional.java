public class HealthProfessional{

    int id;
    String name;
    String specialty;

    public HealthProfessional() {
        // 默认构造函数
    }

    public HealthProfessional(int id, String name, String specialty) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
    }

    // Getter 和 Setter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
class GeneralPractitioner extends HealthProfessional {
    private String clinicLocation;

    public GeneralPractitioner() {
        // 默认构造函数
    }

    public GeneralPractitioner(int id, String name, String specialty, String clinicLocation) {
        super(id, name, specialty);
        this.clinicLocation = clinicLocation;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Clinic Location: " + clinicLocation);
    }

    // Getter 和 Setter 方法
    public String getClinicLocation() {
        return clinicLocation;
    }

    public void setClinicLocation(String clinicLocation) {
        this.clinicLocation = clinicLocation;
    }
}