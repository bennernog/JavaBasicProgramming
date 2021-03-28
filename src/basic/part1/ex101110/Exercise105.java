package basic.part1.ex101110;

import java.util.Arrays;

//105. Write a Java program to check if a group of numbers (l = 2) at the start and end of a given array are same.
public class Exercise105 {
    public static void main(String[] args) {
        int[] array = {11, 15, 13, 10, 45, 20, 11, 15};
        System.out.println("Array: "+ Arrays.toString(array));

        System.out.println(checkArray(array, 2));
    }

    public static boolean checkArray(int[] array, int l) {

        int start = 0;
        int end = array.length - l;

        for(int i = 0; i < l; i++){

            if(array[start] != array[end]) {
                return false;
            } else {
                start++;
                end++;
            }
        }

        return true;
    }
}
