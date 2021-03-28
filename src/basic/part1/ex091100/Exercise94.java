package basic.part1.ex091100;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//94. Write a Java program to rearrange all the elements of a given array of
// integers so that all the odd numbers come before all the even numbers.
public class Exercise94 {

    public static void main(String[] args) {

        int[] array1 = { 53, -20, 100, 35, 40, 61, 12 };
        int[] array2 = { 45, 20, 24, 13, 30, 50, 11 };

        rearrangeOddBeforeEven(array1);
        rearrangeOddBeforeEven(array2);

    }

    public static void rearrangeOddBeforeEven(int[] array) {
        System.out.printf("%nBefore rearrange: %s", Arrays.toString(array));
        System.out.printf("%n%nAfter rearrange: %s", Arrays.toString(oddBeforeEven(array)));
    }

    public static int[] oddBeforeEven(int[] array) {
        var even = Arrays.stream(array).filter(i -> i % 2 ==0);
        var uneven = Arrays.stream(array).filter(i -> i % 2 !=0);

        return IntStream.concat(uneven,even).toArray();
    }
}
