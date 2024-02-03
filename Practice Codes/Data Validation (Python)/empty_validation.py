# check if user input a string
string = None
while True:
    string = input("Enter a string: ")
    if len(string) == 0:
        print("Invalid input. Try again")
        continue
    else:
        break
print("String:", string)
