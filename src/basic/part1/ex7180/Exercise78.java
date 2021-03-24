package basic.part1.ex7180;

import java.util.Arrays;

//78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
public class Exercise78 {

    public static void main(String[] args) {
        int[] array1 = {10, -20, 0, 30, 40, 60, 10};
        int[] array2 = {30, 40, 60, 10, -20, 0, 10};
        int[] array3 = {5, 7};

        checkArrays(array1, array2, array3);
    }

    public static void checkArrays(int[]... arrs) {
        for (int[] arr : arrs) {
            boolean istrue = contains4Or7(arr);
            System.out.printf("%nArray %s meets conditions? %b", Arrays.toString(arr), istrue);
        }
    }

    public static boolean contains4Or7(int[] arr) {
        for (int i : arr) {
            if (i == 4 || i == 7) return true;
        }
        return false;
    }
}