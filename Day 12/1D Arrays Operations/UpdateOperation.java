import java.util.Scanner;

public class UpdateOperation {
    static Scanner sc = new Scanner(System.in);

    static void showmenu() {
        System.out.println("1. Update value using index number ");
        System.out.println("2. Update value without index ");
        System.out.println("Enter your choice ");
    }

    static void index_updateArrays() {

        // Size of array
        System.out.println("Enter index size ");
        int index = sc.nextInt();
        int[] number = new int[index];

        // Input array elements
        System.out.println("Enter Array elements ");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        // Print array elements
        for (int j = 0; j < number.length; j++) {
            System.out.println("Index = " + j + " Elements = " + number[j]);
        }

        // Update element using index logic
        System.out.println("Enter index number ");
        int index_num = sc.nextInt();
        System.out.println("Enter element ");
        int update_ele = sc.nextInt();

        if (index_num < 0 || index_num >= number.length) {
            System.out.println("invalid index ");

        } else {
            number[index_num] = update_ele;

        }
        System.out.println("Update complete and new list is ");
        // Print array elements
        for (int j = 0; j < number.length; j++) {
            System.out.println("Index = " + j + " Elements = " + number[j]);
        }

    }

    static void drict_updateArrays() {

        // Size of array
        System.out.println("Enter index size ");
        int index = sc.nextInt();
        int[] number = new int[index];

        // Input array elements
        System.out.println("Enter Array elements ");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        // Print array elements
        for (int j = 0; j < number.length; j++) {
            System.out.println("Index = " + j + " Elements = " + number[j]);
        }

        // Update element using index logic
        System.out.println("Enter old number ");
        int old_num = sc.nextInt();
        System.out.println("Enter element ");
        int update_ele = sc.nextInt();
        boolean found = false;

        for (int k = 0; k < number.length; k++) {
            if (old_num == number[k]) {
                number[k] = update_ele;
                found = true;
            }
        }

        if (!found) {
            System.out.println("Invalid value ");
        }
        System.out.println("Update complete and new list is ");
        // Print array elements
        for (int j = 0; j < number.length; j++) {
            System.out.println("Index = " + j + " Elements = " + number[j]);
        }
    }

    public static void main(String[] args) {

        int choice;
        do {
            showmenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    index_updateArrays();
                    break;
                case 2:
                    drict_updateArrays();
                    break;
                default:
                    System.out.println("invalid choice ");
                    ;
            }
        } while (choice != 3);
        sc.close();
    }
}
