import java.util.Scanner;

public class Implicit_Casting {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to change Integer to Decimal ");
        int a = sc.nextInt();
        double b = a;
        System.out.println("Decimal ans is " + b);
        
        sc.close();
    }
}
