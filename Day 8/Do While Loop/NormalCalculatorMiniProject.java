import java.util.Scanner;

public class NormalCalculatorMiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n==== CALCULAT0R MENU ====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number ");
                int num1 = sc.nextInt();
                System.out.print("Enter second number ");
                int num2 = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Addition of two number is " + (num1 + num2));
                        break;
                    case 2:
                        System.out.print("Subtraction of two number is " + (num1 - num2));
                        break;
                    case 3:
                        System.out.print("Multiplication of two number is " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Cannot divide by 0");
                        } else {
                            System.out.print("Division of two number is " + ((double) num1 / num2));
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting.....");
            } else {
                System.out.println("Invalid choice ");
            }

        } while (choice != 5);

        System.out.println("Thankyou for using Calculator");

        sc.close();
    }
}
