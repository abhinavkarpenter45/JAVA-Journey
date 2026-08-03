import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number ");
        int num2 = sc.nextInt();

        System.out.print("Enter operation ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("Addition of two number is " + (num1 + num2));
                break;
            case "-":
                System.out.println("Addition of two number is " + (num1 - num2));
                break;
            case "*":
                System.out.println("Addition of two number is " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Cannot divaid by Zero");
                }
                else{
                    System.out.println("Addition of two number is " + (num1 / num2));
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.println("Cannot calculate (%) because divisor is 0 ");
                }
                else{
                    System.out.println("Addition of two number is " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Invalid Operation");
        }
        sc.close();
    }
}
