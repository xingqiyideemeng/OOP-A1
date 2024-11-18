public class HealthProfessional {
    public static void main(String[] args) {}
    int ID;
    String name;
    String basicInfo;

    // Default constructor
    public void HealthProfessional() {
        this.ID = 0;
        this.name = "";
        this.basicInfo = "";
    }

    // Constructor that initializes all instance variables
    public HealthProfessional(int ID, String name, String basicInfo) {
        this.ID = ID;
        this.name = name;
        this.basicInfo = basicInfo;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Basic Info: " + basicInfo);
    }

    // Getters and Setters for the instance variables
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo;
    }
}

