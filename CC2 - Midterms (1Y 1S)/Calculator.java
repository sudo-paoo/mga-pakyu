/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1, num2, result;
        String operator;
        System.out.println("---------------------------------------");
        System.out.println("             Java Calculator           ");
        System.out.println("---------------------------------------");
        
        System.out.print("Enter First Number                : ");
        num1 = sc.nextInt();
        System.out.print("Enter the Operator (+, -, *, /, %): ");
        operator = sc.next();
        System.out.print("Enter Second Number               : ");
        num2 = sc.nextInt();
        
        switch (operator){
            case "+":
                result = num1+num2;
                System.out.println("---------------------------------------");
                System.out.println("                           Result: " + result);
                System.out.println("---------------------------------------");
                break;
            case "-":
                result = num1 - num2;
                System.out.println("---------------------------------------");
                System.out.println("                           Result: " + result);
                System.out.println("---------------------------------------");
                break;
            case "*":
                result = num1 * num2;
                System.out.println("---------------------------------------");
                System.out.println("                           Result: " + result);
                System.out.println("---------------------------------------");
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("-------------------------------------------");
                    System.out.println("Error: Division by Zero (0) is not allowed.");
                    System.out.println("-------------------------------------------");
                } else {
                    result = num1/num2;
                    System.out.println("---------------------------------------");
                    System.out.println("                           Result: " + result);
                    System.out.println("---------------------------------------");
                }              
                break;
            case "%":
                if (num2 == 0) {
                    System.out.println("-----------------------------------------");
                    System.out.println("Error: Modulo by Zero (0) is not allowed.");
                    System.out.println("-----------------------------------------");
                } else {
                    result = num1%num2;
                    System.out.println("---------------------------------------");
                    System.out.println("                           Result: " + result);
                    System.out.println("---------------------------------------");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }
}
