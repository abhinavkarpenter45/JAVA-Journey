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
        System.out.println();
    }

    public static void displayArray() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void rowWiseTraversal() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Row " + (i + 1) + " ");
                for (int j = 0; j < numbers[i].length; j++) {
                    System.out.print(numbers[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void columnWiseTraversal() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            for (int i = 0; i < numbers[0].length; i++) {
                System.out.print("Column " + (i + 1) + " ");
                for (int j = 0; j < numbers.length; j++) {
                    System.out.print(numbers[j][i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void findMaximum() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
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
        System.out.println();
    }

    public static void findMinimum() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
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
        System.out.println();
    }

    public static void calculateSum() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[0].length; j++) {
                    sum += numbers[i][j];
                }
            }
            System.out.print("Total sum of this array is " + sum);
        }
        System.out.println();
    }

    public static void searchElement() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            System.out.print("Enter Number to search in this Array ");
            int kay = sc.nextInt();
            boolean found = false;

            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[0].length; j++) {
                    if (numbers[i][j] == kay) {
                        System.out.print("Number Found at Row " + i + " Column " + j);
                        found = true;
                        break;
                    }
                }
                if (found == true) {
                    break;
                }
            }
            if (!found) {
                System.out.print("Number not found ");
            }
        }
        System.out.println();
    }

    public static void updateElement() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            int choice;
            do {
                System.out.println("1.Upadte element with index");
                System.out.println("2.Update element without index");
                System.out.println("3. Exit");
                System.out.print("Enter your choice ");
                choice = sc.nextInt();

                boolean found = false;

                switch (choice) {
                    case 1:
                        System.out.print("Enter Row index number ");
                        int Ridx = sc.nextInt();
                        System.out.print("Enter Column index number ");
                        int Cidx = sc.nextInt();

                        if (Ridx >= 0 && Cidx >= 0 && Ridx < numbers.length && Cidx < numbers[0].length) {

                            System.out.print("Enter new number ");
                            int newnum = sc.nextInt();

                            numbers[Ridx][Cidx] = newnum;
                        } else {
                            System.out.println("Enter valid index number ");
                        }
                        break;

                    case 2:
                        System.out.print("Enter old number ");
                        int Onum = sc.nextInt();
                        System.out.print("Enter new number to update ");
                        int Nnum = sc.nextInt();

                        for (int i = 0; i < numbers.length; i++) {
                            for (int j = 0; j < numbers[0].length; j++) {
                                if (numbers[i][j] == Onum) {
                                    numbers[i][j] = Nnum;
                                    found = true;
                                }
                            }
                            if (found == true) {
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Number not found ");
                        }
                        break;
                    case 3:
                        System.out.println("Exit....");
                        break;
                    default:
                        System.out.println("Invalid choice ");
                }
            } while (choice != 3);
        }
        System.out.println();
    }

    public static void insertAny() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            int choice;
            do {
                System.out.println("1. Insert Row ");
                System.out.println("2. Insert Column ");
                System.out.println("3 Exit ");
                System.out.print("Enter your choice ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter Row Index ");
                        int Ridx = sc.nextInt();
                        if (0 > Ridx || Ridx > numbers.length) {
                            System.out.println("Enter valid Row Index ");

                        } else {

                            int[][] newNum = new int[numbers.length + 1][numbers[0].length];

                            for (int i = 0; i < Ridx; i++) {
                                for (int j = 0; j < numbers[0].length; j++) {
                                    newNum[i][j] = numbers[i][j];
                                }
                            }

                            for (int j = 0; j < newNum[0].length; j++) {
                                System.out.println("Enter new Row elements ");
                                newNum[Ridx][j] = sc.nextInt();
                            }

                            for (int i = Ridx; i < numbers.length; i++) {
                                for (int j = 0; j < numbers[0].length; j++) {
                                    newNum[i + 1][j] = numbers[i][j];
                                }
                            }
                            numbers = newNum;
                        }
                        break;

                    case 2:
                        System.out.print("Enter Column Index ");
                        int Cidx = sc.nextInt();

                        if (Cidx < 0 || Cidx > numbers[0].length) {
                            System.out.println("Invalid Colunm Index ");
                        } else {
                            int[][] newNum = new int[numbers.length][numbers[0].length + 1];
                            for (int i = 0; i < numbers.length; i++) {
                                for (int j = 0; j < Cidx; j++) {
                                    newNum[i][j] = numbers[i][j];
                                }
                            }

                            for (int i = 0; i < newNum.length; i++) {
                                System.out.println("Enter Colunm element ");
                                newNum[i][Cidx] = sc.nextInt();
                            }

                            for (int i = 0; i < numbers.length; i++) {
                                for (int j = Cidx; j < numbers[0].length; j++) {
                                    newNum[i][j + 1] = numbers[i][j];
                                }
                            }
                            numbers = newNum;
                        }
                        break;

                    case 3:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid Choice ");
                }
            } while (choice != 3);
        }
        System.out.println();
    }

    public static void deleteAny() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            int choice;
            do {
                System.out.println("1. Delete Row ");
                System.out.println("2. Delete Column");
                System.out.println("3. Exit");
                System.out.println("Enter your Choice ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Row Index ");
                        int Ridx = sc.nextInt();
                        if (Ridx < 0 || Ridx >= numbers.length) {
                            System.out.println("Invalid Row Index ");
                        } else {
                            int[][] newNum = new int[numbers.length - 1][numbers[0].length];

                            for (int i = 0; i < Ridx; i++) {
                                for (int j = 0; j < numbers[0].length; j++) {
                                    newNum[i][j] = numbers[i][j];
                                }
                            }

                            for (int i = Ridx; i < numbers.length; i++) {
                                for (int j = 0; j < numbers[0].length; j++) {
                                    newNum[i - 1][j] = numbers[i][j];
                                }
                            }
                            numbers = newNum;
                        }
                        break;

                    case 2:
                        System.out.println("Enter Column Index ");
                        int Cidx = sc.nextInt();

                        if (Cidx < 0 || Cidx >= numbers[0].length) {
                            System.out.println("Invalid Index ");
                        } else {

                            int[][] newNum = new int[numbers.length][numbers[0].length - 1];

                            for (int i = 0; i < numbers.length; i++) {
                                for (int j = 0; j < Cidx; j++) {
                                    newNum[i][j] = numbers[i][j];
                                }
                            }

                            for (int i = 0; i < numbers.length; i++) {
                                for (int j = Cidx; j < numbers[0].length; j++) {
                                    newNum[i][j - 1] = numbers[i][j];
                                }
                            }
                            numbers = newNum;
                        }
                        break;

                    case 3:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice ");
                }
            } while (choice != 3);
        }
        System.out.println();
    }

    public static void transpose() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            int[][] Transpose = new int[numbers[0].length][numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[0].length; j++) {
                    Transpose[j][i] = numbers[i][j];
                }
            }

            System.out.println("Transpose array is ");
            for (int i = 0; i < Transpose.length; i++) {
                for (int j = 0; j < Transpose[0].length; j++) {
                    System.out.print(Transpose[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void createJaggedArray() {
        System.out.print("Enter Row Size ");
        int r = sc.nextInt();

        int[][] jagged = new int[r][];

        for (int i = 0; i < r; i++) {
            System.out.println("Enter Column size for row " + i + " ");
            int c = sc.nextInt();
            jagged[i] = new int[c];
        }

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.println("Enter element [" + i + "] [" + j + "]");
                jagged[i][j] = sc.nextInt();
            }
        }
        numbers = jagged;
    }

    public static void rowSum() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                int rowSum = 0;
                for (int j = 0; j < numbers[0].length; j++) {
                    rowSum += numbers[i][j];
                }
                System.out.println("Row " + (i + 1) + " " + rowSum);
            }
        }
        System.out.println();
    }

    public static void columnSum() {
        if (numbers == null) {
            System.out.println("Empty Array ");
        } else {
            for (int i = 0; i < numbers[0].length; i++) {
                int columnSum = 0;
                for (int j = 0; j < numbers.length; j++) {
                    columnSum += numbers[j][i];
                }
                System.out.println("Column " + (i + 1) + " " + columnSum);
            }
        }
        System.out.println();
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