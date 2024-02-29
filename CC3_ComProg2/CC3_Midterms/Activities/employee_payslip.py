RPH = 457.52
RPH_OT = 753.00
TAX = 0.20

name = input("Enter your name: ")
hrs_work = float(input("Enter number of hours worked: "))
hrs_ot = float(input("Enter number of hours overtime: "))
sss = float(input("Enter SSS contribution: "))
pag_ibig = float(input("Enter Pag-Ibig contribution: "))
housing_loan = float(input("Enter housing loan amount: "))

salary = (hrs_work * RPH) + (hrs_ot * RPH_OT)
salary_tax = salary * TAX
total_deduction = salary_tax + sss + pag_ibig + housing_loan
net_salary = salary - total_deduction

print(f"""
|----------------------------|
|          PAY SLIP          |
|----------------------------|
| Name: {name.upper()}
| Gross Salary: {salary}
| SSS: {sss}
| Pag-Ibig: {pag_ibig}
| Housing Loan: {housing_loan}
| Tax: {salary_tax}
| Total Deductions: {total_deduction}
| Net Salary: {net_salary}""")
