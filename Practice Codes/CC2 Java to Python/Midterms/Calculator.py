print("---------------------")
print("| Python Calculator |")
print("---------------------")

num1 = float(input("Enter first number        : "))
operator = input("Enter operator (+,-,*,/,%): ")
num2 = float(input("Enter second number       : "))

match operator:
    case "+":
        result = num1 + num2
        print("---------------------------")
        print("               Result: " + str(result))
        print("---------------------------")
    case "-":
        result = num1 - num2
        print("---------------------------")
        print("               Result: " + str(result))
        print("---------------------------")
    case "*":
        result = num1 * num2
        print("---------------------------")
        print("               Result: " + str(result))
        print("---------------------------")
    case "/":
        if num2 == 0:
            print("----------------------------------------------")
            print("| Error: Division by Zero (0) is not allowed |")
            print("----------------------------------------------")
        else:
            result = num1 / num2
            print("---------------------------")
            print("               Result: " + str(result))
            print("---------------------------")
    case "%":
        if num2 == 0:
            print("--------------------------------------------")
            print("| Error: Modulo by Zero (0) is not allowed |")
            print("--------------------------------------------")
        else:
            result = num1 % num2
            print("---------------------------")
            print("               Result: " + str(result))
            print("---------------------------")
    case _:
        print("Invalid operator. Try again")
