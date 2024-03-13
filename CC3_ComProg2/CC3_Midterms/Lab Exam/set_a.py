try:
    word = input("Enter a string: ").lower()
    assert word.isalpha()
except:
    print("Invalid. Please try again")
else:
    while True:
        count = 0
        for char in word:
            if char in ['a', 'e', 'i', 'o', 'u']:
                count += 1
        print(f"Number of vowels: {count}")
        cont = input("Do you want another transaction? (yes/no): ").lower()
        if cont == "yes":
            word = input("Enter a string: ").lower()
            continue
        elif cont == "no":
            break