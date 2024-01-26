choice = "y"
while choice == "y":
    print("---------------------")
    print("Temperature Converter")
    print("Celsius -> Fahrenheit")
    print("---------------------")

    while True:
        try:
            celsius = float(input("Enter temperature in Celsius: "))
            break
        except ValueError:
            print("Invalid input. Please enter a valid temperature")

    fahrenheit = (celsius * 9 / 5) + 32
    print("---------------------")
    print("Celsius -> Fahrenheit")
    print("---------------------")
    print("Celsius   : " + str(celsius))
    print("Fahrenheit: " + str(fahrenheit))
    choice = input("Do you want to convert another temperature? (Y/n) ").lower()
