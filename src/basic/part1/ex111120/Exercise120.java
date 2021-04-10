package basic.part1.ex111120;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//120. Write a Java program that searches a value in an m x n matrix.
public class Exercise120 {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();

        int rows = random.nextInt(10) + 5;
        int columns = random.nextInt(10) + 5;
        int[][] matrix = new int[rows][columns];
        int value = random.nextInt(9) + 1;

        //make matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(9) + 1;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println();
        if (!findValueInMatrix(value, matrix))
            System.out.println("Didn't find value in matrix");
    }

    public static boolean findValueInMatrix(int value, int[][] matrix) {
        boolean found = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == value) {
                    System.out.printf("Value: %d found at (%d, %d)%n", value, row, column);
                    found = true;
                }
            }
        }
        return found;
    }
}
