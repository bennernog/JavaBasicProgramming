package basic.part1.ex7180;

import java.util.Arrays;

//76. Write a Java program to test if the first and the last element of two array of integers are same.
// The length of the array must be greater than or equal to 2.
public class Exercise76 {

    public static void main(String[] args) {
        int[] array1 = { 50, -20, 0, 30, 40, 60, 12 };
        int[] array2 = { 45, 20, 10, 20, 30, 50, 11 };

        System.out.printf("%nArray 1:  %s", Arrays.toString(array1));
        System.out.printf("%nArray 2:  %s%n%n", Arrays.toString(array2));
        System.out.println(firstAndLastAreIdentical(array1) && firstAndLastAreIdentical(array2));
    }

    public static boolean firstAndLastAreIdentical(int[] arr) {
        return arr != null
                && arr.length >= 2
                && arr[0] == arr[arr.length -1];
    }
}
