import java.util.Scanner;

public class Gretaer_Equal_Less {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("is equql");
        }
        else if (num1 > num2) {
            System.out.println( "is greater");
        }
        else{
            System.out.println("is less");
        }
        sc.close();
    }
}
