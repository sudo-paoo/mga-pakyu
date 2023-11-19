/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        String choice;
        do {
            System.out.println("---------------------");
            System.out.println("Temperature Converter");
            System.out.println("Celsius -> Fahrenheit");
            System.out.println("---------------------");
            double celsius;
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("Enter temperature in Celsius: ");
                if (sc.hasNextDouble()) {
                    celsius = sc.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid temperature.");
                    sc.next();
                }
            }
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("---------------------");
            System.out.println("Celsius -> Fahrenheit");
            System.out.println("---------------------");
            System.out.println("Celsius   : " + celsius);
            System.out.println("Fahrenheit: " + fahrenheit);
            System.out.print("Do you want to convert another temperature? (Y/n): ");
            choice = sc.next();
        } while (!choice.equalsIgnoreCase("n"));
    }
}
