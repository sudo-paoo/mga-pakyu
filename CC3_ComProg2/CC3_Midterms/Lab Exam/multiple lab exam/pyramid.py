num = int(input("Enter num: "))
for i in range(1, num+1):
    print(" " * (3 * (num - i)), end='')
    for j in range(i, 0, -1):
        print(f"{j:2}", end=" ")
    for k in range(2, i + 1):
        print(f"{k:2}", end=" ")
    print("")