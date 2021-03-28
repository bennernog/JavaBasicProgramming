package basic.part1.ex101110;

import java.util.Arrays;

//101. Write a Java program to check if the number of 10 is greater than number to 20's in a given array of integers.
public class Exercise101 {
    public static void main(String[] args) {
        int[] array1 = { 10, 11, 10, 20, 43, 20, 50 };

        System.out.printf("%n%s", Arrays.toString(array1));
        checkArray(array1);
    }

    public static void checkArray(int[] array1) {
        int count10 = 0;
        int count20 = 0;
        for(int i = 0; i < array1.length; i++) {
            if(i == 10) count10++;
            if(i == 20) count20++;
        }

        System.out.printf(
                count10 == count20 ?
                        "%n%nThere are as many %d's as %d's in this array.":
                        "%n%nThere are more %d's than %d's in this array.",
                count10 > count20 ? 10 : 20,
                count10 > count20 ? 20 : 10);
    }
}
