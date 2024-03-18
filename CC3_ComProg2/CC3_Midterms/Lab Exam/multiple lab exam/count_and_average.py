numbers = []
pos_count = 0
neg_count = 0
total = 0
num = int(input("Enter a number: "))
while num != 0:
    numbers.append(num)
    if num > 0:
        pos_count += 1
    else:
        neg_count += 1
    total += num
    num = int(input("Enter a number: "))
print(f"""
Positive Number/s: {pos_count}
Negative Number/s: {neg_count}
Total: {total}
Average: {(total/len(numbers)):.2f}""")