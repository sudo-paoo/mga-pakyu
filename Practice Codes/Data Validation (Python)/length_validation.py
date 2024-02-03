# check if the input string is valid length
max_length = 16  # max length is 16
while True:
    string = input("Enter a password: ")
    if len(string) <= max_length and len(string) != 0:
        print("Valid password")
        break
    else:
        print("Invalid password (16 characters). Try again")
        continue
