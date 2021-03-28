package basic.part1.ex091100;

import java.util.Arrays;

//96. Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.
public class Exercise96 {
    public static void main(String[] args) {

        int[] array = { 45, 20, 10, 20, 30, 50, 11 };
        System.out.println(Arrays.toString(array));
        checkArray(array);
    }

    public static void checkArray(int[] arr) {
        int index = -1;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 10){
                index = i;
            } else if (arr[i] == 20) {
                if(index > -1 && index < i) {
                    System.out.println("array meets condition");
                    found = true;
                }
            }
        }

        if(!found)System.out.println("array doesn't meet condition");
    }
}
