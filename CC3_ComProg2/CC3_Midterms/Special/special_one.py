iteration = int(input("Enter number of iteration: "))
total = 0
concat = ""
user_list = []
for i in range(iteration):
    user_input = input("Enter anything: ")
    user_list.append(user_input)
    checker = user_input.replace(".", "", 1)
    if checker.isdigit():
        total += float(user_input)
    else:
        concat = f"{concat} {user_input}"
print(
    f"""
User Inputs: {user_list}
Total: {total}
Concatenated String: {concat}"""
)
