package basic.part1.ex081090;

import java.util.Arrays;

//81. Write a Java program to swap the first and last elements of an array (length must be at least 1)
// and create a new array.
public class Exercise81 {
    public static void main(String[] args) {
        int[] array1 = { 50, -20, 0, 30, 40, 60, 12 };
        System.out.printf("%nArray 1:  %s", Arrays.toString(array1));
        System.out.printf("%nArray 1 after swap:  %s", Arrays.toString(swapFirstAndLast(array1)));
    }

    public static int[] swapFirstAndLast(int[] inArray) {
        if(inArray == null || inArray.length < 2) return inArray;

        int[] outArray = new int[inArray.length];

        outArray[0] = inArray[inArray.length - 1];

        for (int i = 1; i < inArray.length - 1; i++) {
            outArray[i] = inArray[i];
        }

        outArray[inArray.length - 1] = inArray[0];

        return outArray;
    }
}
