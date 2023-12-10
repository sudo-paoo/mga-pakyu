import java.util.Scanner;
/**
 * @author pao
 * BSCS 1B
 */
public class StudentInformationSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StudentDatabase sdb = new StudentDatabase();
        String fName,lName;
        boolean condi = true;
        while (condi) {
            System.out.println("------------------------------");
            System.out.println("| Student Information System |");
            System.out.println("------------------------------");
            System.out.println("Student Information System Menu:");
            System.out.println("[1] Add a student");
            System.out.println("[2] Edit a student");
            System.out.println("[3] Remove a student");
            System.out.println("[4] Get the student information");
            System.out.println("[5] Display all the student information");
            System.out.println("[0] Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();sc.nextLine();
            switch (choice) {
                case 0:
                    condi = false;
                    break;
                case 1:
                    System.out.println(">>> ADD STUDENT");
                    System.out.println("Student count: " + sdb.studentCount + "/50");
                    System.out.println();
                    System.out.print("Enter student first name : ");
                    fName = sc.nextLine();
                    System.out.print("Enter student last name  : ");
                    lName = sc.nextLine();
                    System.out.print("Enter student age        : ");
                    String age = sc.nextLine();
                    System.out.print("Enter student address    : ");
                    String address = sc.nextLine();
                    sdb.addStudent(fName, lName,age,address);
                    break;
                case 2:
                    System.out.println(">>> EDIT STUDENT");
                    System.out.print("Enter student first name : ");
                    fName = sc.nextLine();
                    System.out.print("Enter student last name  : ");
                    lName = sc.nextLine();
                    sdb.editStudentInformation(sdb.indexStudent(fName, lName));
                    break;
                case 3:
                    System.out.println(">>> DELETE STUDENT");
                    System.out.print("Enter student first name : ");
                    fName = sc.nextLine();
                    System.out.print("Enter student last name  : ");
                    lName = sc.nextLine();
                    sdb.removeStudent(sdb.indexStudent(fName, lName));
                    break;
                case 4:
                    System.out.println(">>> GET STUDENT INFORMATION");
                    System.out.println();
                    System.out.print("Enter student first name : ");
                    fName = sc.nextLine();
                    System.out.print("Enter student last name  : ");
                    lName = sc.nextLine();
                    sdb.getStudentInformation(fName,lName);
                    break;
                case 5:
                    System.out.println(">>> STUDENT LIST");
                    System.out.println();
                    sdb.getAllStudentInformation();
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
                    break;
            }
        }
    }
}
