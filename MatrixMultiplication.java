import java.util.*;

public class MatrixMultiplication {

    public static void main(String[] args) {

        int[][] mat1 = { { 2, 3, 4 }, { 3, 4, 5 }, { 4, 5, 6 } };
        int[][] mat2 = { { 2, 3, 4 }, { 3, 4, 5 }, { 4, 5, 6 } };
        int[][] result = new int[3][3];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                result[i][j] = mat1[i][j] * mat2[i][j];
            }
        }
        for (int[] arr : result) {
            System.out.println("Array" + Arrays.toString(arr));
        }
    }

}