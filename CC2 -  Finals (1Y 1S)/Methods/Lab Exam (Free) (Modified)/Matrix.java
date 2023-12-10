/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixSystem ms = new MatrixSystem();
        System.out.println("----------------------");
        System.out.println("| Java Matrix System |");
        System.out.println("----------------------");
        System.out.print("Enter number of rows   : ");
        int m = sc.nextInt();
        System.out.print("Enter number of column : ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        boolean condi = true;
        while (condi){
            System.out.println("Matrix Operations Menu:");
            System.out.println("1. Input elements into matrix");
            System.out.println("2. Display elements in matrix");
            System.out.println("3. Sum of all elements in matrix");
            System.out.println("4. Display row-wise sum");
            System.out.println("5. Display column-wise sum");
            System.out.println("6. Create transpose of matrix");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ms.addElement(matrix, m ,n);
                    break;
                case 2:
                    ms.displayMatrix(matrix);
                    break;
                case 3:
                    System.out.println("------------------------------");
                    System.out.println("| Sum of All Matrix Elements |");
                    System.out.println("------------------------------");
                    System.out.println("Sum of all elements in matrix: " + ms.calculateSum(matrix));
                    break;
                case 4:
                    ms.displayPerRow(matrix);
                    break;
                case 5:
                    ms.displayPerColumn(matrix);
                    break;
                case 6:
                    System.out.println("-----------------------------");
                    System.out.println("| Transpose Matrix Elements |");
                    System.out.println("-----------------------------");
                    int[][] transpose = ms.createTranspose(matrix, m, n);
                    ms.displayMatrix(transpose);
                    break;
                case 0:
                    System.out.println("-----------------------");
                    System.out.println("| Exitted the Program |");
                    System.out.println("-----------------------");
                    condi = false;
                    break;
                default:
                    System.out.println("Invalid choice try again");
                    break;
            }
        }
    }
}
