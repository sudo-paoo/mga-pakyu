PIN = "012212"
TRIES = 3
tries = 1
print("|---------------------|")
print("|      Bank Name      |")
print("|---------------------|")
while True:
    entered_pin = input("Enter your Pin: ")
    if entered_pin == PIN:
        print("Correct, Welcome Back")
        print("Account Balance: $1,000,000.00")
        break
    else:
        if tries == TRIES:
            print("Sorry, you have been locked out.")
            break
        else:
            print("Incorrect Pin. Try Again")
            tries += 1