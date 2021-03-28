package basic.part1.ex091100;

import java.util.Arrays;
import java.util.function.Predicate;

//93. Write a Java program to test if an array of integers contains an element 10 next to 10 or
// an element 20 next to 20, but not both.
public class Exercise93 {
    public static void main(String[] args) {

        int[] array1 = { 50, -20, 0, 30, 40, 60, 12 };
        int[] array2 = { 45, 20, 20, 10, 30, 50, 11 };
        Predicate<Integer> predicate = i -> i == 10 || i == 20;
        checkForIdenticalNeighbour(array1, predicate);
        checkForIdenticalNeighbour(array2, predicate);
    }

    public static void checkForIdenticalNeighbour(int[] array, Predicate<Integer> predicate) {
        String s = String.format("%n%s doesn't have a neighbouring pair%n%n", Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            boolean test = predicate == null ? true : predicate.test(array[i]);
            if(test && hasIdenticalNeighbour(array, i)) {

                s = String.format("%n%s has %d as a neighbouring pair%n%n", Arrays.toString(array), array[i]);
                break;
            }
        }
        System.out.println(s);
    }

    public static boolean hasIdenticalNeighbour(int[] array, int index) {

        return (index > 0 && array[index] == array[index -1]) ||
                (index < array.length - 1 && array[index] == array[index + 1]);
    }
}
