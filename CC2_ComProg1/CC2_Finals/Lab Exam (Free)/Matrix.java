/**
 * @author pao
 * BSCS 1B
 */
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    System.out.println("-------------------------");
                    System.out.println("| Enter Matrix Elements |");
                    System.out.println("-------------------------");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                            matrix[i][j] = sc.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("-------------------");
                    System.out.println("| Matrix Elements |");
                    System.out.println("-------------------");
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("------------------------------");
                    System.out.println("| Sum of All Matrix Elements |");
                    System.out.println("------------------------------");
                    int sum = 0;
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            sum += matrix[i][j];
                        }
                    }
                    System.out.println("Sum of all elements in matrix: " + sum);
                    break;
                case 4:
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
                    break;
                case 5:
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
                    break;
                case 6:
                    System.out.println("-----------------------------");
                    System.out.println("| Transpose Matrix Elements |");
                    System.out.println("-----------------------------");
                    int[][] transpose = new int[n][m];
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            transpose[j][i] = matrix[i][j];
                        }
                    }
                    for (int i = 0; i < transpose.length; i++) {
                        for (int j = 0; j < transpose[i].length; j++) {
                            System.out.print(transpose[i][j] + "\t");
                        }
                        System.out.println();
                    }
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
