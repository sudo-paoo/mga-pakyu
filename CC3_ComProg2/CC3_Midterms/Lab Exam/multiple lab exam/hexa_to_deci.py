hex_char = input("Enter a hex character: ")
hex_characters = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F']
decimal_value = None
for i in range(len(hex_characters)):
    if hex_characters[i] == hex_char.upper():
        decimal_value = i
        break
if decimal_value is not None:
    print(f"The decimal value of {hex_char} is {decimal_value}.")
else:
    print("Invalid hex character.")
