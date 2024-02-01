/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder password = new StringBuilder();
        System.out.println("----------------------");
        System.out.println("| Password Generator |");
        System.out.println("----------------------");
        System.out.print("Enter your first name     : ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name      : ");
        String lastName = sc.nextLine();
        System.out.print("Enter your birthyear      : ");
        String year = sc.nextLine();
        System.out.print("Enter your favortie color : ");
        String color = sc.nextLine();
        password.append(lastName.substring(0, 3));
        password.append(year.substring(2));
        password.append(firstName.substring(0, 4));
        password.append(color.charAt(0));
        
        System.out.println("Generated Password: " + password.toString().toLowerCase());
    }
}
