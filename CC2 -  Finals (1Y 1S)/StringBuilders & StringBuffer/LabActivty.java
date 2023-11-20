/**
 * @author pao
 * BSCS 1B
 */
public class LabActivty {
    public static void main(String[] args) {
        String str1 = "GMRIT";
        String str2 = " it department";
        
        System.out.println("String 1 = " + str1);
        System.out.println("String 2 = " + str2);
        System.out.println("The concatenation of two string is " + (str1 + str2));
        System.out.println("The character at the 7th place of string 2 is " + str2.charAt(7));
        System.out.println("The comparison of two strings is " + str1.compareTo(str2));
        System.out.println("Boolean comparison ignoring case considerations " + str1.equalsIgnoreCase(str2));
        System.out.println("Index of E in string 2 is " + str2.indexOf("e"));
        System.out.println("Length of string 2 is " + str2.length());
        System.out.println("Substring of string 2: " + str2.substring(4));
        System.out.println("Substring of string 2 from 4 to 9: " + str2.substring(4, 9));
        System.out.println("Lower case of string 1 is : " + str1.toLowerCase());
        System.out.println("UPPER case of string 2 is : " + str2.toUpperCase());
    }
}
