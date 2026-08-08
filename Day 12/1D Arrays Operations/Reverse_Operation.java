import java.util.Scanner;

public class Reverse_Operation {
    static Scanner sc = new Scanner(System.in);

    public static int[] Reverse(int[] orignalArr) {

        // Reverse logic
        int first = 0;
        int last = orignalArr.length - 1;

        while (first < last) {
            int temp = orignalArr[first];
            orignalArr[first] = orignalArr[last];
            orignalArr[last] = temp;
            first++;
            last--;
        }
        return orignalArr;
    }

    public static void main(String[] args) {
        System.out.print("Enter Array Size ");
        int size = sc.nextInt();
        int[] orignalArr = new int[size];

        // Input Array
        System.out.print("Enter Elements ");
        for (int i = 0; i < orignalArr.length; i++) {
            orignalArr[i] = sc.nextInt();
        }

        // Print Orignal Array
        System.out.println("Orignal Array ");
        for (int i = 0; i < orignalArr.length; i++) {
            System.out.println("Index = " + i + " Element = " + orignalArr[i]);
        }

        int[] reverseArr = Reverse(orignalArr);

        // Print Reverse Array
        System.out.println("Reverse Array ");
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.println("Index = " + i + " Element = " + reverseArr[i]);
        }

        // Reverse Traversal
        for (int i = reverseArr.length - 1; i >= 0; i--) {
            System.out.println("Index = " + i + " Element = " + reverseArr[i]);
        }
        sc.close();
    }
}
