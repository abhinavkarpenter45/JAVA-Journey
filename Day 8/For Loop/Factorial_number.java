import java.util.Scanner;

public class Factorial_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int n = sc.nextInt();
        int fact = 1;

        if(n < 0){
            System.out.println("Negetive number factorial not define");
        }
        else{
            if(n == 0 || n == 1){
                System.out.println("Factorial is 1");
            }
            else{
                for(int i = 1; i <= n; i++){
                    fact = fact * i;
                }
            }
            System.out.println(fact);
        }
        sc.close();
    }
}
