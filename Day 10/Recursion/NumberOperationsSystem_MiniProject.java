import java.util.Scanner;

public class NumberOperationsSystem_MiniProject {
    private static Scanner sc = new Scanner(System.in);

    private static void showMenu() {
        System.out.println("\n===== WELCOME TO NUMBER OPERATIONS SYSTEM =====");
        System.out.println("1. Factorial ");
        System.out.println("2. Sum of Natural Numbers ");
        System.out.println("3. Fibonacci ");
        System.out.println("4. Power ");
        System.out.println("5. Exit ");
        System.out.print("Enter your choice ");
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static int sumNatural(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + sumNatural(n - 1);
        }
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (a == 0 && n > 0) {
            return 0;
        } else {
            return a * power(a, n - 1);
        }
    }

    public static void main(String[] args) {
        int choice;
        int num;
        do {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a Number ");
                    num = sc.nextInt();
                    if (num < 0) {
                        System.out.println("Enter valid number");
                    } else {
                        long ans1 = factorial(num);
                        System.out.println("Factorial is " + ans1);
                    }
                    break;
                case 2:
                    System.out.print("Enter a Number ");
                    num = sc.nextInt();
                    if (num < 0) {
                        System.out.println("Enter valid number");
                    } else {
                        long ans2 = sumNatural(num);
                        System.out.println("Sum of Natural number is " + ans2);
                    }
                    break;
                case 3:
                    System.out.print("Enter a Number ");
                    num = sc.nextInt();
                    if (num < 0) {
                        System.out.println("Enter valid number");
                    } else {
                        long ans3 = fibonacci(num);
                        System.out.println("Fibonacci is " + ans3);
                    }
                    break;
                case 4:
                    System.out.print("Enter number ");
                    num = sc.nextInt();
                    System.out.print("Enter Power ");
                    int pow = sc.nextInt();
                    if (pow < 0) {
                        System.out.println("Negative power not valid ");
                    } else {
                        double ans = power(num, pow);
                        System.out.println("Power is " + ans);
                    }
                    break;
                case 5:
                    System.out.println("Exiting ....");
                    break;
                default:
                    System.out.println("Invalid choice ");
            }
        } while (choice != 5);

    }
}
