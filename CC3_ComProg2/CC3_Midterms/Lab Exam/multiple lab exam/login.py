PASSWORD = 'pass'
max_attempts = 3
attempts = 0
while max_attempts != 1:
    username = input("Enter username: ")
    password = input("Enter password: ")
    if password != PASSWORD:
        attempts += 1
        if attempts == max_attempts:
            print("Access Denied!")
            break
        else:
            print(f"Incorrect. Please try again. ({attempts}/{max_attempts} remaining)")
    else:
        print("Success!")
        break