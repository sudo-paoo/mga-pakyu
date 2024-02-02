# check if input is a number (positive or negative)
number = None
while True:
    try:
        number = int(input("Enter a number: "))
        break
    except ValueError:
        print("Invalid input. Try again")
        continue
print("Number:", number)
