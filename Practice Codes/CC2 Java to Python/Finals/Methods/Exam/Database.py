class Database:
    usernames = ["user1", "user2", "user3", "admin"]
    passwords = ["pass1", "pass2", "pass3", "admin"]
    fullnames = ["name 1", "name 2", "name 3", "admin admin"]
    is_found = False
    condition = True
    tries = 1

    def get_info(self, user, passw):
        for i in range(len(self.usernames)):
            if user == self.usernames[i] and passw == self.passwords[i]:
                self.is_found = True
                print(
                    f">>> Login successful. Welcome back, {self.usernames[i].lower()}"
                )
                print("-------------------")
                print("| Account Profile |")
                print("-------------------")
                print(f"Fullname: {self.fullnames[i].upper()}")
                print(f"Username: {self.usernames[i].lower()}")
                self.condition = False

        if not self.is_found:
            if self.tries == 3:
                print("Too many attempts. You have been locked")
                self.condition = False
            else:
                print("Invalid username or password. Try again")
                self.tries += 1
