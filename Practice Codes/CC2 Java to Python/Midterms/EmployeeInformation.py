# constants
SSS = 894
PHILHEALTH = 583
PAG_IBIG = 200
TAX = 0.10

print("--------------------------------")
print("| Employee Payslip Information |")
print("--------------------------------")
print()

name = input("Enter your name      : ")
month = input("Enter month          : ")
id_number = input("Enter your id number : ")
salary = float(input("Enter your salary    : "))

total_deduction = (salary * TAX) + SSS + PHILHEALTH + PAG_IBIG
total_net_pay = salary - total_deduction

print()
print("-----------------------")
print("| Payslip Information |")
print("-----------------------")
print()

print("Name:", name.title())
print("ID Number:", id_number)
print("For the month of", month, "2023")
print("Basic Salary:", salary)
print("Total Deduction:", total_deduction)
print("Total Net Pay:", total_net_pay)
