import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first value ");
        int a = sc.nextInt();

        System.out.println("Enter Second value ");
        int b = sc.nextInt();

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        sc.close();
    }
}
