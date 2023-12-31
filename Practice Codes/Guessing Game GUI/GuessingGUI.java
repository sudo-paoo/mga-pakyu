import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGUI extends JFrame implements ActionListener {
    public static JTextField userNum;
    public static JLabel status;
    int theNum = (int) (Math.random() * 100 + 1);
    int tries = 1;

    public GuessingGUI() {
        this.setTitle("Guessing Game");
        this.setSize(300, 200);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        addGUIComponents();
    }

    public void addGUIComponents() {
        JPanel panel = new JPanel(null);
        this.add(panel);

        Font normal = new Font("Cambria Math", Font.PLAIN, 14);
        // banner
        JLabel header = new JLabel("Welcome to Guessing Game!");
        header.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        header.setBounds(30, 10, 300, 25);
        panel.add(header);

        // label for guess
        JLabel label1 = new JLabel("Enter your guess:");
        label1.setFont(normal);
        label1.setBounds(10, 40, 125, 25);
        panel.add(label1);

        // guess field
        userNum = new JTextField();
        userNum.setFont(normal);
        userNum.setBounds(10, 70, 125, 25);
        panel.add(userNum);

        // guess button
        JButton guessButton = new JButton("Check");
        guessButton.setFont(normal);
        guessButton.setBounds(140, 70, 50, 25);
        guessButton.setMargin(new Insets(1, 0, 0, 0));
        guessButton.addActionListener(this);
        panel.add(guessButton);

        // status
        status = new JLabel();
        status.setFont(normal);
        status.setBounds(10, 100, 300, 25);
        panel.add(status);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int inputNum = Integer.parseInt(userNum.getText());
            if (inputNum > 100 || inputNum < 0) {
                status.setText("Invalid number. Enter 1 to 100 only!");
                userNum.setText("");
                userNum.requestFocus();
            } else {
                if (inputNum == theNum) {
                    status.setText("You have guessed correctly after " + tries + " guesses!");
                    userNum.setText("");
                    userNum.requestFocus();
                } else if (theNum < inputNum) {
                    status.setText("Your guess is too high. Lower");
                    userNum.setText("");
                    userNum.requestFocus();
                    tries++;
                } else if (theNum > inputNum) {
                    status.setText("Your guess is too low. Higher");
                    userNum.setText("");
                    userNum.requestFocus();
                    tries++;
                } else {
                    status.setText("Invalid guess");
                    userNum.setText("");
                    userNum.requestFocus();
                    tries++;
                }
            }
        } catch (NumberFormatException err) {
            status.setText("Invalid. Please enter a valid number.");
            userNum.setText("");
            userNum.requestFocus();
        }
    }
}
