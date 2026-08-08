import java.util.Scanner;

public class CopyArray {
    static Scanner sc = new Scanner(System.in);
    static int[] orignalArr;

    public static void orignalArray() {

        System.out.print("Enter index size ");
        int size = sc.nextInt();
        orignalArr = new int[size];

        System.out.print("Enter Elements ");
        for (int i = 0; i < orignalArr.length; i++) {
            orignalArr[i] = sc.nextInt();
        }

        // Print Orignal Array
        for (int i = 0; i < orignalArr.length; i++) {
            System.out.println("Index = " + i + " Element = " + orignalArr[i]);
        }
    }

    public static void copyArray() {

        if (orignalArr == null) {
            System.out.println("Empty list ");
        } else {
            int[] CopyArr = new int[orignalArr.length];

            for (int i = 0; i < orignalArr.length; i++) {
                CopyArr[i] = orignalArr[i];
            }

            for (int i = 0; i < CopyArr.length; i++) {
                System.out.println("Index = " + i + " Element = " + CopyArr[i]);
            }
        }

    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Input Orignal Array");
            System.out.println("2. Print Copy Array ");
            System.out.print("Enter Your choice ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    orignalArray();
                    break;
                case 2:
                    copyArray();
                    break;
                default:
                    System.out.println("Invalid Choice ");
            }
        } while (choice != 3);
        sc.close();
    }
}
