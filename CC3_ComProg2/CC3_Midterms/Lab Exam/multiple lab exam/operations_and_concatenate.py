num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
str1 = input("Enter first string: ")
str2 = input("Enter second string: ")
counter = input("Enter the counter: ")
concat = f"{str1} {str2}"
print(f"""
Sum: {num1 + num2}
Difference: {num1 - num2}
Product: {num1 * num2}
Quotient: {num1 / num2}
Floor Division: {num1 // num2}
Modulo: {num1 % num2}
Concatenated String: {concat}
Length of Concatenated String: {len(concat)}
Concatenated Upper: {concat.upper()}
Concatenated Lower: {concat.lower()}
Count sa Concatenated: {concat.count(counter)}""")