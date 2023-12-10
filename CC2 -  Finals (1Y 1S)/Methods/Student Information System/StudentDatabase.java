import java.util.Scanner;
/**
 * @author pao
 * BSCS 1B
 */
import java.util.Arrays;
public class StudentDatabase {
    Scanner sc = new Scanner(System.in);
    int studentCount = 0;
    String[] firstName = new String[0];
    String[] lastName = new String[0];
    String[] studentAge = new String[0];
    String[] studentAddress = new String[0];
    int[] studentNumber = new int[0];
    public int indexStudent (String fName, String lName){
        boolean isFound = false;
        for (int i = 0; i < firstName.length; i++) {
            if (fName.equalsIgnoreCase(firstName[i]) && lName.equalsIgnoreCase(lastName[i])) {
                isFound = true;
                return i;
            }
        }
        if (!isFound){
            System.out.println(">>> STUDENT NOT FOUND/ENROLLED");
        }
        return -1;
    }
    public void addStudent(String fName, String lName, String age, String address) {
        firstName = Arrays.copyOf(firstName, firstName.length + 1);
        firstName[studentCount] = fName;
        lastName = Arrays.copyOf(lastName, lastName.length + 1);
        lastName[studentCount] = lName;
        studentAge = Arrays.copyOf(studentAge, studentAge.length + 1);
        studentAge[studentCount] = age;
        studentAddress = Arrays.copyOf(studentAddress, studentAddress.length + 1);
        studentAddress[studentCount] = address;
        studentNumber = Arrays.copyOf(studentNumber, studentNumber.length + 1);
        studentNumber[studentCount] = 202300 + studentCount;
        studentCount++;
    }
    public void editStudentInformation(int i){
        System.out.println(">>> STUDENT FOUND");
        System.out.println("Full name       : " + firstName[i].toUpperCase() + " " + lastName[i].toUpperCase());
        System.out.println("Age             : " + studentAge[i]);
        System.out.println("Address         : " + studentAddress[i]);
        System.out.println("Student Number  : " + studentNumber[i]);
        System.out.println();
        System.out.println(">>> CHANGE STUDENT INFORMATION");
        System.out.print("Enter student first name : ");
        firstName[i] = sc.nextLine();
        System.out.print("Enter student last name  : ");
        lastName[i] = sc.nextLine();
        System.out.print("Enter student age        : ");
        studentAge[i] = sc.nextLine();
        System.out.print("Enter student address    : ");
        studentAddress[i] = sc.nextLine();
        System.out.println(">>> EDIT SUCCESS");
        if (i == -1) System.out.println(">>> STUDENT NOT FOUND/ENROLLED");
    }
    public void removeStudent(int indexRem) {
        if (indexRem >= 0 && indexRem < firstName.length) {
            for (int i = indexRem; i < firstName.length - 1; i++) {
                firstName[i] = firstName[i + 1];
                lastName[i] = lastName[i + 1];
                studentAge[i] = studentAge[i + 1];
                studentAddress[i] = studentAddress[i + 1];
                studentNumber[i] = studentNumber[i + 1];
            }
            firstName = Arrays.copyOf(firstName, firstName.length - 1);
            lastName = Arrays.copyOf(lastName, lastName.length - 1);
            studentAge = Arrays.copyOf(studentAge, studentAge.length - 1);
            studentAddress = Arrays.copyOf(studentAddress, studentAddress.length - 1);
            studentNumber = Arrays.copyOf(studentNumber, studentNumber.length - 1);
            studentCount--;
            System.out.println(">>> STUDENT REMOVED SUCCESSFULLY");
        } else {
            System.out.println(">>> STUDENT NOT FOUND/INVALID INDEX");
        }
    }
    public void getStudentInformation(String fName, String lName) {
        boolean isFound = false;
        for (int i = 0; i < firstName.length; i++) {
            if (fName.equalsIgnoreCase(firstName[i]) && lName.equalsIgnoreCase(lastName[i])) {
                isFound = true;
                System.out.println(">>> STUDENT FOUND");
                System.out.println("Full name       : " + firstName[i].toUpperCase() + " " + lastName[i].toUpperCase());
                System.out.println("Age             : " + studentAge[i]);
                System.out.println("Address         : " + studentAddress[i]);
                System.out.println("Student Number  : " + studentNumber[i]);
            }
        }
        if (!isFound)System.out.println(">>> STUDENT NOT FOUND/ENROLLED");
    }
    public void getAllStudentInformation() {
        for(int i = 0; i < firstName.length; i++){
            System.out.println("-----------------------");
            System.out.println("| Student Information |");
            System.out.println("-----------------------");
            System.out.println("Full name       : " + firstName[i].toUpperCase() + " " + lastName[i].toUpperCase());
            System.out.println("Age             : " + studentAge[i]);
            System.out.println("Address         : " + studentAddress[i]);
            System.out.println("Student Number  : " + studentNumber[i]);
            System.out.println("======================");
        }
    }
}
