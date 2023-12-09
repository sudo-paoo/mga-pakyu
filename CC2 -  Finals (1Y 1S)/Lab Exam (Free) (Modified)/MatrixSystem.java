/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class MatrixSystem {
    public void addElement(int[][] matrix, int m, int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("| Enter Matrix Elements |");
        System.out.println("-------------------------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    public void displayMatrix(int[][] matrix) {
        System.out.println("-------------------");
        System.out.println("| Matrix Elements |");
        System.out.println("-------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int calculateSum(int[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public void displayPerRow(int[][] matrix){
        System.out.println("----------------------------");
        System.out.println("| Row-wise Sum of Elements |");
        System.out.println("----------------------------");
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + i + ": " + rowSum);
        }
    }
    public void displayPerColumn(int[][] matrix){
        System.out.println("-------------------------------");
        System.out.println("| Column-wise Sum of Elements |");
        System.out.println("-------------------------------");
        for (int j = 0; j < matrix[0].length; j++) {
            int columnSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                columnSum += matrix[i][j];
            }
            System.out.println("Column " + j + ": " + columnSum);
        }
    }
    public int[][] createTranspose(int[][] matrix, int m, int n) {
        int[][] transpose = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
