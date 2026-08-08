import java.util.Scanner;

public class StudentMarksManagementSystem {
    private static Scanner sc = new Scanner(System.in);
    private static int[] marks;
    private static int count = 0;

    private static void showMenu() {
        System.out.println("\n===== STUDENT MARKS MANAGEMENT SYSTEM =====");
        System.out.println("1. Enter Marks of Students ");
        System.out.println("2. Display Marks ");
        System.out.println("3. Find Highest Marks ");
        System.out.println("4. Find Lowest Marks ");
        System.out.println("5. Calculate Average ");
        System.out.println("6. Search Marks ");
        System.out.println("7, Update Marks ");
        System.out.println("8. Insert Marks ");
        System.out.println("9. Delete Marks ");
        System.out.println("10. Display Totel Students ");
        System.out.println("11. Exit ");
        System.out.print("Enter your choice ");
    }

    private static void enterMarks() {
        System.out.print("Enter Size of Index ");
        int size = sc.nextInt();
        marks = new int[size];

        System.out.println("Enter Students Marks ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        count = marks.length;
    }

    private static void displayMarks() {
        if (marks == null) {
            System.out.println("Plase Enter marks first ");
            return;
        }
        System.out.println("Marks of all Students is ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Students " + (i + 1) + ":" + marks[i]);
        }
    }

    private static void findMax() {
        if (marks == null) {
            System.out.println("Empty list ");
            return;
        }

        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }
        }
        System.out.print("Heigest marks is " + max);
    }

    private static void average() {
        if (marks == null) {
            System.out.println("Empty list");
            return;
        }

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        int avg = sum / count;
        System.out.println("Average marks of student " + avg);
    }

    private static void findMin() {
        if (marks == null) {
            System.out.println("Empty list ");
            return;
        }

        int min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (min > marks[i]) {
                min = marks[i];
            }
        }
        System.out.println("Minimum marks is " + min);
    }

    private static void searchMarks() {
        if (marks == null) {
            System.out.println("Empty list ");
            return;
        }

        System.out.print("Enter marks to search in this list they present or not ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < marks.length; i++) {
            if (key == marks[i]) {
                System.out.println("Marks found at index " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Marks not found");
        }
    }

    private static void updateMarks() {
        if (marks == null) {
            System.out.println("Empty list ");
            return;
        }

        System.out.print("Enter index to update ");
        int index = sc.nextInt();

        if (index < 0 || index >= count) {
            System.out.println("Invalid index ");
            return;
        }

        System.out.print("Enter new marks ");
        int newmarks = sc.nextInt();

        marks[index] = newmarks;
        System.out.println("Marks Update successfully ");
    }

    private static void insert() {
        if (marks == null) {
            System.out.println("Empty list ");
            return;
        }

        System.out.println("Enter index size ");
        int index = sc.nextInt();

        System.out.println("Enter new marks ");
        int value = sc.nextInt();

        int[] newmarks = new int[marks.length + 1];
        for (int i = 0; i < index; i++) {
            newmarks[i] = marks[i];
        }
        newmarks[index] = value;

        for (int i = index; i < marks.length; i++) {
            newmarks[i + 1] = marks[i];
        }
        marks = newmarks;
        count++;
    }

    private static void delete() {
        if (marks == null) {
            System.out.println("Empty list");
            return;
        }

        System.out.println("Enter index to delete ");
        int index = sc.nextInt();

        int[] newmarks = new int[marks.length - 1];

        for (int i = 0; i < index; i++) {
            newmarks[i] = marks[i];
        }

        for (int i = index + 1; i < marks.length; i++) {
            newmarks[i - 1] = marks[i];
        }

        marks = newmarks;
        count--;
    }

    private static void totelStudents() {
        System.out.println("Number of total student is " + count);
    }

    private static void exit() {
        System.out.println("Exiting....");
    }

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    enterMarks();
                    break;
                case 2:
                    displayMarks();
                    break;
                case 3:
                    findMax();
                    break;
                case 4:
                    findMin();
                    break;
                case 5:
                    average();
                    break;
                case 6:
                    searchMarks();
                    break;
                case 7:
                    updateMarks();
                    break;
                case 8:
                    insert();
                    break;
                case 9:
                    delete();
                    break;
                case 10:
                    totelStudents();
                    break;
                case 11:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice ");
            }
        } while (choice != 11);
        sc.close();
    }
}