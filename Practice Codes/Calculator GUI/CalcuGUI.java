import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcuGUI extends JFrame implements ActionListener {
    public static JTextField num1;
    public static JTextField num2;
    public static JPanel panel;
    public static JComboBox<String> cb;
    public static JLabel label4;

    public CalcuGUI() {
        this.setTitle("Calculator");
        this.setSize(300, 300);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        addGUIComponents();
    }

    public void addGUIComponents() {
        // banner
        JLabel welcome = new JLabel("Welcome to Calculathor ⚡");
        welcome.setBounds(75, 10, 150, 25);
        panel.add(welcome);
        // num1
        JLabel label1 = new JLabel("Enter the first number: ");
        label1.setBounds(10, 30, 150, 25);
        num1 = new JTextField();
        num1.setBounds(10, 60, 150, 25);
        panel.add(label1);
        panel.add(num1);

        // num2
        JLabel label2 = new JLabel("Enter the second number: ");
        label2.setBounds(10, 90, 200, 25);
        num2 = new JTextField();
        num2.setBounds(10, 120, 150, 25);
        panel.add(label2);
        panel.add(num2);

        // choices operators
        JLabel label3 = new JLabel("Operator: ");
        label3.setBounds(10, 150, 60, 25);
        String[] operators = { "+", "-", "*", "/", "%" };
        cb = new JComboBox<String>(operators);
        cb.setBounds(80, 150, 50, 25);
        panel.add(label3);
        panel.add(cb);

        // result label
        label4 = new JLabel("Result here");
        label4.setBounds(10, 180, 200, 25);
        panel.add(label4);

        // submit button
        JButton submitButton = new JButton("Calculate");
        submitButton.setBounds(10, 210, 100, 25);
        submitButton.addActionListener(this);
        panel.add(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (num1.getText().isEmpty() || num2.getText().isEmpty()) {
            label4.setText("Please fill all the required fields.");
        } else {
            int fNum = Integer.parseInt(num1.getText());
            int sNum = Integer.parseInt(num2.getText());
            String operation = (String) cb.getSelectedItem();
            switch (operation) {
                case "+":
                    label4.setText("Sum: " + (fNum + sNum));
                    break;
                case "-":
                    label4.setText("Difference: " + (fNum - sNum));
                    break;
                case "*":
                    label4.setText("Product: " + (fNum * sNum));
                    break;
                case "/":
                    if (sNum == 0) {
                        label4.setText("Division by zero is not allowed");
                    } else {
                        label4.setText("Quotient: " + (fNum / sNum));
                    }
                    break;
                case "%":
                    if (sNum == 0) {
                        label4.setText("Modulo by zero is not allowed");
                    } else {
                        label4.setText("Modulo: " + (fNum % sNum));
                    }
                    break;
                default:
                    label4.setText("Invalid operator");
                    break;
            }
        }
    }
}
