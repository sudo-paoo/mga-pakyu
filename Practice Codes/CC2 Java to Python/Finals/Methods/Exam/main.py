import Database

db = Database.Database()

print("--------------------------")
print("| Instagram Login System |")
print("--------------------------")

while db.condition:
    username = input("Enter username: ")
    password = input("Enter password: ")
    db.get_info(username, password)
