deci = int(input("Enter a decimal: "))
hex_characters = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F']
hex_value = None
for i in range(len(hex_characters)):
    if i == deci:
        hex_value = hex_characters[i]
        break
if hex_value is not None:
    print(f"The decimal value of {deci} is {hex_value}.")
else:
    print("Invalid hex character.")