import StudentDatabase as sdb

while True:
    print("------------------------------")
    print("| Student Information System |")
    print("------------------------------")
    print("Student Information System Menu:")
    print("[1] Add a student")
    print("[2] Edit a student")
    print("[3] Remove a student")
    print("[4] Get the student information")
    print("[5] Get all students information")
    print("[0] Exit")
    choice = int(input("Enter your choice: "))

    match choice:
        case 0:
            break
        case 1:
            print(">>> ADD STUDENT")
            first_name = input("Enter first name: ")
            last_name = input("Enter last name: ")
            age = input("Enter age: ")
            address = input("Enter address: ")

            sdb.addStudent(first_name, last_name, age, address)
        case 2:
            print(">>> EDIT STUDENT")
            first_name = input("Enter first name: ")
            last_name = input("Enter last name: ")
            sdb.editStudent(sdb.indexStudent(first_name, last_name))
        case 3:
            print(">>> DELETE STUDENT")
            first_name = input("Enter first name: ")
            last_name = input("Enter last name: ")
            sdb.removeStudent(sdb.indexStudent(first_name, last_name))
        case 4:
            print(">>> GET STUDENT INFORMATION")
            first_name = input("Enter first name: ")
            last_name = input("Enter last name: ")
            sdb.getInformation(first_name, last_name)
        case 5:
            sdb.getAllStudents()
        case _:
            print("Invalid choice. Try Again")
