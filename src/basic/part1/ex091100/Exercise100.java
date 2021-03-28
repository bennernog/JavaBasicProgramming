package basic.part1.ex091100;

import java.util.Arrays;

//100. Write a Java program to count the two elements of two given arrays of integers with same length, differ by 1 or less.
public class Exercise100 {
    public static void main(String[] args) {
        int[] array1 = { 10, 11, 10, 20, 43, 20, 50 };
        int[] array2 = { 10, 13, 11, 20, 44, 30, 50 };

        System.out.printf("%n%s",Arrays.toString(array1));
        System.out.printf("%n%s",Arrays.toString(array2));
        System.out.printf("%n%n\tCount = %d%n", checkArray(array1, array2));
    }

    public static int checkArray(int[] array1, int[] array2) {
        int count = 0;
        for(int i = 0; i < array1.length; i++) {
            int diff = array1[i] - array2[i];
            if(diff > -2 && diff < 2) {
                count++;
            }
        }
        return count;
    }
}
