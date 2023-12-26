public class ProfileDatabase {
    String[] usernames = {"user1","user2","user3","admin"};
    String[] passwords = {"pass1","pass2","pass3","admin"};
    String[] fullnames = {"John Doe","Jan Doe","Jane Doe","Admin Doe"};
    String[] imgPath ={"./img/user1.png","./img/user2.png","./img/user3.png","./img/admin.png",};
    boolean isFound = false;
    public String[] getInfo(String user, String pass) {
        String[] userInfo = new String[3];
        for (int i = 0; i < usernames.length; i++) {
            if (user.equals(usernames[i]) && pass.equals(passwords[i])) {
                isFound = true;
                userInfo[0] = usernames[i].toLowerCase();
                userInfo[1] = fullnames[i];
                userInfo[2] = imgPath[i];
            }
        }
        return userInfo;
    }
}