import java.util.Scanner;
/**
 * @author pao
 * BSCS 1B
 */
public class Twitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("| Twitter Login System |");
        System.out.println("------------------------");
        System.out.println();
        String usernames[] = {"user1","user2","user3","admin"};
        String passwords[] = {"pass1","pass2","pass3","admin"};
        String fullnames[] = {"name 1","name 2","name 3","admin admin"};
        int tries = 1;
        boolean condi = true; 
        boolean isFound = false;
        while (condi) {
            System.out.print("Enter username : ");
            String inputUser = sc.nextLine();
            System.out.print("Enter password : ");
            String inputPass = sc.nextLine();
            for(int i = 0; i < usernames.length; i++) {
                if (inputUser.equals(usernames[i]) && inputPass.equals(passwords[i])) {
                    isFound = true;
                    System.out.println(">>> Login successful, Welcome back, " + usernames[i].toLowerCase());
                    System.out.println("-------------------");
                    System.out.println("| Account Profile |");
                    System.out.println("-------------------");
                    System.out.println("Fullname: " + fullnames[i].toUpperCase());
                    System.out.println("Username: " + usernames[i].toLowerCase());
                    condi = false;
                } 
            }
            if (!isFound) {
                if (tries == 3) {
                    System.out.println("Too many attempts. You have been locked");
                    condi = false;
                } else {
                    System.out.println("Invalid username or password. Try again");
                    tries++;
                }
            }   
        }
    }
}
