public class HealthProfessional {
    int ID;
    String name;
    String email; // 用于区分不同类型的健康专业人士

    // 默认构造函数
    public HealthProfessional() {
    }

    // 带参数的构造函数
    public HealthProfessional(int ID, String name, String email) {
        this.ID = ID;
        this.name = name;
        this.email = email;
    }

    // 打印健康专业人士详细信息的方法
    public void printMessage() {
        System.out.println("Doctor ID:"+ ID);
        System.out.println("Doctor Name:"+ name);
        System.out.println("Doctor Email:"+ email);
    }
}
