import javax.swing.*;

public class EmployeeGUI extends JFrame {
    public EmployeeGUI() {
        this.setTitle("Employee Payslip Information");
        this.setSize(350, 260);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void addGUIComponents(String name, String monthYear, String idNumber, double totalDeduc, double totalPay,
            double salary) {
        // panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        // banner
        JLabel welcome = new JLabel("EMPLOYEE PAYSLIP INFORMATION");
        welcome.setBounds(70, 10, 200, 25);
        panel.add(welcome);

        // full name
        JLabel fullNameLabel = new JLabel("Full Name: " + name.toUpperCase());
        fullNameLabel.setBounds(10, 40, 200, 25);
        panel.add(fullNameLabel);

        // id number
        JLabel idNumberLabel = new JLabel("ID Number: " + idNumber);
        idNumberLabel.setBounds(10, 70, 200, 25);
        panel.add(idNumberLabel);

        // monthY
        JLabel monthYearLabel = new JLabel("For the month of: " + monthYear);
        monthYearLabel.setBounds(10, 100, 200, 25);
        panel.add(monthYearLabel);

        // basic sal
        JLabel basicSalaryLabel = new JLabel("Basic Salary: " + salary);
        basicSalaryLabel.setBounds(10, 130, 200, 25);
        panel.add(basicSalaryLabel);

        // total deduction
        JLabel totalDeducLabel = new JLabel("Total Deduction: " + totalDeduc);
        totalDeducLabel.setBounds(10, 160, 200, 25);
        panel.add(totalDeducLabel);

        // total pay
        JLabel totalPayLabel = new JLabel("Total Net Pay: " + totalPay);
        totalPayLabel.setBounds(10, 190, 200, 25);
        panel.add(totalPayLabel);
    }
}
