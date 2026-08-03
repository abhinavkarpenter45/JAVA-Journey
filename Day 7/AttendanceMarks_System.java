import java.util.Scanner;

public class AttendanceMarks_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name ");
        String name = sc.nextLine();

        System.out.print("Enter your Marks ");
        int marks = sc.nextInt();

        System.out.print("Enter your Attendance ");
        int attendance = sc.nextInt();

        if (marks >= 33) {
            if (attendance >= 75) {
                System.out.println(name + " is Passing");
            }
        } else {
            System.out.println(name + " is Fail");
        }
        sc.close();
    }
}
