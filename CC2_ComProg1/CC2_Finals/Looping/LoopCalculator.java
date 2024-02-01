/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class LoopCalculator {
    public static void main(String[] args) {
        String choice;
        do {
            Scanner sc = new Scanner(System.in);
            double fNum, sNum, result = 0;
            boolean validCalcu = true;
            String operator;
            System.out.println("---------------------");
            System.out.println("|  Java Calculator  |");
            System.out.println("---------------------");
            while (true) {
                System.out.print("Enter First Number      : ");
                if (sc.hasNextDouble()) {
                    fNum = sc.nextDouble();sc.nextLine();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    sc.next();
                }
            }
            while (true) {
                System.out.print("Enter operator (+ - * /): ");
                operator = sc.nextLine();
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid operator.");
                }
            }
            while (true) {
                System.out.print("Enter Second Number     : ");
                if (sc.hasNextDouble()) {
                    sNum = sc.nextDouble();
                    sc.nextLine();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    sc.next();
                }
            }
            switch (operator) {
                case "+":
                    result = fNum + sNum;
                    break;
                case "-":
                    result = fNum - sNum;
                    break;
                case "*":
                    result = fNum * sNum;
                    break;
                case "/":
                    if (sNum != 0) {
                        result = fNum / sNum;
                    } else {
                        System.out.println("-----------------------------");
                        System.out.println("|  Error: Division By Zero  |");
                        System.out.println("-----------------------------");
                        validCalcu = false;
                    }
                    break;
            }
            if (validCalcu) {
                System.out.println("------------------------------");
                System.out.println("                  Answer: " + result);
            }
            System.out.print("Do you want to perform another calculation? (Y/n): ");
            choice = sc.next();
        } while (!choice.equalsIgnoreCase("n"));
    }
}
