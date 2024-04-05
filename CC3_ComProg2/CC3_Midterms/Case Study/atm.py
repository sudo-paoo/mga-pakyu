bank_data = {
    'mGG2fB09': {'card_number': '1325943471857152', 'pin': '680579', 'balance': 18364.02, 'bank_name': 'BDO Unibank', 'username': 'mGG2fB09', 'password': 'jD6CtEoGB8'},
    'DM1lZt4W': {'card_number': '5283669663557051', 'pin': '260895', 'balance': 49424.16, 'bank_name': 'Bank of Commerce', 'username': 'DM1lZt4W', 'password': 'zsgJiA0Zxi'},
    'FEeYdi2e': {'card_number': '9721866484806360', 'pin': '052182', 'balance': 94556.42, 'bank_name': 'JP Morgan Chase Bank Manila Branch', 'username': 'FEeYdi2e', 'password': 'pfu3efEg69'},
    'slcJ5krx': {'card_number': '8506150287266008', 'pin': '688301', 'balance': 99737.8, 'bank_name': 'Development Bank of the Philippines (DBP)', 'username': 'slcJ5krx', 'password': 'hc20p55nyo'},
    'hQB2QDxZ': {'card_number': '5796507441208118', 'pin': '721618', 'balance': 77554.53, 'bank_name': 'Sterling Bank of Asia', 'username': 'hQB2QDxZ', 'password': '10td0aSFyc'},
    'RvFqJZbr': {'card_number': '1122420310530479', 'pin': '802399', 'balance': 52450.87, 'bank_name': 'Bank of Commerce', 'username': 'RvFqJZbr', 'password': 'ppDyJlXZIM'},
    '11Cl8sR6': {'card_number': '6986873612645636', 'pin': '103164', 'balance': 13438.99, 'bank_name': 'Standard Chartered Bank Philippines', 'username': '11Cl8sR6', 'password': '1EO4xtmFJK'},
    'y6GiT7WB': {'card_number': '5715470903527764', 'pin': '466500', 'balance': 48567.75, 'bank_name': 'Asia United Bank (AUB)', 'username': 'y6GiT7WB', 'password': '8Ya4gxb42V'},
    'ihPP4TJc': {'card_number': '5983213641713385', 'pin': '908840', 'balance': 7359.24, 'bank_name': 'CIMB Bank Philippines', 'username': 'ihPP4TJc', 'password': 'MiQwG4dMzw'},
    'VGow9OBG': {'card_number': '9864959245019456', 'pin': '593728', 'balance': 9324.57, 'bank_name': 'Metrobank', 'username': 'VGow9OBG', 'password': 'kJOU0J1nhF'}
}
PBI = "PANDA BANK INCORPORATED"
atm_fee = 20
# Function to handle login
def login(username, password):
    if username in bank_data and bank_data[username]['password'] == password:
        return {
                "success": True,
                "card_number": bank_data[username]['card_number'],
                "bank_name": bank_data[username]['bank_name']
            }
    return {"success": False}
# Function to get balance
def get_balance(username, password):
    if username in bank_data and bank_data[username]['password'] == password:
        return bank_data[username]['balance']
def check_balance(username, password):
    if username in bank_data and bank_data[username]['password'] == password:
        receipt("Check Balance", bank_data[username]['bank_name'], None, bank_data[username]['balance'])
# Function to deposit money and generate receipt
def deposit(username, password, amount):
    if username in bank_data and bank_data[username]['password'] == password:
        bank_data[username]['balance'] += amount
        receipt("Deposit", bank_data[username]['bank_name'], amount, bank_data[username]['balance'])
# Function to withdraw money and generate receipt
def withdraw(username, password, amount):
    if username in bank_data and bank_data[username]['password'] == password:
        bank_data[username]['balance'] -= amount
        receipt("Withdraw", bank_data[username]['bank_name'], amount, bank_data[username]['balance'])
# Function to generate receipt
def receipt(trans_type, bank_name, amount, balance):
    if trans_type == "Check Balance":
        print("|---------------------------------|")
        print("|             Receipt             |")
        print("|---------------------------------|")
        print("ATM Machine Name: Panda Bank Incorporated")
        print(f"Your bank name: {bank_name.upper()}")
        print(f"Transaction Type: {trans_type}")
        print(f"Balance: ₱{balance:,}")
        print("-----------------------------------\n")
    else:
        print("|---------------------------------|")
        print("|             Receipt             |")
        print("|---------------------------------|")
        print("Bank Name: Panda Bank Incorporated")
        print(f"{trans_type} Amount: ₱{amount:,}")
        if trans_type == "Withdraw" and bank_name.upper() != PBI:
            print(f"Transaction Fee: {atm_fee}")
        print(f"Balance: ₱{balance:,}")
        print("-----------------------------------\n")
def main():
    while True:
        try:
            print("|----------------------------|")
            print("| Welcome to PBI ATM Machine |")
            print("|----------------------------|")
            print("[1] Login")
            print("[0] Exit")
            choice = input("Enter your choice: ")
            assert choice in ['0', '1'], "[!] Invalid choice (1 to login, 0 to exit). Please try again"
            if choice == '0':
                print("|-------------------------------------|")
                print("| Thank you for using PBI ATM Machine |")
                print("|-------------------------------------|", end='\n\n')
                break
            else:
                for _ in range(3):
                    username = input("Enter your username: ")
                    password = input("Enter your password: ")
                    if login(username, password)["success"]:
                        bank_card_number = login(username, password)["card_number"]
                        bank_branch = login(username, password)["bank_name"]
                        while True:
                            try:
                                print("|----------------------|")
                                print("|    ATM Operations    |")
                                print("|----------------------|")
                                print(f"Welcome back, ****-****-****-{bank_card_number[-4:]}")
                                print(f"Your bank name: {bank_branch.upper()}")
                                print("[1] Check Balance")
                                print("[2] Deposit")
                                print("[3] Withdraw")
                                print("[0] Logout")
                                opt = input("Enter ATM operation: ")
                                assert opt in ['0', '1', '2', '3'], "Invalid choice(1 for check balance, 2 for deposit, 3 for withdraw, 0 for exit). Please try again"
                                if opt == '0':
                                    print("|-------------------|")
                                    print("| Logout Successful |")
                                    print("|-------------------|", end='\n\n')
                                    break
                                elif opt == '1':
                                    check_balance(username, password)
                                elif opt == '2':
                                    print("|-------------------|")
                                    print("|      Deposit      |")
                                    print("|-------------------|")
                                    amount = None
                                    while True:
                                        try:
                                            amount = float(input("Enter amount: "))
                                            break
                                        except Exception as e:
                                            print("Invalid amount or data type. Please try again")
                                            continue
                                    deposit(username, password, amount)
                                elif opt == '3':
                                    print("|--------------------|")
                                    print("|      Withdraw      |")
                                    print("|--------------------|")
                                    amount = None
                                    while True:
                                        bank_balance = get_balance(username, password)
                                        try:
                                            amount = float(input("Enter amount: "))
                                            if amount > 10000:
                                                print("[!] Withdraw amount too high. 10,000 per transaction only")
                                                continue
                                            if amount > bank_balance:
                                                print("[!] Insufficient balance")
                                                continue
                                            if amount % 100 == 0:
                                                withdraw(username, password, amount)
                                            else:
                                                print("[!] This machine can only withdraw 100s")
                                                continue

                                            break
                                        except Exception as e:
                                            print("Invalid amount or data type. Please try again")
                                            continue
                                else:
                                    break
                            except AssertionError as e:
                                print(e)
                                continue
                        break
                    else:
                        print("[!] Invalid username or password. Please try again")
                        continue
                else:
                    print("[!] Login blocked. Please try again after 10 minutes")
        except AssertionError as e:
            print(e)
            continue
if __name__ == "__main__":
    main()