import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int n = sc.nextInt();

        int orignal = n;
        int reverse = 0;

        int i = n;
        while (i > 0) {
            int ld = i % 10;
            reverse = reverse * 10 + ld;
            i = i / 10;
        }

        if (orignal == reverse) {
            System.out.println("Number is Palindrome ");
        }
        else{
            System.out.println("Number is not Palindrome ");
        }
        sc.close();
    }
}
