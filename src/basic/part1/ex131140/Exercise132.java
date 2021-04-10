package basic.part1.ex131140;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    132. Write a Java program to find the new length of a given sorted array where duplicate elements appeared at
    most twice.
    Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
    The length of the original array is: 13
    After removing duplicates, the new length of the array is: 10
 */
public class Exercise132 {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7 };

        System.out.printf("Count before removing duplicates: %d%n", arr.length);
        System.out.printf(
                "Count after removing duplicates: %d%n",
                Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .values()
                        .stream()
                        .map(l -> l = l > 2 ? 2L : l)
                        .reduce(0L, Long::sum)
        );

    }

}
