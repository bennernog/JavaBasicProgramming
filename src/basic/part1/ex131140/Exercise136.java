package basic.part1.ex131140;

import java.util.stream.LongStream;

/*
    136. Write a Java program to find possible unique paths from top-left corner to bottom-right corner of a given
    grid (m x n).
    Note: You can move either down or right at any point in time.
 */
public class Exercise136 {

    public static void main(String[] args) {
        System.out.println(findNumberOfPathsInGrid(2, 3));
    }

    public static long findNumberOfPathsInGrid(int columns, int rows) {
        return factorial(columns + rows - 2) / (factorial(columns - 1) * factorial(rows - 1));
    }

    public static long factorial(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }
}
