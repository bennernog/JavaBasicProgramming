package basic.part1.ex091100;

import java.util.Arrays;

//95. Write a Java program to create an array (length # 0) of string values.
// The elements will contain "0", "1", "2" … through ... n-1.
public class Exercise95 {
    public static void main(String[] args) {
        int n = 10;
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] =  Integer.toString(i);
            System.out.printf("\"%s\"\t", array[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
