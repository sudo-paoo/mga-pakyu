import java.util.Scanner;
/**
 * @author pao
 * BSCS 1B
 */
public class ScenarioOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("| Scenario 1 |");
        System.out.println("--------------");
        
        System.out.print("Enter first string  : ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();
        
        String str3 = str1 + str2;
        System.out.println("Concatenated string: " + str3);
        System.out.println("Concatenated length: " + str3.length());
    }
}
