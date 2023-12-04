import java.util.Random;
import java.util.Scanner;
/**
 * @author pao
 * BSCS 1B
 */
public class Problem3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String choice;
        System.out.println("----------------------------");
        System.out.println("| Welcome to Guessing Game |");
        System.out.println("----------------------------");
        do {
            int randomNumber = random.nextInt(100) + 1;
            while (true) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You have guessed the number");
                    break;
                } else if (guess > randomNumber) {
                    System.out.println("Lower, guess again!");
                } else if (guess < randomNumber) {
                    System.out.println("Higher, guess again!");
                }
            }
            System.out.print("Do you want to guess again? (y/n) ");
            choice = sc.next();
        } while(choice.equalsIgnoreCase("Y"));
    }
}
