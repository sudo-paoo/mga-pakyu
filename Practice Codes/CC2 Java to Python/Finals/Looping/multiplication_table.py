print(f"""|--------------------------------|
|      Multiplication Table      |
|--------------------------------|""")
start = int(input("Enter starting number : "))
end = int(input("Enter ending number   : "))
table = int(input("Enter table number    : "))
while start <= end:
    temp = start * table
    print(f"{start} * {table} = {temp}")
    start += 1
