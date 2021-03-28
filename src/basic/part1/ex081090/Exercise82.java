package basic.part1.ex081090;

import java.util.Arrays;

//82. Write a Java program to find the largest element between first, last,
// and middle values from an array of integers (even length).
public class Exercise82 {
    public static void main(String[] args) {
        int[] array= { 20, 30, 40, 50, 67 };
        System.out.printf("%nArray :  %s%n%n", Arrays.toString(array));

        System.out.println(Math.max(array[0], Math.max(array[array.length-1],array[array.length/2]) ));
    }
}
