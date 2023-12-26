import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame implements ActionListener {
    public static JLabel labelBanner;
    public static JLabel labelUser;
    public static JTextField textUser;
    public static JLabel labelPass;
    public static JPasswordField textPass;
    public static JButton buttonLogin;
    public static JLabel errorLabel;
    public static int tries;
    public LoginGUI(){
        this.setTitle("Facebook Login");
        this.setSize(350,250);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(getClass().getResource("./img/fb.png"));
        this.setIconImage(img.getImage());
        addGUIComponents();
    }
    public void addGUIComponents(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // banner label

        labelBanner = new JLabel("Welcome to Facebook!");
        labelBanner.setBounds(105,15,150,25);
        panel.add(labelBanner);

        // username
        labelUser = new JLabel("Username: ");
        labelUser.setBounds(85,50,100,25);
        textUser = new JTextField();
        textUser.setBounds(150, 50,100,25);
        panel.add(labelUser);
        panel.add(textUser);

        // password
        labelPass = new JLabel("Password: ");
        labelPass.setBounds(85,80,100,25);
        textPass = new JPasswordField();
        textPass.setBounds(150, 80,100,25);
        panel.add(labelPass);
        panel.add(textPass);

        // login button
        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(125, 110, 100,25);
        buttonLogin.addActionListener(this);
        panel.add(buttonLogin);

        // error label
        errorLabel = new JLabel();
        errorLabel.setBounds(65,140,250,25);
        panel.add(errorLabel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        ProfileDatabase pdb = new ProfileDatabase();
        String user = textUser.getText();
        String pass = textPass.getText();
        String[] result = pdb.getInfo(user, pass);
        if (pdb.isFound){
            new ProfileGUI(result[0], result[1],result[2]).setVisible(true);
            this.dispose();
        } else {
            if (tries == 3) {
                errorLabel.setText("Too many attempts. You have been locked");
                buttonLogin.setEnabled(false);
            } else {
                errorLabel.setText("Invalid username or password. Try again");
                tries++;
            }
        }
    }
}