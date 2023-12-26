import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayslipGUI extends JFrame implements ActionListener {
    public JTextField fullNameField;
    public JTextField idNumber;
    public JTextField basicSalary;
    public JComboBox<String> cbMonth;
    public JComboBox<String> cbYear;
    private Payslip ps;

    public PayslipGUI() {
        this.setTitle("Employee Payslip");
        this.setSize(350, 350);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        addGUIComponents();
    }

    public void addGUIComponents() {
        // panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // banner
        JLabel welcome = new JLabel("EMPLOYEE PAYSLIP INFORMATION");
        welcome.setBounds(70, 10, 200, 25);
        panel.add(welcome);

        // full name label
        JLabel label1 = new JLabel("Enter your full name:");
        label1.setBounds(87, 30, 150, 25);
        panel.add(label1);

        // full name text field
        fullNameField = new JTextField();
        fullNameField.setBounds(87, 60, 150, 25);
        panel.add(fullNameField);

        // month + year
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        String[] years = { "2023", "2024", "2025", "2026" };
        JLabel label2 = new JLabel("Choose month and year");
        label2.setBounds(87, 90, 150, 25);
        cbMonth = new JComboBox<String>(months);
        cbMonth.setBounds(87, 120, 75, 25);
        cbYear = new JComboBox<String>(years);
        cbYear.setBounds(162, 120, 75, 25);

        panel.add(label2);
        panel.add(cbMonth);
        panel.add(cbYear);

        // id number
        JLabel label3 = new JLabel("Enter your employee id:");
        label3.setBounds(87, 150, 150, 25);
        idNumber = new JTextField();
        idNumber.setBounds(87, 180, 150, 25);
        panel.add(label3);
        panel.add(idNumber);

        // basic salary
        JLabel label4 = new JLabel("Enter you basic salary:");
        label4.setBounds(87, 210, 150, 25);
        basicSalary = new JTextField();
        basicSalary.setBounds(87, 240, 150, 25);
        panel.add(label4);
        panel.add(basicSalary);

        // get payslip button
        JButton button1 = new JButton("Get Payslip");
        button1.setBounds(115, 270, 100, 25);
        button1.addActionListener(this);
        panel.add(button1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ps = new Payslip();
        String name = fullNameField.getText();
        String monthAndYear = (String) cbMonth.getSelectedItem() + " " + cbYear.getSelectedItem();
        String employeeNumber = idNumber.getText();
        double salary = Double.parseDouble(basicSalary.getText());
        ps.getPayslip(name, monthAndYear, employeeNumber, salary);

        // delete texts
        fullNameField.setText("");
        cbMonth.setSelectedIndex(0);
        cbYear.setSelectedIndex(0);
        idNumber.setText("");
        basicSalary.setText("");
    }
}
