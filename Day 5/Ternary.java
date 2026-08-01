import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sge ");
        int age = sc.nextInt();

        String status = (age >= 18) ? "Eligible for Vote" : "Not Eligible" ;

        System.out.println(status);

        sc.close();
    }
}
