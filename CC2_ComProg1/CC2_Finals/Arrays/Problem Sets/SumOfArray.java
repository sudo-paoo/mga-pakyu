import java.util.Scanner;
import java.util.Arrays;

/**
 * @author pao
 *         BSCS 1B
 */
public class SumOfArray {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("| Sum of an array |");
        System.out.println("-------------------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        sc.nextLine();
        int arrayNum[] = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            arrayNum[i] = sc.nextInt();
        }
        for (int k = 0; k < size; k++) {
            sum += arrayNum[k];
        }
        System.out.println("Inputted array: " + Arrays.toString(arrayNum));
        System.out.println("Sum of all elements: " + sum);
    }
}