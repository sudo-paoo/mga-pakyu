import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfileGUI extends JFrame implements ActionListener {
    public static ImageIcon imgProfile;
    public static JLabel profile;
    public static JLabel welcomeBanner;
    public static JLabel username;
    public static JLabel fullname;
    public static JButton logOutButton;

    public ProfileGUI(String user, String name, String path) {
        this.setTitle("Account Profile");
        this.setSize(350, 300);
        this.setResizable(false);
        ImageIcon img = new ImageIcon(getClass().getResource("./img/fb.png"));
        this.setIconImage(img.getImage());
        addGUIComponents(user, name, path);
    }

    public void addGUIComponents(String user, String name, String path) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // welcome banner
        welcomeBanner = new JLabel("Welcome Back, " + user + "!");
        welcomeBanner.setBounds(105, 15, 150, 25);

        panel.add(welcomeBanner);

        // profile
        imgProfile = new ImageIcon(getClass().getResource(path));
        profile = new JLabel();

        int maxWidth = 100;
        int maxHeight = 100;

        // Scale the image to fit within the specified dimensions
        Image img = imgProfile.getImage();
        Image scaledImage = img.getScaledInstance(maxWidth, maxHeight, Image.SCALE_SMOOTH);
        imgProfile = new ImageIcon(scaledImage);

        profile.setIcon(imgProfile);
        profile.setBounds(125, 50, maxWidth, maxHeight);
        panel.add(profile);

        // username
        username = new JLabel("Username: " + user);
        username.setBounds(10, 150, 300, 25);

        panel.add(username);

        // fullname
        fullname = new JLabel("Full Name: " + name.toUpperCase());
        fullname.setBounds(10, 180, 300, 25);

        panel.add(fullname);

        // log out button
        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(250, 210, 80, 25);
        logOutButton.addActionListener(this);
        panel.add(logOutButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int response = JOptionPane.showConfirmDialog(this, "Do you want to log out?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            new LoginGUI().setVisible(true);
            this.dispose();
        }
    }
}
