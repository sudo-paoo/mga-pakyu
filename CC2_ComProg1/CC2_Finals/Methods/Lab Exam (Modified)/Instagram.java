/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class Instagram {
    public static void main(String[] args) {
        Database db = new Database();
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("| Instagram Login System |");
        System.out.println("--------------------------");
        while (db.condi) {
            System.out.print("Enter username : ");
            String inputUser = sc.nextLine();
            System.out.print("Enter password : ");
            String inputPass = sc.nextLine();
            db.getInfo(inputUser, inputPass);
        }
    }
}
