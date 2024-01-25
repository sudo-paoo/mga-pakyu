# admin data
USERNAME = "admin"
PASSWORD = "admin"

print("-----------------------")
print("| Welcome to Facebook |")
print("-----------------------")
print()
print("[A/a] Login")
print("[B/b] Signup")
choice = input("Enter here: ").lower()

match choice:
    case "a":
        print("-------------------")
        print("| Facebook Log in |")
        print("-------------------")

        username = input("Enter username: ")
        password = input("Enter password: ")

        if username == USERNAME:
            if password == PASSWORD:
                print("Login success")
                print("---------------")
                print("    PROFILE    ")
                print("---------------")

                print("Username      : admin")
                print("Email         : admin@gmail.com")
                print("Contact Number: 09123456789")
            else:
                print("Invalid password. Try again")
        else:
            print("Invalid username. Try again")

    case "b":
        print("-------------------")
        print("| Facebook Signup |")
        print("-------------------")

        new_username = input("Enter username: ")
        new_password = input("Enter password: ")
        new_email = input("Email Address: ")
        new_contact = input("Contact Number: ")
        print("Sign up Success")
        print("Proceed to Login")
        print()

        print("-------------------")
        print("| Facebook Log in |")
        print("-------------------")

        username = input("Enter username: ")
        password = input("Enter password: ")

        if username == new_username:
            if password == new_password:
                print("Login success")
                print("---------------")
                print("    PROFILE    ")
                print("---------------")

                print("Username:", new_username)
                print("Email Address", new_email)
                print("Contact Number: ", new_contact)
            else:
                print("Invalid password. Try again")
        else:
            print("Invalid username. Try again")
    case _:
        print("Invalid choice. Try again")
