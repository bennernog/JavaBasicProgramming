package basic.part1.ex101110;

import java.util.Arrays;

//102. Write a Java program to check if a specified array of integers contains 10's or 30's.
public class Exercise102 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 10, 20, 40, 20, 50};
        int[] array2 = { 45, 20, 30, 20, 30, 50, 20, 11 };
        int[] array3 = { 45, 20, 70, 20, 60, 50, 20, 11 };

        System.out.printf("%n%s\t:", Arrays.toString(array1));
        System.out.println(checkArray(array1));
        System.out.printf("%n%s\t:",Arrays.toString(array2));
        System.out.println(checkArray(array2));
        System.out.printf("%n%s\t:",Arrays.toString(array3));
        System.out.println(checkArray(array3));
    }

    public static boolean checkArray(int[] array) {

        for(int i : array) {

            if(i == 10 || i == 30) {

                return true;
            }
        }

        return false;
    }
}
