package basic.part1.ex111120;

import java.util.Arrays;
import java.util.stream.IntStream;

//113. Write a Java program to merge two given sorted array of integers and create a new sorted array.
//array1 = [1,2,3,4]
//array2 = [2,5,7, 8]
//result = [1,2,2,3,4,5,7,8]
public class Exercise113 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 5, 7, 8};
        System.out.printf("%nArray 1: %s%nArray 2 : %s%n", Arrays.toString(array1),Arrays.toString(array2));

        int[] sorted = IntStream
                .concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray();

        System.out.printf("%nSorted : %s%n", Arrays.toString(sorted));
    }
}
