freq_list = []
stk = []
stk_count = []
while True:
    num = int(input("Enter a number (11 to 20): "))
    if 20 >= num >= 11:
        freq_list.append(num)
    elif num == 0:
        break
    else:
        print("Out of Range!")
n = len(freq_list)
for i in range(n):
    for j in range(0, n-i-1):
        if freq_list[j] > freq_list[j+1]:
            temp = freq_list[j]
            freq_list[j] = freq_list[j+1]
            freq_list[j+1] = temp
for num in freq_list:
    if num not in stk:
        stk.append(num)
        stk_count.append(freq_list.count(num))
print("FREQUENCY OF EACH NUMBER")
for j in range(len(stk)):
    print(f"Number #{stk[j]} - \t {stk_count[j]} \t\t TIMES")