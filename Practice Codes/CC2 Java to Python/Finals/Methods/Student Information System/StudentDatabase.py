first_names = []
last_names = []
student_age = []
student_address = []


def indexStudent(first_name, last_name):
    for i in range(len(first_names)):
        if first_names[i] == first_name and last_names[i] == last_name:
            return i


def addStudent(first_name, last_name, age, address):
    first_names.append(first_name)
    last_names.append(last_name)
    student_age.append(age)
    student_address.append(address)
    print(">>> STUDENT ADDED")


def editStudent(index):
    if index != -1:
        print(">>> STUDENT FOUND")
        print(
            f"Full name: {str(first_names[index]).upper()} {str(last_names[index]).upper()}"
        )
        print("Age:", student_age[index])
        print("Address:", student_address[index])

        print(">>> CHANGE INFORMATION")
        first_names[index] = input("Enter first name: ")
        last_names[index] = input("Enter last name: ")
        student_age[index] = input("Enter age: ")
        student_address[index] = input("Enter address: ")

        print(">>> UPDATE SUCCESS")
    else:
        print(">>> STUDENT NOT FOUND")


def removeStudent(index):
    first_names.pop(index)
    last_names.pop(index)
    student_age.pop(index)
    student_address.pop(index)
    print(">>> REMOVE STUDENT SUCCESS")


def getInformation(first_name, last_name):
    isFound = False
    for i in range(len(first_names)):
        if first_names[i] == first_name and last_names[i] == last_name:
            isFound = True
            print("-----------------------")
            print("| STUDENT INFORMATION |")
            print("-----------------------")
            print(
                f"Full name       : {str(first_names[i]).upper()} {str(last_names[i]).upper()}"
            )
            print("Age             :", student_age[i])
            print("Address         :", student_address[i])
            print("=======================")
    if not isFound:
        print(">>> STUDENT NOT FOUND")


def getAllStudents():
    for i in range(len(first_names)):
        print("-----------------------")
        print("| STUDENT INFORMATION |")
        print("-----------------------")
        print(
            f"Full name       : {str(first_names[i]).upper()} {str(last_names[i]).upper()}"
        )
        print("Age             :", student_age[i])
        print("Address         :", student_address[i])
        print("=======================")
