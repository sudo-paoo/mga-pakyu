public class Payslip {
    private final int SSS = 894;
    private final int PHILHEALTH = 583;
    private final int PAG_IBIG = 200;
    private final double TAX = 0.10;

    public void getPayslip(String name, String monthYear, String idNumber, double basicSalary) {
        double totalDeduction = (basicSalary * TAX) + SSS + PHILHEALTH + PAG_IBIG;
        double totalNetPay = basicSalary - totalDeduction;
        new EmployeeGUI().addGUIComponents(name, monthYear, idNumber, totalDeduction, totalNetPay, basicSalary);
    }
}
