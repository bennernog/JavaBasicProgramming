package basic.part1.ex131140;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
    139. Write a Java program to get the index of the first number and the last number of a subarray
    where the sum of numbers is zero from a given array of integers.
    Original Array : [1, 2, 3, -6, 5, 4]
    Index of the subarray of the said array where the sum of numbers is zero: [0, 3]
 */
public class Exercise139 {

    public static void main(String[] args) {
        int[] arr = { 5, 4 ,-6, 1, 2, 3 };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(zeroSumSubarray(arr)));

//        args[0].subs
    }

    public static int[] zeroSumSubarray(int[] array) {
        if (array != null && array.length > 0) {
            int sum = array[0];
            int start = 0;
            int end = 0;
            int maxIndex = array.length -1;

            while (sum != 0 && start < maxIndex){
                if(end < maxIndex){
                    sum += array[++end];
                } else {
                    start++;
                    end = start;
                    sum = array[start];
                }

            }

            if (sum == 0) return new int[]{ start, end };

        }
        return null;
    }
}
