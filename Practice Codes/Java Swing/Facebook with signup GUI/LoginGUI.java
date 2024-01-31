import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame implements ActionListener {
    private JTextField textUser;
    private JPasswordField textPass;
    private JButton loginButton;
    private JLabel errorLabel;
    private JButton signupButton;
    private int tries;
    private ProfileDatabase pdb;

    public LoginGUI() {
        this.setTitle("Facebook");
        this.setSize(350, 250);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(getClass().getResource("./img/fb.png"));
        this.setIconImage(img.getImage());
        pdb = new ProfileDatabase();
        addGUIComponents();
    }

    public void addGUIComponents() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // banner label

        JLabel labelBanner = new JLabel("Welcome to Facebook!");
        labelBanner.setBounds(105, 15, 150, 25);
        panel.add(labelBanner);

        // username
        JLabel labelUser = new JLabel("Username: ");
        labelUser.setBounds(85, 50, 100, 25);
        textUser = new JTextField();
        textUser.setBounds(150, 50, 100, 25);
        panel.add(labelUser);
        panel.add(textUser);

        // password
        JLabel labelPass = new JLabel("Password: ");
        labelPass.setBounds(85, 80, 100, 25);
        textPass = new JPasswordField();
        textPass.setBounds(150, 80, 100, 25);
        panel.add(labelPass);
        panel.add(textPass);

        // login button
        loginButton = new JButton("Login");
        loginButton.setBounds(125, 110, 100, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        // error label
        errorLabel = new JLabel();
        errorLabel.setBounds(65, 170, 250, 25);
        panel.add(errorLabel);

        // signup label
        JLabel signupLabel = new JLabel("Don't have an account?");
        signupLabel.setBounds(60, 140, 150, 25);
        panel.add(signupLabel);

        // signup button
        signupButton = new JButton("Sign Up");
        signupButton.setBounds(200, 140, 80, 25);
        signupButton.addActionListener(this);
        panel.add(signupButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String user = textUser.getText();
            String pass = textPass.getText();
            if (user.isEmpty()) {
                errorLabel.setText("Please enter a username");
            } else if (pass.isEmpty()) {
                errorLabel.setText("Please enter a password");
            } else {
                String[] result = pdb.getInfo(user, pass);
                if (ProfileDatabase.isFound) {
                    new ProfileGUI(result[0], result[1], result[2]).setVisible(true);
                    this.dispose();
                } else {
                    if (tries == 3) {
                        errorLabel.setText("Too many attempts. You have been locked");
                        loginButton.setEnabled(false);
                    } else {
                        errorLabel.setText("Invalid username or password. Try again");
                        tries++;
                    }
                }
            }
        } else if (e.getSource() == signupButton) {
            new SignupGUI().setVisible(true);
            this.dispose();
        }
    }
}
