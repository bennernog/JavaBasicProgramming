package basic.part1.ex121130;

import java.util.Arrays;

//123. Write a Java program to find the subarray with smallest sum from a given array of integers.
public class Exercise123 {

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(getSmallestSubarray(arr)));
        System.out.println(getMinimumSum(arr));
    }

    public static int getMinimumSum(int[] array) {

        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int value : array) {
            sum = Math.min(sum + value, value);

            min = Math.min(min, sum);
        }

        return min;
    }

    public static int[] getSmallestSubarray(int[] array) {

        int min = Integer.MAX_VALUE;
        int sum = 0;
        int startSum = 0;
        int endSum = 0;
        int startMax = 0;
        int endMax = 0;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < sum + value) {
                sum = value;
                startSum = endSum = i;
            } else {
                sum += value;
                endSum = i;
            }

            if (sum < min) {
                min = sum;
                startMax = startSum;
                endMax = endSum;
            }
        }

        int[] result = new int[endMax - startMax + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i + startMax];
        }

        return result;
    }

}
