import java.util.Scanner;

public class Deletion_Operations {
    static Scanner sc = new Scanner(System.in);
    static int[] numbers;

    public static void showMenu() {
        System.out.println("1. Enter Numbers ");
        System.out.println("2. Display Numbers with index ");
        System.out.println("3. Delete Number in first ");
        System.out.println("4. Delete Number in last ");
        System.out.println("5. Delete Number Middle. Before Middle, After Middle ");
        System.out.println("6. Delete Number in any position ");
        System.out.print("Enter your choice ");
    }

    public static void InputElements() {
        System.out.print("Enter Index Size ");
        int size = sc.nextInt();
        numbers = new int[size];

        System.out.print("Enter Elements ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println();
    }

    public static void displayNumbers() {
        if (numbers == null) {
            System.out.print("List is Empty");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Index = " + i + " " + "Numbers = " + numbers[i]);
            }
        }
        System.out.println();
    }

    public static void deleteFirst() {
        if (numbers == null || numbers.length == 0) {
            System.out.println("List is Empty ");
        } else {
            int newNumbers[] = new int[numbers.length - 1];
            for (int i = 1; i < numbers.length; i++) {
                newNumbers[i - 1] = numbers[i];
            }
            System.out.println("Number Delete Successfully");
            numbers = newNumbers;
        }
        System.out.println();
    }

    public static void deleteLast() {
        if (numbers == null || numbers.length == 0) {
            System.out.println("List is Empty ");
        } else {
            int newNumbers[] = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                newNumbers[i] = numbers[i];
            }
            System.out.println("Number Delete Successfully ");
            numbers = newNumbers;
        }
        System.out.println();
    }

    public static void deleteMid() {
        int choice;
        do {
            System.out.println("1. Delete Number in mid (Before Middle) ");
            System.out.println("2. Delete Number in Middle ");
            System.out.println("3. Delete Number in mid (After Middle) ");
            System.out.print("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (numbers == null || numbers.length == 0) {
                        System.out.println("List is Empty ");
                    } else {
                        int newNumbers[] = new int[numbers.length - 1];
                        int mid = numbers.length / 2;
                        for (int i = 0; i < mid - 1; i++) {
                            newNumbers[i] = numbers[i];
                        }
                        for (int i = mid; i < numbers.length; i++) {
                            newNumbers[i - 1] = numbers[i];
                        }
                        numbers = newNumbers;
                    }
                    System.out.println();
                    break;

                case 2:
                    if (numbers == null || numbers.length == 0) {
                        System.out.println("List is Empty ");
                    } else {
                        int newNumbers[] = new int[numbers.length - 1];
                        int mid = numbers.length / 2;
                        for (int i = 0; i < mid; i++) {
                            newNumbers[i] = numbers[i];
                        }
                        for (int i = mid + 1; i < numbers.length; i++) {
                            newNumbers[i - 1] = numbers[i];
                        }
                        System.out.println("Number Delete Successfully ");
                        numbers = newNumbers;
                    }
                    System.out.println();
                    break;

                case 3:
                    if (numbers == null || numbers.length == 0) {
                        System.out.println("List is Empty ");
                    } else {
                        int newNumbers[] = new int[numbers.length - 1];
                        int mid = numbers.length / 2;
                        for (int i = 0; i <= mid; i++) {
                            newNumbers[i] = numbers[i];
                        }
                        for (int i = mid + 2; i < numbers.length; i++) {
                            newNumbers[i - 1] = numbers[i];
                        }
                        System.out.println("Number Delete Successfully ");
                        numbers = newNumbers;
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid Choice ");
            }
        } while (choice != 4);
    }

    public static void deleteAny() {
        int choice;
        do {
            System.out.println("1. Delete with Index number and Value");
            System.out.println("2. If you dont know Index number then press 2 ");
            System.out.print("Enter Your choice ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (numbers == null || numbers.length == 0) {
                        System.out.println("List is Empty ");
                    } else {
                        System.out.print("Enter Index Number ");
                        int idx = sc.nextInt();
                        if (idx < 0 || idx >= numbers.length) {
                            System.out.println("Invalid index ");
                        } else {
                            System.out.print("Enter Value to delete ");
                            int val = sc.nextInt();

                            if (numbers[idx] == val) {
                                int newNumbers[] = new int[numbers.length - 1];

                                for (int i = 0; i < idx; i++) {
                                    newNumbers[i] = numbers[i];
                                }
                                for (int i = idx + 1; i < numbers.length; i++) {
                                    newNumbers[i - 1] = numbers[i];
                                }
                                System.out.println("Number Delete Successfully ");
                                numbers = newNumbers;
                            } else {
                                System.out.println("Value does not exit given index ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    if (numbers == null || numbers.length == 0) {
                        System.out.println("List is Empty ");
                    } else {

                        System.out.println("Enter Value to delete ");
                        int val = sc.nextInt();
                        int idx = -1;

                        for (int i = 0; i < numbers.length; i++) {
                            if (numbers[i] == val) {
                                idx = i;
                                break;
                            }
                        }

                        if (idx == -1) {
                            System.out.println("Value not found");
                        } else {
                            int newNumbers[] = new int[numbers.length - 1];
                            for (int i = 0; i < idx; i++) {
                                newNumbers[i] = numbers[i];
                            }
                            for (int i = idx + 1; i < numbers.length; i++) {
                                newNumbers[i - 1] = numbers[i];
                            }
                            numbers = newNumbers;
                        }
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid Choice ");
            }
        } while (choice != 3);
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
                    deleteFirst();
                    break;
                case 4:
                    deleteLast();
                    break;
                case 5:
                    deleteMid();
                    break;
                case 6:
                    deleteAny();
                    break;
                default:
                    System.out.println("Invalid Choice ");
            }
        } while (choice != 7);
        sc.close();
    }
}