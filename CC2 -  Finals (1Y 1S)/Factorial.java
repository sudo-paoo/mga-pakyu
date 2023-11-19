/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        int num;
        System.out.println("--------------------------");
        System.out.println("|  Factorial Calculator  |");
        System.out.println("--------------------------");
        do {
            long factorial = 1;
            System.out.print("Enter a positive integer: ");
            while (true) {
                if (sc.hasNextInt()) {
                    num = sc.nextInt();
                    sc.nextLine();
                    if (num >= 0) {
                        break;
                    } else {
                        System.out.print("Please enter a positive integer: ");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                    sc.next();
                }
            }
            int loopCount = 1;
            while (loopCount <= num) {
                factorial *= loopCount;
                loopCount++;
            }
            System.out.println(num + "! = " + factorial);

            System.out.print("Do you want to calculate the factorial of another number? (Y/n): ");
            choice = sc.next();

        } while (!choice.equalsIgnoreCase("n"));
    }
}
