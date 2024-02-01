/**
 * @author pao
 * BSCS 1B
 */
public class Database {
    String usernames[] = {"user1","user2","user3","admin"};
    String passwords[] = {"pass1","pass2","pass3","admin"};
    String fullnames[] = {"name 1","name 2","name 3","admin admin"};
    boolean isFound = false;
    boolean condi = true;
    int tries = 1;
    public void getInfo(String user, String pass){
        for(int i = 0; i < usernames.length; i++) {
            if (user.equals(usernames[i]) && pass.equals(passwords[i])) {
                isFound = true;
                System.out.println(">>> Login successful. Welcome back, " + usernames[i].toLowerCase());
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
