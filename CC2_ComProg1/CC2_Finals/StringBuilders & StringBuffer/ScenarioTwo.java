import java.util.Scanner;
/**
 * @author pao
 * BSCS 1B
 */
public class ScenarioTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("--------------");
        System.out.println("| Scenario 2 |");
        System.out.println("--------------");
        System.out.print("Enter first string  : ");
        String str1 = sc.nextLine();
        sb.append(str1);
        System.out.print("Enter second string : ");
        String str2 = sc.nextLine();
        sb.append(str2);
        System.out.println("Concatenated string: " + sb);
        System.out.println("Concatenated length: " + sb.length());    }
}
