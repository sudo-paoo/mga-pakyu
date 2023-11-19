import java.util.Scanner;
public class EmployeeInformation {
	public static void main(String[] args) {
		String fullName, month;
		int idNumber;
		int basicSalary;
		double totalDeduction, totalNetPay;
		final int SSS = 894;
		final int PHILHEALTH = 583;
		final int PAG_IBIG = 200;
		final double TAX = 0.10;
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------");
		System.out.println(" Employee Information ");
		System.out.println("----------------------");

		System.out.print("Input your Name: ");
		fullName = sc.nextLine();
		System.out.print("Input your Month: ");
		month = sc.nextLine();
		System.out.print("Input your ID Number: ");
		idNumber = sc.nextInt();
		System.out.print("Input your Basic Salary: ");
		basicSalary = sc.nextInt();

		totalDeduction = (basicSalary * TAX) + SSS + PHILHEALTH + PAG_IBIG;
		totalNetPay = basicSalary - totalDeduction;
                
		System.out.println("---------------------");
		System.out.println(" Payslip Information ");
		System.out.println("---------------------");
			
		System.out.println("Name: " + fullName);
		System.out.println("ID Number: " + idNumber);
		System.out.println("For the month of: " + month + " 2023");
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("Total Deduction: " + totalDeduction);
		System.out.println("Total Net Pay: " + totalNetPay);
	}
}
