import java.util.Scanner;

public class Voting_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name ");
        String name = sc.nextLine();

        System.out.print("Enter your Age ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println(name + " are Eligible for Vote");
        }
        else{
            System.out.println(name + "not Eligible for Vote");
        }
        sc.close();
    }
}
