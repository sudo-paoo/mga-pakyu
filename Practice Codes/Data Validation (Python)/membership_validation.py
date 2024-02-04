# check if user input is in the list
colors = ["black", "white", "red", "green"]
while True:
    input_color = input("Enter a color: ")
    if (
        input_color in colors
    ):  # user [color.lower() for color in colors] if you want to be not case-sensitive
        print(f"Color {input_color} is available")
        break
    else:
        print(f"Color {input_color} is not available")
        continue
