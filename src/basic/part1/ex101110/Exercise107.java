package basic.part1.ex101110;

import java.util.Arrays;

//107. Write a Java program to check if an array of integers contains three increasing adjacent numbers.
public class Exercise107 {
    public static void main(String[] args) {
        int[] array = {11, 45, 20, 12, 18, 14};
        System.out.printf("Array: %s%n", Arrays.toString(array));

        System.out.println(checkArray(array));

    }

    public static boolean checkArray(int[] array) {

        for (int i = 1; i < array.length - 1; i++) {
            if(array[i - 1] == array[i] - 1 && array[i + 1] == array[i] + 1)
                return true;
        }

        return false;
    }
}
