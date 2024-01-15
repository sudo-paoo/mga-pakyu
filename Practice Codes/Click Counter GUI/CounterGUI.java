import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterGUI extends JFrame implements ActionListener {
    int count = 0;
    JLabel label1;
    public CounterGUI() {
        this.setTitle("Click Counter");
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
        JLabel header = new JLabel("Button Click Counter");
        header.setFont(new Font("Cambria Math", Font.PLAIN, 18));
        header.setBounds(65, 10, 300, 25);
        panel.add(header);

        // button to click
        JButton button = new JButton("Click me");
        button.setFont(normal);
        button.setBounds(90, 50, 100, 25);
        button.addActionListener(this);
        panel.add(button);

        // label for count

        label1 = new JLabel("Click count: " + count);
        label1.setFont(normal);
        label1.setBounds(100, 80, 125, 25);
        panel.add(label1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label1.setText("Click count: " + count);
    }
}
