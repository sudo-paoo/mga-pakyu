import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupGUI extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField textUser;
    private JPasswordField textPass;
    private JButton signupButton;
    private JLabel successLabel;
    private JButton loginButton;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private ProfileDatabase pdb;

    public SignupGUI() {
        this.setTitle("Facebook");
        this.setSize(350, 350);
        this.setResizable(false);
        ImageIcon img = new ImageIcon(getClass().getResource("./img/fb.png"));
        this.setIconImage(img.getImage());
        pdb = new ProfileDatabase();
        addGUIComponents();
    }

    public void addGUIComponents() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // banner label

        JLabel labelBanner = new JLabel("Welcome to Facebook! Create a new account");
        labelBanner.setBounds(50, 15, 300, 25);
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

        // first name
        JLabel firstNameLabel = new JLabel("First Name: ");
        firstNameLabel.setBounds(85, 110, 100, 25);
        firstNameField = new JTextField();
        firstNameField.setBounds(150, 110, 100, 25);
        panel.add(firstNameLabel);
        panel.add(firstNameField);

        // last name
        JLabel lastNameLabel = new JLabel("Last Name: ");
        lastNameLabel.setBounds(85, 140, 100, 25);
        lastNameField = new JTextField();
        lastNameField.setBounds(150, 140, 100, 25);
        panel.add(lastNameLabel);
        panel.add(lastNameField);

        // sign up button
        signupButton = new JButton("Sign Up");
        signupButton.setBounds(125, 170, 100, 25);
        signupButton.addActionListener(this);
        panel.add(signupButton);

        // login label
        JLabel loginLabel = new JLabel("Already have an account?");
        loginLabel.setBounds(50, 200, 150, 25);
        panel.add(loginLabel);

        // login button
        loginButton = new JButton("Login");
        loginButton.setBounds(200, 200, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        // error label
        successLabel = new JLabel();
        successLabel.setBounds(50, 230, 300, 25);
        panel.add(successLabel);
    }

    // Character.toUpperCase(input.charAt(0)) + input.substring(1);
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signupButton) {
            String username = textUser.getText();
            String password = textPass.getText();
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();

            if (username.isEmpty()) {
                successLabel.setText("Please provide a valid username");
            } else if (password.isEmpty()) {
                successLabel.setText("Please provide a valid password");
            } else if (firstName.isEmpty()) {
                successLabel.setText("Please provide a valid first name");
            } else if (lastName.isEmpty()) {
                successLabel.setText("Please provide a valid last name");
            } else {
                String fullName = firstName + " " + lastName;
                String success = pdb.signUp(username, password, fullName);
                if (success.equals("success")) {
                    successLabel.setText("Sign up success. Go back to Login page.");
                } else if (success.equals("username error")) {
                    successLabel.setText("Username taken please choose another.");
                } else {
                    successLabel.setBounds(25, 230, 250, 50);
                    successLabel.setText("Error this password is also used by " + success);
                }
            }
        } else if (e.getSource() == loginButton) {
            new LoginGUI().setVisible(true);
            this.dispose();
        }
    }
}
