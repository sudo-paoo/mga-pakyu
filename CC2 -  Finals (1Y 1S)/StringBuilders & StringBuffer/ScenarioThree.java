import java.util.Scanner;
/**
 * @author pao
 * BSCS 1B
 */
public class ScenarioThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("| Scenario 3 |");
        System.out.println("--------------");
        System.out.print("Enter a statement    : ");
        String str = sc.nextLine();
        System.out.print("Enter starting index : ");
        int start = sc.nextInt();
        System.out.print("Enter ending index   : ");
        int end = sc.nextInt();
        System.out.println("Substring of the statement is : " + str.substring(start, end));
    }
}
