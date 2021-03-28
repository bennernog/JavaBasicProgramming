package basic.part1.ex101110;

import java.util.Arrays;

//103. Write a Java program to create a new array from a given array of integers, new array will contain the
// elements from the given array after the last element value 10.
public class Exercise103 {
    public static void main(String[] args) {
        int[] array1 = { 11, 10, 13, 10, 45, 20, 33, 53 };

        System.out.printf("%n%s", Arrays.toString(array1));

        System.out.printf("%n%s", Arrays.toString(getSubarray(array1)));
    }

    private static int[] getSubarray(int[] array) {

        int index = array.length;

        do index--;
        while (array[index] != 10);

        return Arrays.stream(array).skip(++index).toArray();
    }
}
