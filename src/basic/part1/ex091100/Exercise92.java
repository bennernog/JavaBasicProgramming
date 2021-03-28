package basic.part1.ex091100;

import java.util.Arrays;

//92. Write a Java program to count the number of even and odd elements in a given array of integers.
public class Exercise92 {

    public static void main(String[] args) {
        int[] array1 = { 50, -20, 0, 30, 40, 60, 12 };
        int[] array2 = { 45, 20, 10, 20, 30, 50, 11 };

        countEvenAndUneven(array1);
        countEvenAndUneven(array2);
    }

    public static void countEvenAndUneven(int[] array) {
        var even = Arrays.stream(array).filter(i -> i % 2 ==0).count();

        System.out.printf("%nArray :  %s has %d even and %d uneven elements",
                Arrays.toString(array),
                even,
                array.length - even);
    }
}
