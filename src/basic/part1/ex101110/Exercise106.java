package basic.part1.ex101110;

import basic.part1.ex071080.Exercise79;

import java.util.Arrays;

//106. Write a Java program to create a new array that is left shifted from a given array of integers.
public class Exercise106 {
    public static void main(String[] args) {
        int[] array = { 11, 15, 13, 10, 45, 20 };
        System.out.printf("Original Array: %s%n", Arrays.toString(array));

        System.out.printf("Left shifted Array: %s%n", Arrays.toString(Exercise79.leftRotateArray(array)));
    }
}
