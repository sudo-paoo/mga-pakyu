first_names = ["Maria", "Antonio", "Juan", "Pedro", "Jim", "Clara"]
middle_initial = ["C", "B", "E", "F", "H", "M"]
last_names = ["Dela Cruz", "San Juan", "Guzman", "Rizal", "Cunanan", "Seguin"]
age = [19, 20, 21, 22, 23, 24]
student_number = [20183015, 20195171, 20201538, 20217185, 20223157, 20235001]
isEnrolled = [True, False, True, False, True, False]

for i in range(len(first_names)):
    print("-----------------------")
    print("| Student Information |")
    print("-----------------------")
    print(f"Fullname: {first_names[i]} {middle_initial[i]}. {last_names[i]}")
    print("Age:", age[i])
    print("Student Number:", student_number[i])
    print("Is Enrolled?", isEnrolled[i])
    print("=======================")
