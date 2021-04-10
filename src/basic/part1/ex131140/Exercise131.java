package basic.part1.ex131140;

import java.util.Arrays;

/*
    131. Write a Java program to find the new length of a given sorted array where each element appear only once
    (remove the duplicates ).
    Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7] The length of the original array is: 11 After removing duplicates,
    the new length of the array is: 7
 */
public class Exercise131 {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7 };

        System.out.printf("Count before removing duplicates: %d%n",arr.length);
        System.out.printf("Count after removing duplicates: %d%n",Arrays.stream(arr).distinct().count());

    }
}
