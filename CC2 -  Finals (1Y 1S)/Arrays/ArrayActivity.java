import java.util.Arrays;
/**
 * @author pao
 * BSCS 1B
 */
public class ArrayActivity {
    public static void main(String[] args) {
        String firstName[] = {"Maria","Antonio","Juan","Pedro","Jim","Clara"};
        char middleInitial[] = {'C','B','E','F','H','M'};
        String lastName[] = {"Dela Cruz","San Juan","Guzman","Rizal","Cunanan","Seguin"};
        int age[] = {19,20,21,22,23,24};
        int studentNo[] = {20183015,20195171,20201538,20217185,20223157,20235001};
        boolean isEnrolled[] = {true,false,true,false,true,false};
       
        // activity 3.1
        
        for (int i = 0; i < 6; i++) {
            System.out.println("-----------------------");
            System.out.println("| Student Information |");
            System.out.println("-----------------------");
            System.out.println("Fullname      : " + firstName[i] + " " + middleInitial[i] + ". " + lastName[i]);
            System.out.println("Age           : " + age[i]);
            System.out.println("Student Number: " + studentNo[i]);
            System.out.println("Is Enrolled?    " + isEnrolled[i]);
            System.out.println("================================");
        }
        
        // activity 3.2
        
        System.out.println("-----------------------");
        System.out.println("| Student Information |");
        System.out.println("-----------------------");
        System.out.println("firstName      = " + Arrays.toString(firstName));
        System.out.println("middleInitial  = " + Arrays.toString(middleInitial));
        System.out.println("lastName       = " + Arrays.toString(lastName));
        System.out.println("Age            = " + Arrays.toString(age));
        System.out.println("Student Number = " + Arrays.toString(studentNo));
        System.out.println("Is Enrolled    = " + Arrays.toString(isEnrolled));
        System.out.println("================================");
    }
}
