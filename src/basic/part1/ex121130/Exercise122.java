package basic.part1.ex121130;

import java.util.Arrays;

/*
    122. Write a Java program to find a contiguous subarray with largest sum from a given array of integers.
    Note: In computer science, the maximum subarray problem is the task of finding the contiguous subarray within a
    one-dimensional array of numbers which has the largest sum. For example, for the sequence of values
    −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous subarray with the largest sum is 4, −1, 2, 1, with sum 6.
    The subarray should contain one integer at least.
 */
public class Exercise122 {

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(getMaximumSubArray(arr)));
        System.out.println(getMaximumSum(arr));
    }

    public static int getMaximumSum(int[] array) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int value : array) {
            sum = Math.max(sum + value, value);

            max = Math.max(max, sum);
        }

        return max;
    }

    public static int[] getMaximumSubArray(int[] array) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int startSum = 0;
        int endSum = 0;
        int startMax = 0;
        int endMax = 0;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value > sum + value) {
                sum = value;
                startSum = endSum = i;
            } else {
                sum += value;
                endSum = i;
            }

            if (sum > max) {
                max = sum;
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
