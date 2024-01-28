print("----------------")
print("| Sum Of Array |")
print("----------------")
print()

size = int(input("Enter array size: "))
list_num = []
for i in range(size):
    add_num = int(input("Enter a number: "))
    list_num.append(add_num)

print("Way 1 (sum()): " + str(sum(list_num)))

sum_list = 0
for i in range(len(list_num)):
    sum_list += list_num[i]

print("Way 2 (for loop): " + str(sum_list))
