package basic.part1.ex071080;

import java.util.Arrays;

//74. Write a Java program to test if 10 appears as either the first or last element of an array of integers.
// The length of the array must be greater than or equal to 2.
public class Exercise74 {
    public static void main(String[] args) {
        int[] array1 = { 10, -20, 0, 30, 40, 60, 10 };
        int[] array2 = { 30, 40, 60, 10, -20, 0, 10 };
        int[] array3 = { 10, 40, 60, 100, -20, 0, 3 };
        int[] array4 = { 0, 20, 62, 100, 520, 10, 8 };
        int[] array5 = { 10 };

        checkArrays(array1, array2, array3, array4, array5);
    }

    public static void checkArrays(int[]...arrs) {
        for (int[] arr : arrs) {
            boolean istrue = firstIsTen(arr) || lastIsTen(arr);
            System.out.printf("%nArray %s meets conditions? %b", Arrays.toString(arr),istrue);
        }
    }
    
    public static boolean firstIsTen(int[] arr) {

        return arr != null && arr.length >= 2 && arr[0] == 10;
    }

    public static boolean lastIsTen(int[] arr) {

        return arr != null && arr.length >= 2 && arr[arr.length -1] == 10;
    }
}
