import java.util.*;

public class creation {

    public static void fun(int matrix[][], int key) {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("Enter the elements of 5x5 matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
