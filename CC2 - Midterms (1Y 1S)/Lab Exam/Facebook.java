/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class Facebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------\n  Welcome to Facebook  \n------------------------");
        System.out.println("Enter A or a: For log-in\nEnter B or b: For Signup");
        System.out.print("Enter here: ");
        String choice = sc.nextLine();
        final String usernameAdmin = "admin";
        final String passwordAdmin = "admin";
        if (choice.equalsIgnoreCase("a")) {
            System.out.println("--------------------\n  Facebook Log in  \n--------------------");
            System.out.print("Enter username: ");
            String user = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();
            if (user.equals(usernameAdmin)){
                if (pass.equals(passwordAdmin)) {
                    System.out.println("Login success");
                    System.out.println("        -----------\n          Profile  \n        -----------");
                    System.out.println("Username      : admin");
                    System.out.println("Email         : admin@gmail.com");
                    System.out.println("Contact Number: 09211234292");
                } else {System.out.println("Invalid password\nPlease try again");}
            } else {System.out.println("Invalid username\nPlease try again");}
        } else if (choice.equalsIgnoreCase("b")) {
            System.out.println("---------------------\n  Facebook Sign Up  \n--------------------");
            System.out.print("Enter username: ");
            String newUser = sc.nextLine();
            System.out.print("Enter password: ");
            String newPass = sc.nextLine();
            System.out.print("Email Address: ");
            String newEmail = sc.nextLine();
            System.out.print("Contact Number: ");
            String newContact = sc.nextLine();
            System.out.println("Sign Up Success\nProceed to Log In");
            System.out.println("--------------------\n  Facebook Log in  \n--------------------");
            System.out.print("Enter username: ");
            String inputUser = sc.nextLine();
            System.out.print("Enter password: ");
            String inputPass = sc.nextLine();
            if (inputUser.equals(newUser)) {
                if (inputPass.equals(newPass)) {
                    System.out.println("Log In Success");
                    System.out.println("        -----------\n          Profile  \n        -----------");
                    System.out.println("Username      : " + newUser);
                    System.out.println("Email         : " + newEmail);
                    System.out.println("Contact Number: " + newContact);
                } else {System.out.println("Invalid Password");}
            } else {System.out.println("Invalid Username");}
        } else {System.out.println("Invalid choice\nPlease try again");}
    }    
}
