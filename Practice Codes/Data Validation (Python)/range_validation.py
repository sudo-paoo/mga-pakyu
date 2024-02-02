# check if user input is in range of the given value
min = 0
max = 100
while True:
    try:
        number = float(input("Enter a number: "))
    except ValueError:
        print("Invalid input. Try again")
        continue
    else:
        if min <= number <= max:
            print("Valid input")
            break
        else:
            continue