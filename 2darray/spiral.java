import java.util.*;

public class spiral {
    public static void spiralOrder(int[][] matrix) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(matrix[startrow][i] + " ");
            }
            for (int j = startrow + 1; j <= endrow; j++) {
                System.out.print(matrix[j][endcol] + " ");
            }
            if (startrow < endrow) {
                for (int k = endcol - 1; k >= startcol; k--) {
                    System.out.print(matrix[endrow][k] + " ");
                }
            }
            if (startcol < endcol) {
                for (int l = endrow - 1; l > startrow; l--) {
                    System.out.print(matrix[l][startcol] + " ");
                }
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        spiralOrder(matrix);
    }
}
 