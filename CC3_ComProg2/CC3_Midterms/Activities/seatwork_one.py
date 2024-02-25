user_years = int(input("Enter number of years in service: "))
office = input("Enter your office: ").lower()
if office == "it":
    if user_years >= 10:
        bonus = 10000
    else:
        bonus = 5000
elif office == "acct":
    if user_years >= 10:
        bonus = 12000
    else:
        bonus = 6000
elif office == "hr":
    if user_years >= 10:
        bonus = 15000
    else:
        bonus = 7500
else:
    office = "N/A"
    bonus = "N/A"
print(
    f"""
|-------------------------------------
| Number of years in service: {user_years}
| Office: {office.upper()}
| Bonus: ₱{bonus}
|-------------------------------------"""
)
