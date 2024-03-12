print("|------------------------------|")
print("|      Password Generator      |")
print("|------------------------------|")
firstName = input("Enter your first name     : ")
lastName = input("Enter your last name      : ")
year = input("Enter your birth year     : ")
color = input("Enter your favorite color : ")
password = lastName[:3] + year[2:] + firstName[:4] + color[0]
print("Generated Password: " + password.lower())