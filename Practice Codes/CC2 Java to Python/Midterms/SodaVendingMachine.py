# constant prices
SPRITE = 20
COKE = 25
PEPSI = 30
ROYAL = 35

budget = float(input("Enter your budget>> "))
if budget <= 0:
    print("NO BUDGET AVAILABLE - THANK YOU")
else:
    print("--------------------")
    print("| SODA COMPANY INC |")
    print("--------------------")
    print("-SELECT YOUR DRINKS-")
    print(
        """
[1] SPRITE - 20
[2] COKE - 25
[3] PEPSI - 30
[4] ROYAL - 35"""
    )

    soda_choice = int(input("Enter your soda choice: "))

    match soda_choice:
        case 1:
            print("--------------------")
            print("YOU CHOSE SPRITE")
            quantity = int(input("HOW MANY? "))
            print("------ RECEIPT ------")
            print("PRICE OF DRINK:", SPRITE)
            print("QUANTITY:", quantity)
            print("---------------------")
            total = SPRITE * quantity

            if budget > total:
                balance = budget - total
                print("TOTAL:", total)
                print("BALANCE:", balance)
                print("------THANK YOU------")
            elif budget == total:
                balance = budget - total
                print("TOTAL:", total)
                print("BALANCE:", balance)
                print("---- EXACT BUDGET----")
                print("------THANK YOU------")
            else:
                print("TOTAL:", total)
                print("INSUFFICIENT FUNDS\nPLEASE TRY AGAIN")

        case 2:
            print("--------------------")
            print("YOU CHOSE COKE")
            quantity = int(input("HOW MANY? "))
            print("------ RECEIPT ------")
            print("PRICE OF DRINK:", COKE)
            print("QUANTITY:", quantity)
            print("---------------------")
            total = COKE * quantity

            if budget > total:
                balance = budget - total
                print("TOTAL:", total)
                print("BALANCE:", balance)
                print("------THANK YOU------")
            elif budget == total:
                balance = budget - total
                print("TOTAL:", total)
                print("BALANCE:", balance)
                print("---- EXACT BUDGET----")
                print("------THANK YOU------")
            else:
                print("TOTAL:", total)
                print("INSUFFICIENT FUNDS\nPLEASE TRY AGAIN")

        case 3:
            print("--------------------")
            print("YOU CHOSE PEPSI")
            quantity = int(input("HOW MANY? "))
            print("------ RECEIPT ------")
            print("PRICE OF DRINK:", PEPSI)
            print("QUANTITY:", quantity)
            print("---------------------")
            total = PEPSI * quantity

            if budget > total:
                balance = budget - total
                print("TOTAL:", total)
                print("BALANCE:", balance)
                print("------THANK YOU------")
            elif budget == total:
                balance = budget - total
                print("TOTAL:", total)
                print("BALANCE:", balance)
                print("---- EXACT BUDGET----")
                print("------THANK YOU------")
            else:
                print("TOTAL:", total)
                print("INSUFFICIENT FUNDS\nPLEASE TRY AGAIN")

        case 4:
            print("--------------------")
            print("YOU CHOSE ROYAL")
            quantity = int(input("HOW MANY? "))
            print("------ RECEIPT ------")
            print("PRICE OF DRINK:", ROYAL)
            print("QUANTITY:", quantity)
            print("---------------------")
            total = ROYAL * quantity

            if budget > total:
                balance = budget - total
                print("TOTAL:", total)
                print("BALANCE:", balance)
                print("------THANK YOU------")
            elif budget == total:
                balance = budget - total
                print("TOTAL:", total)
                print("BALANCE:", balance)
                print("---- EXACT BUDGET----")
                print("------THANK YOU------")
            else:
                print("TOTAL:", total)
                print("INSUFFICIENT FUNDS\nPLEASE TRY AGAIN")

        case _:
            print("INVALID CHOICE. PLEASE TRY AGAIN")
