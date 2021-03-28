package basic.part1.ex071080;

import java.util.Arrays;

//80. Write a Java program to get the larger value between first and last element of an array (length 3) of integers .
public class Exercise80 {
    public static void main(String[] args) {
        int[] array = { 20, 30, 40 };
        System.out.printf("%nArray: %s %n%n", Arrays.toString(array));

        System.out.println(Math.max(array[0], array[array.length-1]));

    }
}
