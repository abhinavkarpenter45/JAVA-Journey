import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a Prime number");
        } else {
            int count = 0;
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    count++;
                }
                i++;
            }
            if (count == 0) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is not Prime");
            }
        }
        sc.close();
    }
}
