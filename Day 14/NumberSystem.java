import java.util.Scanner;

public class NumberSystem {
    static Scanner sc = new Scanner(System.in);
    static int[][] numbers;

    public static void showMenu() {
        System.out.println("\n========== 2D ARRAY MANAGEMENT SYSTEM ==========");
        System.out.println("1.  Enter 2D Array");
        System.out.println("2.  Display 2D Array");
        System.out.println("3.  Row-wise Traversal");
        System.out.println("4.  Column-wise Traversal");
        System.out.println("5.  Find Maximum Element");
        System.out.println("6.  Find Minimum Element");
        System.out.println("7.  Calculate Sum of All Elements");
        System.out.println("8.  Search Element");
        System.out.println("9.  Update Element");
        System.out.println("10. Insert Element at Any Position");
        System.out.println("11. Delete Element at Any Position");
        System.out.println("12. Transpose Matrix");
        System.out.println("13. Create Jagged Array");
        System.out.println("14. Row Sum");
        System.out.println("15. Column Sum");
        System.out.println("16. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void inputArray() {
        System.out.print("Enter Row Size ");
        int r = sc.nextInt();

        System.out.print("Enter Column Size ");
        int c = sc.nextInt();

        numbers = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter Number[" + i + "][" + j + "]:");
                numbers[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void displayArray() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rowWiseTraversal() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Row " + (i + 1) + " ");
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void columnWiseTraversal() {
        for (int i = 0; i < numbers[0].length; i++) {
            System.out.print("Column " + (i + 1) + " ");
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void findMaximum() {
        int max = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.print("Maximum element in this array " + max);
    }

    public static void findMinimum() {
        int min = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }
        }
        System.out.print("Minimum element in this array " + min);
    }

    public static void calculateSum() {

    }

    public static void searchElement() {

    }

    public static void updateElement() {

    }

    public static void insertAny() {

    }

    public static void deleteAny() {

    }

    public static void transpose() {

    }

    public static void createJaggedArray() {

    }

    public static void rowSum() {

    }

    public static void columnSum() {

    }

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inputArray();
                    break;

                case 2:
                    displayArray();
                    break;

                case 3:
                    rowWiseTraversal();
                    break;

                case 4:
                    columnWiseTraversal();
                    break;

                case 5:
                    findMaximum();
                    break;

                case 6:
                    findMinimum();
                    break;

                case 7:
                    calculateSum();
                    break;

                case 8:
                    searchElement();
                    break;

                case 9:
                    updateElement();
                    break;

                case 10:
                    insertAny();
                    break;

                case 11:
                    deleteAny();
                    break;

                case 12:
                    transpose();
                    break;

                case 13:
                    createJaggedArray();
                    break;

                case 14:
                    rowSum();
                    break;

                case 15:
                    columnSum();
                    break;

                case 16:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 16);

        sc.close();
    }
}