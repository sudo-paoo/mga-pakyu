import random

print("----------------------------")
print("| Welcome to Guessing Game |")
print("----------------------------")
print()

while True:
    random_number = random.randint(1, 100)

    while True:
        guess = int(input("Enter your guess: "))
        if guess == random_number:
            print("Congratulations! You have guessed the number")
            break
        elif guess > random_number:
            print("Lower, guess again!")
        elif guess < random_number:
            print("Higher, guess again!")

    choice = input("Do you want to guess again? (Y/n) ").lower()
    if choice == "n":
        break
    else:
        continue
