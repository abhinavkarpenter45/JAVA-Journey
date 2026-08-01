import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value");
        int a = sc.nextInt();

        System.out.println("Enter second value");
        int b = sc.nextInt();

        System.out.println("Addition of two number is " + (a + b));
        System.out.println("Subtraaction of two number is " + (a - b));
        System.out.println("Muiltplication of two number is " + (a * b));
        System.out.println("Division of two number is " + (a / b));
        System.out.println("Remender of two number is " + (a % b));

        sc.close();
    }
}
