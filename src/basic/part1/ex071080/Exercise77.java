package basic.part1.ex071080;

import java.util.Arrays;

//77. Write a Java program to create a new array of length 2 from two arrays of integers with three elements
// and the new array will contain the first and last elements from the two arrays.
public class Exercise77 {
    public static void main(String[] args) {
        int[] array1 = { 50, -20, 0 };
        int[] array2 = { 5, -50, 10 };

        System.out.printf("%nArray 1:  %s", Arrays.toString(array1));
        System.out.printf("%nArray 2:  %s%n%n", Arrays.toString(array2));

        int[] result = { array1[0], array2[array2.length-1]};
        System.out.printf("%nNew array:  %s", Arrays.toString(result));

    }
}
