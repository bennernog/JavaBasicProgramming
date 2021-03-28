package basic.part1.ex091100;

import java.util.Arrays;

//99. Write a Java program to check if a specified number appears in every pair of adjacent element of a given array of integers.
public class Exercise99 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 10, 20, 40, 20, 50};
        int[] array2 = { 45, 20, 10, 20, 30, 50, 20, 11 };
        int number = 20;

        System.out.printf("%n%s\t:",Arrays.toString(array1));
        System.out.println(checkArray(array1, number));
        System.out.printf("%n%s\t:",Arrays.toString(array2));
        System.out.println(checkArray(array2, number));
    }

    public static boolean checkArray(int[] array, int number) {

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] != number && array[i + 1] != number) {
                return false;
            }
        }
        return true;
    }
}
