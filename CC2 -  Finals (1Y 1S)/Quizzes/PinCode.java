/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class PinCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String pin = "012212";
        int tries = 1;
        boolean condition = true;
        System.out.println("-------------");
        System.out.println("| Bank Name |");
        System.out.println("-------------");
        while (condition) {
            System.out.print("Enter your pin: ");
            if (sc.nextLine().equals(pin)) {
                System.out.println("Correct, Welcome Back");
                System.out.println("Account Balance: $1,000,000.00");
                condition = false;
            } else {
                if (tries == 3) {
                    System.out.println("Sorry you have been locked out.");
                    condition = false;
                } else {
                    System.out.println("Incorrect pin. Try Again");
                    tries++;
                }
            }
        } 
    }
}
