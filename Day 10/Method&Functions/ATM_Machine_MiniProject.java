import java.util.Scanner;

public class ATM_Machine_MiniProject {

    private static Scanner sc = new Scanner(System.in);
    private static double balance = 50000;
    private static int pin = 1234;

    public static void showMenu() {
        System.out.println("\n===== WELCOME TO ATM MACHINE =====");
        System.out.println("1. Check Balance ");
        System.out.println("2. Deposit Money ");
        System.out.println("3. Withdraw Money ");
        System.out.println("4. Change PIN ");
        System.out.println("5. Exit ");
        System.out.print("Enter Your choice ");
    }

    private static void checkBalance() {
        System.out.println("---------------------------");
        System.out.println("Current Balance is " + balance);
        System.out.println("---------------------------");
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
            System.out.print("Current Amount is " + balance);
        } else {
            System.out.println("Invalid amount enter correct amount ");
        }
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw ");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("Enter valid Amount ");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance ");
        } else {
            balance -= amount;
            System.out.println("Amount Withdrawal Successfully!");
            System.out.print("Current Amount is " + balance);
        }
    }

    private static void changePin() {
        System.out.print("Enter your current PIN ");
        int currentPin = sc.nextInt();

        if (currentPin != pin) {
            System.out.println("Incorrect PIN ");
        } else {
            System.out.print("Enter New PIN ");
            int newPin = sc.nextInt();
            System.out.print("Enter Confirm PIN ");
            int confirmPin = sc.nextInt();
            if (newPin >= 1000 && newPin <= 9999) {
                if (confirmPin == newPin) {
                    pin = newPin;
                    System.out.println("PIN Changed Successfully!");
                } else {
                    System.out.println("PIN do not match ");
                }
            } else {
                System.out.println("PIN must be 4-digits ");
            }

        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    changePin();
                    break;
                case 5:
                    System.out.println("Thank you for using our ATM");
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid choice ");
            }
        } while (choice != 5);

        sc.close();
    }
}
