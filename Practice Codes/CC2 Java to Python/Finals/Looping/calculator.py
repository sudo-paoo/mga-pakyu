while True:
    result = 0
    valid_calculate = True
    print("---------------------")
    print("|  Python Calculator |")
    print("---------------------")

    while True:
        try:
            fNum = float(input("Enter First Number        : "))
            break
        except ValueError:
            print("Invalid input. Please enter a valid number.")

    while True:
        operator = input("Enter operator (+ - * / %): ")
        if operator in ["+", "-", "*", "/", "%"]:
            break
        else:
            print("Invalid input. Please enter a valid operator.")

    while True:
        try:
            sNum = float(input("Enter Second Number       : "))
            break
        except ValueError:
            print("Invalid input. Please enter a valid number.")

    if operator == "+":
        result = fNum + sNum
    elif operator == "-":
        result = fNum - sNum
    elif operator == "*":
        result = fNum * sNum
    elif operator == "/":
        if sNum != 0:
            result = fNum / sNum
        else:
            print("-----------------------------")
            print("|  Error: Division By Zero  |")
            print("-----------------------------")
            valid_calculate = False
    elif operator == "%":
        if sNum != 0:
            result = fNum / sNum
        else:
            print("---------------------------")
            print("|  Error: Modulo By Zero  |")
            print("---------------------------")
            valid_calculate = False
    if valid_calculate:
        print("------------------------------")
        print("                  Answer: ", result)

    choice = input("Exit? (Y/n): ").lower()
    if choice == "n":
        break