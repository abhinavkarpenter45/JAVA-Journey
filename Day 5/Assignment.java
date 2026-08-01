import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int a = sc.nextInt();

        System.out.println(a += 5); // 5 + 5 = 10, a = 10
        System.out.println(a -= 5); // 10 - 5 = 5, a = 5
        System.out.println(a *= 5); // 5 * 5 = 25, a = 25
        System.out.println(a /= 5); // 25 / 5 = 5, a = 5
        System.out.println(a %= 5); // 5 % 5 = 0 , a = 0

        sc.close();

    }
}
