package basic.part1.ex091100;

import java.util.Arrays;
import java.util.function.Predicate;

//98. Write a Java program to check if the value 20 appears three times and no 20's are
// next to each other in a given array of integers.
public class Exercise98 {
    public static void main(String[] args) {

        int[] array = { 45, 20, 10, 20, 30, 50, 20, 11 };
        System.out.println(Arrays.toString(array));
        int number = 20;
        System.out.println(number);

        checkForIdenticalNeighbour(array, i -> i == number);

    }

    public static void checkForIdenticalNeighbour(int[] array, Predicate<Integer> predicate) {
        String s = String.format("%n%s doesn't meet condition%n%n", Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean test = predicate == null ? true : predicate.test(array[i]);
            if(test &&  !hasIdenticalNeighbour(array, i)) {
                count++;
                if (count > 2) {
                    s = String.format("%n%s meets condition%n%n", Arrays.toString(array), array[i]);
                    break;
                }
            }
        }
        System.out.println(s);
    }

    public static boolean hasIdenticalNeighbour(int[] array, int index) {

        return (index > 0 && array[index] == array[index - 1]) ||
                (index < array.length - 1 && array[index] == array[index + 1]);
    }
}
