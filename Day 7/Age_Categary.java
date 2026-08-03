import java.util.Scanner;

public class Age_Categary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age ");
        int age = sc.nextInt();

        if (age <= 12) {
            System.out.println("You are Child");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("You are Teenager");
        }
        else if (age >= 20 && age <= 24){
            System.out.println("You are young Adult");
        }
        else if (age >= 25 && age <= 39) {
            System.out.println("You are Adult");
        }
        else if (age >= 40 && age <= 59) {
            System.out.println("You are Middle Aged");
        }
        else if (age >= 60 && age <= 74) {
            System.out.println("You are Senior Citizen");
        }
        else{
            System.out.println("You are Old");
        }
        sc.close();
    }
}
