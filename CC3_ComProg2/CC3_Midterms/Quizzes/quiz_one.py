INTEREST = 0.06
name = input("Name: ").title()
borrowed_amount = float(input("Amount to be borrowed: "))
days_to_pay = int(input("Days to pay: "))

interest_amount = borrowed_amount * INTEREST
total_loan = round(borrowed_amount + interest_amount, 2)
daily_pay = round(total_loan / days_to_pay, 2)

print(f"""
===================================
| Name: {name}
| Amount Borrowed: {borrowed_amount}
| Interest: {INTEREST}
| Total Interest: {interest_amount}
| Total Amount to be Paid: {total_loan}
| Daily Pay: {daily_pay}
===================================""")
