import java.util.Scanner;
import java.util.Arrays;
/**
 * @author pao
 * BSCS 1B
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayNum[] = {1,2,3,4,5};
        System.out.print("Enter rotation: ");
        int rotation = sc.nextInt();
        System.out.println("Old array: " + Arrays.toString(arrayNum));
        int n = arrayNum.length;

        for (int i = 0; i < rotation; i++) {
            int lastElement = arrayNum[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arrayNum[j] = arrayNum[j - 1];
            }
            arrayNum[0] = lastElement;
        }
        System.out.println("New array: " + Arrays.toString(arrayNum));
     }
}
