class Scanner:
    def __init__(self, string):
        self.string = string
    def nextLine(self):
        return input()
    def nextInt(self):
        return int(input())
class System:
    class out:
        def print(string):
            print(string, end='')

        def println(string):
            print(string)
System = System()
sc = Scanner("System.in")
System.out.print("Enter your name: ")
name = sc.nextLine()
System.out.print("Enter your age: ")
age = sc.nextInt()
System.out.print("Enter your birthdate: ")
birthdate = sc.nextLine()
System.out.println("| User Information |")
System.out.println(f"| Name: {name}")
System.out.println(f"| Age: {age}")
System.out.println(f"| Birthdate: {birthdate}")
System.out.println("|==================|")