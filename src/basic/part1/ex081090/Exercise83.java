package basic.part1.ex081090;

import java.util.Arrays;

//83. Write a Java program to multiply corresponding elements of two arrays of integers.
public class Exercise83 {
    public static void main(String[] args) {
        int[] array1 = { 50, -20, 0, 30, 40, 60, 12 };
        int[] array2 = { 45, 20, 10, 20, 30, 50, 11 };

        System.out.printf("%nArray 1:  %s", Arrays.toString(array1));
        System.out.printf("%nArray 2:  %s%n%n", Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            System.out.printf(" %d", array1[i] * array2[i]);
        }
    }
}
