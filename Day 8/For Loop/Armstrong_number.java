import java.util.Scanner;

public class Armstrong_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number ");
        int n = sc.nextInt();

        int orignal = n;
        int sum = 0;

        int count = 0;
        for (int i = n; i > 0; i = i / 10) {
            count++;
        }

        for (int j = n; j > 0; j = j / 10) {
            int digit = j % 10;

            int power = 1;
            for (int k = 1; k <= count; k++) {
                power = power * digit;
            }
            sum = sum + power;
        }

        if (sum == orignal) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
        sc.close();
    }
}
