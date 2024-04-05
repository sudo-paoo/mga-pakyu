# Documentation
The provided code implements a simple ATM (Automated Teller Machine) system for Panda Bank Incorporated (PBI). It allows users to perform basic banking operations such as login, balance inquiry, deposit, and withdrawal.
## Functions
1. [[#Function login(username, password)]]
2. [[#Function get_balance(username, password)]]
3. [[#Function check_balance(username, password)]]
4. [[#Function deposit(username, password, amount)]]
5. [[#Function withdraw(username, password, amount)]]
6. [[#Function receipt(trans_type, bank_name, amount, balance)]]
7. [[#Function main()]]
	1. [[#Part 1 Main Menu]]
	2. [[#Part 2 Login Process]]
	3. [[#Part 3 Operations Menu]]
	4. [[#Part 4 Handling Operations]]
	5. [[#Part 5 Deposit Operation]]
	6. [[#Part 6 Withdrawal Operation]]
	7. [[#Part 7 Error Handling]]
### Sample Bank Data
```python
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
```
### Function: login(username, password)
```python
def login(username, password):  
    if username in bank_data and bank_data[username]['password'] == password:  
        return {  
                "success": True,  
                "card_number": bank_data[username]['card_number'],  
                "bank_name": bank_data[username]['bank_name']  
            }  
    return {"success": False}
```
This function is designed to authenticate users attempting to log in to a banking system. It takes two parameters: `username` and `password`.
#### Parameters:
- `username`: A string representing the username of the user trying to log in.
- `password`: A string representing the password provided by the user.
#### Return Value:
- If authentication is successful, a dictionary with the following keys:
    - `"success"`: Boolean value `True` indicating successful login.
    - `"card_number"`: The card number associated with the provided username.
    - `"bank_name"`: The name of the bank associated with the provided username.
- If authentication fails, a dictionary with `"success"` key set to `False`.
#### Notes:
- The function checks if the provided `username` exists in the `bank_data` dictionary and if the corresponding password matches the provided `password`.
- If authentication is successful, it returns a dictionary containing additional user information such as card number and bank name.
- If authentication fails, it returns a dictionary indicating the login attempt was unsuccessful.
- Ensure that `bank_data` is properly initialized and contains user information before calling this function.
### Function: get_balance(username, password)
```python
def get_balance(username, password):  
    if username in bank_data and bank_data[username]['password'] == password:  
        return bank_data[username]['balance']
```
This function is responsible for retrieving the balance associated with a user's account in the banking system. It requires two parameters: `username` and `password`.
#### Parameters:
- `username`: A string representing the username of the account holder.
- `password`: A string representing the password of the account holder.
#### Return Value:
- If authentication is successful (i.e., the provided `username` exists in the `bank_data` dictionary and the provided `password` matches the stored password), the function returns the balance associated with the user's account.
- If authentication fails, the function returns `None`.
#### Notes:
- Similar to the `login` function, this function checks the provided `username` and `password` against the `bank_data` dictionary to authenticate the user.
- If authentication is successful, it returns the balance associated with the user's account.
- If authentication fails, it returns `None`, indicating that the balance retrieval was unsuccessful.
- Ensure that `bank_data` is properly initialized and contains user information before calling this function.
### Function: check_balance(username, password)
```python
def check_balance(username, password):  
    if username in bank_data and bank_data[username]['password'] == password:  
        receipt("Check Balance", bank_data[username]['bank_name'], None, bank_data[username]['balance'])
```
This function verifies the balance associated with a user's account in the banking system and generates a receipt for the balance check. It requires two parameters: `username` and `password`.
#### Parameters:
- `username`: A string representing the username of the account holder.
- `password`: A string representing the password of the account holder.
#### Receipt Generation:
- If authentication is successful (i.e., the provided `username` exists in the `bank_data` dictionary and the provided `password` matches the stored password), the function generates a receipt using the `receipt` function.
- The receipt includes information about the transaction type (`"Check Balance"`), the bank name associated with the account, and the current balance.
- If authentication fails, no receipt is generated.
#### Notes:
- Similar to the `login` and `get_balance` functions, this function checks the provided `username` and `password` against the `bank_data` dictionary to authenticate the user.
- If authentication is successful, it generates a receipt for checking the balance.
- If authentication fails, no receipt is generated.
- Ensure that `bank_data` is properly initialized and contains user information before calling this function.
### Function: deposit(username, password, amount)
```python
def deposit(username, password, amount):  
    if username in bank_data and bank_data[username]['password'] == password:  
        bank_data[username]['balance'] += amount  
        receipt("Deposit", bank_data[username]['bank_name'], amount, bank_data[username]['balance'])
```
This function facilitates depositing funds into a user's account within the banking system. It requires three parameters: `username`, `password`, and `amount`.
#### Parameters:
- `username`: A string representing the username of the account holder.
- `password`: A string representing the password of the account holder.
- `amount`: A numeric value representing the amount to be deposited into the account.
#### Deposit Process:
- If authentication is successful (i.e., the provided `username` exists in the `bank_data` dictionary and the provided `password` matches the stored password), the function updates the user's balance by adding the deposited `amount`.
- After updating the balance, the function generates a receipt using the `receipt` function, indicating a deposit transaction, the bank name associated with the account, the deposited amount, and the updated balance.
- If authentication fails, no deposit is made, and no receipt is generated.
#### Notes:
- Similar to previous functions, this function authenticates the user by checking the provided `username` and `password` against the `bank_data` dictionary.
- If authentication is successful, it updates the user's balance and generates a receipt for the deposit transaction.
- If authentication fails, no deposit is made, and no receipt is generated.
- Ensure that `bank_data` is properly initialized and contains user information before calling this function.
### Function: withdraw(username, password, amount)
```python
def withdraw(username, password, amount):  
    if username in bank_data and bank_data[username]['password'] == password:  
        bank_data[username]['balance'] -= amount  
        receipt("Withdraw", bank_data[username]['bank_name'], amount, bank_data[username]['balance'])
```
This function allows users to withdraw funds from their account within the banking system. It requires three parameters: `username`, `password`, and `amount`.
#### Parameters:
- `username`: A string representing the username of the account holder.
- `password`: A string representing the password of the account holder.
- `amount`: A numeric value representing the amount to be withdrawn from the account.
#### Withdrawal Process:

- If authentication is successful (i.e., the provided `username` exists in the `bank_data` dictionary and the provided `password` matches the stored password), the function deducts the withdrawn `amount` from the user's balance.
- After updating the balance, the function generates a receipt using the `receipt` function, indicating a withdrawal transaction, the bank name associated with the account, the withdrawn amount, and the updated balance.
- If authentication fails, no withdrawal is performed, and no receipt is generated.
#### Notes:
- Similar to previous functions, this function authenticates the user by checking the provided `username` and `password` against the `bank_data` dictionary.
- If authentication is successful, it updates the user's balance and generates a receipt for the withdrawal transaction.
- If authentication fails, no withdrawal is performed, and no receipt is generated.
- Ensure that `bank_data` is properly initialized and contains user information before calling this function
### Function: receipt(trans_type, bank_name, amount, balance)
```python
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
```

This function generates a receipt for various banking transactions such as deposits, withdrawals, and balance checks. It formats and prints the receipt based on the transaction type and related information.
#### Parameters:
- `trans_type`: A string representing the type of transaction, such as `"Check Balance"`, `"Deposit"`, or `"Withdraw"`.
- `bank_name`: A string representing the name of the bank involved in the transaction.
- `amount`: A numeric value representing the transaction amount. For balance checks, this parameter is `None`.
- `balance`: A numeric value representing the balance after the transaction.
#### Receipt Generation:
- For a balance check transaction, the receipt includes the bank name, transaction type, and the updated balance.
- For deposit or withdrawal transactions, the receipt includes additional information such as the transaction amount and, for withdrawals, any applicable transaction fees.
- The receipt is formatted and printed accordingly.
#### Notes:
- The function handles different types of transactions and formats the receipt accordingly.
- For withdrawal transactions, if the bank name is not `"PBI"`, it prints the applicable transaction fee.
- Ensure that the `trans_type` parameter matches one of the defined transaction types to generate the correct receipt format.
### Function: main()
#### Part 1: Main Menu
```python
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
```
This part of the code displays the main menu of the ATM machine, allowing the user to choose between logging in or exiting the system. It handles user input and validates the choice.
#### Part 2: Login Process
```python
            else:
                for _ in range(3):
                    username = input("Enter your username: ")
                    password = input("Enter your password: ")
                    if login(username, password)["success"]:
                        bank_card_number = login(username, password)["card_number"]
                        bank_branch = login(username, password)["bank_name"]
```
Here, the code prompts the user to enter their username and password. It loops for a maximum of three attempts. If the login is successful, it retrieves the user's card number and bank branch.
#### Part 3: Operations Menu
```python
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
```
This part displays the ATM operations menu after successful login. It allows the user to choose between checking balance, depositing, withdrawing, or logging out.
#### Part 4: Handling Operations
```python
                                elif opt == '1':
                                    check_balance(username, password)
                                elif opt == '2':
                                    # Deposit operation
                                elif opt == '3':
                                    # Withdraw operation
                                else:
                                    break
```
This section handles different operations based on the user's choice. If the user chooses to check balance, it calls the `check_balance` function. If the user chooses to deposit or withdraw, the corresponding operation is performed.
#### Part 5: Deposit Operation
```python
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
```
This section handles the deposit operation. It prompts the user to enter the deposit amount, validates the input, and then calls the `deposit` function with the provided amount.
#### Part 6: Withdrawal Operation
```python
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
```
This part handles the withdrawal operation. It prompts the user to enter the withdrawal amount, validates it against certain conditions (such as maximum withdrawal limit and available balance), and then calls the `withdraw` function if the conditions are met.
#### Part 7: Error Handling
```python
                            except AssertionError as e:
                                print(e)
                                continue
                    else:
                        print("[!] Invalid username or password. Please try again")
                        continue
                else:
                    print("[!] Login blocked. Please try again after 10 minutes")
        except AssertionError as e:
            print(e)
            continue
```
This part of the code handles error cases using `try` and `except` blocks. Here's what each section does:
- The `except AssertionError as e` block inside the loop catches assertion errors, primarily for handling invalid user choices during login attempts or during ATM operations. It prints the error message and continues the loop to prompt the user again.
- If the login attempt fails (i.e., the `login` function returns `False`), the `else` block prints a message indicating invalid username or password and continues the loop.
- The `else` block with the `for` loop is executed if the loop completes without a successful login within three attempts. It prints a message indicating that the login is blocked and suggests trying again after 10 minutes.
- Outside the loop, there's another `except AssertionError as e` block. This handles invalid user input during the main menu selection (e.g., if the user enters a choice other than '0' or '1'). It prints the error message and continues the loop to prompt the user again.
