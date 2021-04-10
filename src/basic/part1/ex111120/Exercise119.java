package basic.part1.ex111120;

import java.util.Arrays;

//119. Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array.
public class Exercise119 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 7, 8};
        System.out.printf("%nArray : %s%n", Arrays.toString(array));

        int element = 9;
        int position = 0;

        while (position < array.length && array[position] != element)
            position++;

        System.out.printf(
                "Positon of %d is %s%n",
                element,
                position == array.length ? "non existent" : Integer.toString(position));
    }
}
