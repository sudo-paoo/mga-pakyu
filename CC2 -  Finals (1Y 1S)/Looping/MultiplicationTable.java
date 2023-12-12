/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter ending number   : ");
        int end = sc.nextInt();
        System.out.print("Enter table number    : ");
        int table = sc.nextInt();
        while (start<=end) {
            int temp = start * table;
            System.out.println(start + " * " + table + " = " + temp);
            start++;
        }
    }
}
