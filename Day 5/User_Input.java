//Step 1 Import package (import java.util.Scanner)
//Step 2 Create Object (Scanner sc = new Scanner(System.in)) 
// (sc -> Object name) (System.in -> Keyboard input)
//Step 3 Always close memory (sc.close())

import java.util.Scanner;
public class User_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
        sc.close();
    }
}
