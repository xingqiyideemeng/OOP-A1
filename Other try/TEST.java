import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        String gender;
        String email;
        int time;
        System.out.print("请输入您的名字: ");
        name = scanner.nextLine();
        System.out.print("请输入您的年龄: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("请输入您的性别: ");
        gender = scanner.nextLine();
        System.out.print("请输入您的邮箱: ");
        email = scanner.nextLine();
        System.out.print("请输入您想预约的时间：");
        time = scanner.nextInt();
        if (time < 9) {
            System.out.print("医生没有上班,请重新输入时间");
            System.out.println("预约时间: " + time);
        } else if (time > 23) {
            System.out.print("医生已经下班,请重新输入时间");

        } else if (9 < time && time < 23) {
            System.out.print("预约成功");
        }
        System.out.println("\n您输入的信息如下:");
        System.out.println("名字: " + name);
        System.out.println("年龄: " + age);
        System.out.println("性别: " + gender);
        System.out.println("邮箱: " + email);
        System.out.println("预约时间: " + time);
        scanner.close();
    }

    class AppointmentScheduler {
        // 假设这是一个已经预约的时间列表（仅作为示例）
        static List<String> bookedSlots = new ArrayList<>();

        // 初始化一些已预约的时间槽（仅作为示例）
        static {
            bookedSlots.add("2023-10-01 10:00");
            bookedSlots.add("2023-10-01 11:00");
            // 可以添加更多已预约的时间槽...
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 提示用户输入预约时间
            System.out.print("请输入您想要预约的日期和时间（格式：YYYY-MM-DD HH:MM）: ");
            String desiredSlot = scanner.nextLine();

            // 检查预约时间是否已经被占用
            boolean isSlotAvailable = !bookedSlots.contains(desiredSlot);

            // 输出预约结果
            if (isSlotAvailable) {
                System.out.println("预约成功！您已经成功预约了：" + desiredSlot);
                // 这里可以添加将新预约时间添加到bookedSlots的逻辑（如果需要持久化存储，则需要保存到数据库或文件中）
                // bookedSlots.add(desiredSlot); // 注意：这里只是示例，实际中可能需要更复杂的逻辑来处理新预约
            } else {
                System.out.println("抱歉，该时间段已经被预约。请选择其他时间。");
            }

            // 关闭Scanner对象
            scanner.close();
        }
    }
}