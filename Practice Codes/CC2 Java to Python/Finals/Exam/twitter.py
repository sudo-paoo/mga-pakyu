print("------------------------")
print("| Twitter Login System |")
print("------------------------")
print()

usernames = ["user1", "user2", "user3", "admin"]
passwords = ["pass1", "pass2", "pass3", "admin"]
full_names = ["name 1", "name 2", "name 3", "admin admin"]

tries = 1
found = False
while True:
    username = input("Enter username: ")
    password = input("Enter password: ")

    for i in range(len(usernames)):
        if username == usernames[i] and password == passwords[i]:
            found = True
            print(f">>> Login successful. Welcome back, {usernames[i].lower()}")
            print("-------------------")
            print("| Account Profile |")
            print("-------------------")
            print(f"Full name: {full_names[i].upper()}")
            print(f"Username: {usernames[i].lower()}")
            break

    if not found:
        if tries == 3:
            print("Too many attempts. You have been locked")
            break
        else:
            print("Invalid username or password. Try again")
            tries += 1
