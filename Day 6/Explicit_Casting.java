import java.util.Scanner;

public class Explicit_Casting {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Decimal number to convert Integer ");
        double a = sc.nextDouble();
        int b = (int)a;
        System.out.println("Integer ans is " + b);

        sc.close();
    }
    
}