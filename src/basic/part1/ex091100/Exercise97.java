package basic.part1.ex091100;

import java.util.Arrays;
import java.util.function.Predicate;

//97. Write a Java program to check if an array of integers contains a specified number next to each
// other or there are two same specified numbers separated by one element.
public class Exercise97 {
    public static void main(String[] args) {

        int[] array = { 45, 20, 10, 20, 30, 50, 11 };
        System.out.println(Arrays.toString(array));
        int number = 20;
        System.out.println(number);

        checkForIdenticalNeighbour(array, i -> i == number);

    }

    public static void checkForIdenticalNeighbour(int[] array, Predicate<Integer> predicate) {
        String s = String.format("%n%s doesn't meet condition%n%n", Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            boolean test = predicate == null ? true : predicate.test(array[i]);
            if(test &&  hasIdenticalNeighbour(array, i)) {

                s = String.format("%n%s meets condition%n%n", Arrays.toString(array), array[i]);
                break;
            }
        }
        System.out.println(s);
    }

    public static boolean hasIdenticalNeighbour(int[] array, int index) {

        return (index > 0 && array[index] == array[index - 1]) ||
                (index > 1 && array[index] == array[index - 2]) ||
                (index < array.length - 2 && array[index] == array[index + 2]) ||
                (index < array.length - 1 && array[index] == array[index + 1]);
    }
}
