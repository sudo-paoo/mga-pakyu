target_string = 'abcde'
attempts = 0
for char in target_string:
    user_input = input(f"Enter the uppercase letter for '{char}': ")
    attempts += 1
    if user_input == char.upper():
        print(f"Correct! Uppercase of '{char}' is '{char.upper()}'")
    else:
        print(f"Incorrect! '{user_input}' does not match the current character.")
        break
print(f"Number of attempts: {attempts}")
