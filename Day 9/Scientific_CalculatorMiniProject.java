import java.util.Scanner;

public class Scientific_CalculatorMiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n==== JAVA MATH CALCULATOR ====");
            System.out.println("1. Absolute Value ");
            System.out.println("2. Square Root ");
            System.out.println("3. Cube Root ");
            System.out.println("4. Ceiling ");
            System.out.println("5. Floor");
            System.out.println("6. Round ");
            System.out.println("7. Maximum ");
            System.out.println("8. Minimum ");
            System.out.println("9. Power ");
            System.out.println("10. Random Number ");
            System.out.println("11. PI Value ");
            System.out.println("12. Euler's Number (E) ");
            System.out.println("13. Exit ");

            System.out.print("Enter Your Choice ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 6) {

                System.out.print("Enter Number ");
                double num = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Absolute value of number is " + Math.abs(num));
                        break;
                    case 2:
                        System.out.println("Square Root of number is " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("Cube Root of number is " + Math.cbrt(num));
                        break;
                    case 4:
                        System.out.println("Ceiling value of number is " + Math.ceil(num));
                        break;
                    case 5:
                        System.out.println("Floor value of number is " + Math.floor(num));
                        break;
                    case 6:
                        System.out.println("Round value of number is " + Math.round(num));
                        break;
                }
            } else if (choice >= 7 && choice <= 9) {

                System.out.print("Enter First Number ");
                double num1 = sc.nextDouble();

                System.out.print("Enter Second Number ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 7:
                        System.out.println("Maximum number is " + Math.max(num1, num2));
                        break;
                    case 8:
                        System.out.println("Minimum number is " + Math.min(num1, num2));
                        break;
                    case 9:
                        System.out.println("Power is " + Math.pow(num1, num2));
                        break;
                }
            } else if (choice >= 10 && choice <= 12) {

                switch (choice) {
                    case 10:
                        System.out.println("Random Number is " + Math.random());
                        break;
                    case 11:
                        System.out.println("PI Value is " + Math.PI);
                        break;
                    case 12:
                        System.out.println("Value of E is " + Math.E);
                        break;
                }
            } else if (choice == 13) {
                System.out.println("Exiting.....");
                break;
            } else {
                System.out.println("Invalid Choice ");
            }
        } while (choice != 13);

        sc.close();
    }
}