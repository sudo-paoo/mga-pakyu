iteration = int(input("Enter number of iterations: "))
total = 0
concat = ""
for i in range(iteration):
    anything = input("Enter anything: ")
    checker = anything.replace(".", "", 1).replace(" ", "")
    if checker.isdigit():
        total += float(anything)
    elif checker.isalpha():
        concat += anything
    else:
        print("Invalid Data Type!")
print(f"""
Total: {total}
Concatenated: {concat}""")
