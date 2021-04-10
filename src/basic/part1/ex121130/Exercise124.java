package basic.part1.ex121130;

import java.util.Arrays;

/*
    124. Write a Java program to find the index of a value in a sorted array. If the value does not find
    return the index where it would be if it were inserted in order.
    Example:
    [1, 2, 4, 5, 6] 5(target) -> 3(index)
    [1, 2, 4, 5, 6] 0(target) -> 0(index)
    [1, 2, 4, 5, 6] 7(target) -> 5(index)
 */
public class Exercise124 {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 5, 6 };

        int[] targets = { 5, 0, 7 };

        for (int target : targets) {
            System.out.printf(
                    "%n%s %d (target) -> %d (index)",
                    Arrays.toString(arr),
                    target,
                    findTargetIndex(arr, target)
            );
        }
    }

    public static int findTargetIndex(int[] array, int target) {

        int index = -1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == target) index = i;
        }

        return index == -1 ? findTargetIndexSorted(array, target) : index;
    }

    public static int findTargetIndexSorted(int[] array, int target) {

        Arrays.sort(array);
        int index = -1;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == target) index = i;
            else if (target > array[i]) index = i + 1;
        }

        return index;
    }
}
