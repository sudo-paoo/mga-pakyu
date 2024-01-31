import java.util.Arrays;

public class StudentDatabase {
    private static String[] firstNames = new String[0];
    private static String[] middleNames = new String[0];
    private static String[] lastNames = new String[0];
    private static String[] studentAddress = new String[0];
    private static int[] studentAge = new int[0];
    String status;

    // CREATE
    public void createStudent(String fName, String mName, String lName, String sAddress, int sAge) {
        int newLength = firstNames.length + 1;
        firstNames = Arrays.copyOf(firstNames, newLength);
        middleNames = Arrays.copyOf(middleNames, newLength);
        lastNames = Arrays.copyOf(lastNames, newLength);
        studentAddress = Arrays.copyOf(studentAddress, newLength);
        studentAge = Arrays.copyOf(studentAge, newLength);

        firstNames[newLength - 1] = fName;
        middleNames[newLength - 1] = mName;
        lastNames[newLength - 1] = lName;
        studentAddress[newLength - 1] = sAddress;
        studentAge[newLength - 1] = sAge;

        status = "Student registered successfully";
    }

    // UPDATE
    public void updateStudent(int indexUpdate, String fName, String mName, String lName, int age, String add) {
        firstNames[indexUpdate] = fName;
        middleNames[indexUpdate] = mName;
        lastNames[indexUpdate] = lName;
        studentAge[indexUpdate] = age;
        studentAddress[indexUpdate] = add;
        status = "Student updated successfully";
    }

    // DELETE
    public void removeStudent(int indexRem) {
        if (indexRem >= 0 && indexRem < firstNames.length) {
            for (int i = indexRem; i < firstNames.length - 1; i++) {
                firstNames[i] = firstNames[i + 1];
                middleNames[i] = middleNames[i + 1];
                lastNames[i] = lastNames[i + 1];
                studentAge[i] = studentAge[i + 1];
                studentAddress[i] = studentAddress[i + 1];
            }
            int newLength = firstNames.length - 1;
            firstNames = Arrays.copyOf(firstNames, newLength);
            lastNames = Arrays.copyOf(lastNames, newLength);
            studentAge = Arrays.copyOf(studentAge, newLength);
            studentAddress = Arrays.copyOf(studentAddress, newLength);
        }
        status = "Student deleted successfully";
    }
}
