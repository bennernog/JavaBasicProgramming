package basic.part1.ex121130;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//129. Write a Java program to find a number that appears only once in a given array of integers, all numbers occur twice.
public class Exercise129 {

    public static void main(String[] args) {

        int[] arr = { 10, 20, 10, 20, 30, 40, 40, 30, 50 };

        System.out.println(getUnique(arr));
        System.out.println(getUniqueNumber(arr));

    }

    public static int getUniqueNumber(int[] array) {

        return (int) Arrays.stream(array)
                .boxed()
                .collect(Collectors
                        .groupingBy(
                                Function.identity(),
                                Collectors.counting() ))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .orElseThrow()
                .getKey();

    }

    public static int getUnique(int[] array) {
        int result = -1;
        HashMap<Integer, Boolean> map = new HashMap<>();


        for (int i : array) {
            if (map.containsKey(i)) map.put(i, true);
            else {
                map.put(i, false);
            }
        }

        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (!entry.getValue())
                result = entry.getKey();
        }

        return result;
    }
}
