package basic.part1.ex131140;

import java.util.Arrays;
import java.util.stream.LongStream;

/*
    136. Write a Java program to find possible unique paths from top-left corner to bottom-right corner of a given
    grid (m x n).
    Note: You can move either down or right at any point in time.
 */
public class Exercise136 {

    public static void main(String[] args) {
        test(4, 4);
    }

    public static void test(int rows, int columns) {

        System.out.println(pathsWithCombinatorics(rows, columns));
        System.out.println(pathFinder(rows, columns));
    }

    public static long pathsWithCombinatorics(int rows, int columns) {
        return factorial(columns + rows - 2) / (factorial(columns - 1) * factorial(rows - 1));
        /* OR
        return LongStream.range(rows, --columns + rows).reduce(1, (long x, long y) -> x * y)
                        /
                LongStream.rangeClosed(1, columns).reduce(1, (long x, long y) -> x * y);
         */
    }

    public static long factorial(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }


    public static int pathFinder(int rows, int columns) {
        int[][] paths = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {

                if(row == 0 || column == 0) paths[row][column] = 1;

                else paths[row][column] = paths[row -1][column] + paths[row][column-1];
            }
        }
//        for (int[] path : paths) {
//            System.out.println(Arrays.toString(path));
//        }
        return paths[rows-1][columns-1];
    }
}
