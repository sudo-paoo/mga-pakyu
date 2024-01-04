import java.util.Arrays;

public class ProfileDatabase {
    // declaring static values
    private static String[] usernames = { "user1", "user2", "user3", "admin" };
    private static String[] passwords = { "pass1", "pass2", "pass3", "admin" };
    private static String[] fullnames = { "John Doe", "Jan Doe", "Jane Doe", "Admin Doe" };
    private static String[] imgPath = { "./img/user1.png", "./img/user2.png", "./img/user3.png", "./img/admin.png" };
    static boolean isFound = false;

    // method for login
    public String[] getInfo(String user, String pass) {
        String[] userInfo = new String[3];
        isFound = false;
        for (int i = 0; i < usernames.length; i++) {
            if (user.equals(usernames[i]) && pass.equals(passwords[i])) {
                userInfo[0] = usernames[i].toLowerCase();
                userInfo[1] = fullnames[i];
                userInfo[2] = imgPath[i];
                isFound = true;
            }
        }
        return userInfo;
    }

    // method for sign up
    public String signUp(String username, String password, String fullName) {
        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i])) {
                return "username error";
            }
            if (password.equals(passwords[i])) {
                return usernames[i];
            }
        }
        int newLength = usernames.length + 1;
        usernames = Arrays.copyOf(usernames, newLength);
        passwords = Arrays.copyOf(passwords, newLength);
        fullnames = Arrays.copyOf(fullnames, newLength);
        imgPath = Arrays.copyOf(imgPath, newLength);
        usernames[newLength - 1] = username;
        passwords[newLength - 1] = password;
        fullnames[newLength - 1] = fullName;
        imgPath[newLength - 1] = "./img/default.png";
        return "success";
    }
}
