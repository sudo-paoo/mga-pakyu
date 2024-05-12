grades = []
total = 0
for i in range(9):
    user_input = float(input(f"Enter the grade for quiz #{i+1}: "))
    grades.append(user_input)
print("Scores:")
for j in range(len(grades) - 1, -1, -1):
    print(f"Quiz #{j+1}: {grades[j]}")
for score in grades:
    total += score
avg = total/len(grades)
print(f"\nAverage: {avg:.2f}")
if avg >= 92:
    print(f"Average: {avg:.2f} = 1.25")
elif avg >= 88:
    print(f"Average: {avg:.2f} = 1.50")
elif avg >= 86:
    print(f"Average: {avg:.2f} = 1.75")
elif avg == 85:
    print(f"Average: {avg:.2f} = 2.00")
elif avg >= 82:
    print(f"Average: {avg:.2f} = 2.25")
elif avg >= 79:
    print(f"Average: {avg:.2f} = 2.50")
elif avg >= 76:
    print(f"Average: {avg:.2f} = 2.75")
elif avg >= 69.5:
    print(f"Average: {avg:.2f} = 3.00")
else:
    print(f"Average: {avg:.2f} = 5.00")
print(f"Number of quizzes with score 100: {grades.count(100)}")