package basic.part1.ex7180;

import java.util.Arrays;

//79. Write a Java program to rotate an array (length 3) of integers in left direction.
public class Exercise79 {
    public static void main(String[] args) {
        int[] array1 = {10, -20, 0, 30, 40, 60, 10};
        int[] array2 = {30, 40, 60, 10, -20, 0, 10};
        int[] array3 = { 20, 30, 40 };

        checkArrays(array1, array2, array3);
    }

    public static void checkArrays(int[]... arrs) {
        for (int[] arr : arrs) {
            System.out.printf(
                    "%nArray: %s \tLeftrotated array: %s",
                    Arrays.toString(arr),
                    Arrays.toString(leftRotateArray(arr))
            );
        }
    }


    public static int[] leftRotateArray(int[] inArray) {
        int length = inArray.length;
        int[] outArray = new int[length];
        for (int i = 0; i < length - 1; i++) {
            outArray[i] = inArray[i+1];
        }
        outArray[length - 1] = inArray[0];

        return outArray;
    }
}
