import java.util.Scanner;

public class Inseration_Operation {
    static Scanner sc = new Scanner(System.in);
    static int[] numbers;

    static void showMenu() {
        System.out.println("1. Enter Numbers ");
        System.out.println("2. Display Numbers with index ");
        System.out.println("3. Insert new Number in first ");
        System.out.println("4. Insert new Number in last ");
        System.out.println("5. Insert new Number in mid (Before Middle) ");
        System.out.println("6. Insert new Number in mid (After Middle) ");
        System.out.println("7. Insert new Number in any position ");
        System.out.print("Enter your choice ");
    }

    static void InputElements() {
        System.out.print("Enter size of array ");
        int size = sc.nextInt();
        numbers = new int[size];

        System.out.print("Enter Numbers ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println();
    }

    static void displayNumbers() {
        if (numbers == null) {
            System.out.println("List is empty go and press 1 and enter number then try it ");

        } else {
            System.out.println("Numbers in your list is ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Index = " + " " + i + " Numbers = " + numbers[i]);
            }
            System.out.println();
        }
    }

    static void insertFirst() {
        if (numbers == null) {
            System.out.println("List is empty go and press 1 and enter number then try it ");
        } else {
            int[] newNumbers = new int[numbers.length + 1];

            // Copy element old to new array
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i + 1] = numbers[i];
            }

            System.out.print("Enter new number to insert first ");
            int newnum = sc.nextInt();
            newNumbers[0] = newnum;

            numbers = newNumbers;
            System.out.println();
        }
    }

    static void insertLast() {
        if (numbers == null) {
            System.out.println("List is empty go and press 1 and enter number then try it");
        } else {
            int[] newNumbers = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i];
            }

            System.out.print("Enter new number to insert last");
            int newnum = sc.nextInt();
            newNumbers[newNumbers.length - 1] = newnum;

            numbers = newNumbers;
            System.out.println();
        }
    }

    static void insertMid_Before() {
        if (numbers == null) {
            System.out.println("List is empty go and press 1 and enter number then try it");
        } else {
            // copy elements
            int[] newNumbers = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length / 2; i++) {
                newNumbers[i] = numbers[i];
            }

            // insert before middle
            int mid = numbers.length / 2;
            System.out.println("Enter new number to add before middle ");
            int midnum = sc.nextInt();
            newNumbers[mid] = midnum;

            // copy remaining elements
            for (int i = mid; i < numbers.length; i++) {
                newNumbers[i + 1] = numbers[i];
            }

            numbers = newNumbers;
            System.out.println();
        }
    }

    static void insertMid_After() {
        if (numbers == null) {
            System.out.println("List is empty go and press 1 and enter number then try it");
        } else {
            // copy element
            int[] newNumbers = new int[numbers.length + 1];
            for (int i = 0; i <= numbers.length / 2; i++) {
                newNumbers[i] = numbers[i];
            }

            // insert middle after
            int mid = numbers.length / 2;
            System.out.print("Enter Number to insert after middle ");
            int midnum = sc.nextInt();
            newNumbers[mid + 1] = midnum;

            // copy remaining element
            for (int i = mid + 1; i < numbers.length; i++) {
                newNumbers[i + 1] = numbers[i];
            }

            numbers = newNumbers;
            System.out.println();
        }
    }

    static void insertAny() {
        if (numbers == null) {
            System.out.println("List is empty go and press 1 and enter number then try it");
        } else {
            System.out.print("Enter index number ");
            int idx = sc.nextInt();
            if (idx < 0 || idx > numbers.length) {
                System.out.println("Invalid index ");
            } else {
                int[] newNumbers = new int[numbers.length + 1];
                for (int i = 0; i < idx; i++) {
                    newNumbers[i] = numbers[i];
                }

                System.out.print("Enter number to insert ");
                int num = sc.nextInt();
                newNumbers[idx] = num;

                for (int i = idx; i < numbers.length; i++) {
                    newNumbers[i + 1] = numbers[i];
                }

                numbers = newNumbers;
                System.out.println();
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
                    InputElements();
                    break;
                case 2:
                    displayNumbers();
                    break;
                case 3:
                    insertFirst();
                    break;
                case 4:
                    insertLast();
                    break;
                case 5:
                    insertMid_Before();
                    break;
                case 6:
                    insertMid_After();
                    break;
                case 7:
                    insertAny();
                    break;
                default:
                    System.out.println("Invalid choice ");
            }
        } while (choice != 8);
        sc.close();
    }
}
