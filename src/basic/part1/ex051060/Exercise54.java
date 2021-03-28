package basic.part1.ex051060;

import tools.InputRequests;
import java.util.Scanner;

/*
    54. Write a Java program that accepts three integers from the user and return true if two
    or more of them (integers ) have the same rightmost digit. The integers are non-negative.
 */
public class Exercise54 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "Input the first positive number:", i -> i > -1);
        var number2 = InputRequests.requestInt(scanner, "Input the second positive number:", i -> i > -1);
        var number3 = InputRequests.requestInt(scanner, "Input the third positive number:", i -> i > -1);

        System.out.println(checkNumbers(number1, number2, number3));

        scanner.close();
    }

    public static boolean checkNumbers(int a, int b, int c) {
        var s1 = Integer.toString(a);
        var s2 = Integer.toString(b);
        var s3 = Integer.toString(c);

        return s1.charAt(s1.length() -1) == s2.charAt(s2.length() -1) ||
                s1.charAt(s1.length() -1) == s3.charAt(s3.length() -1) ||
                s2.charAt(s2.length() -1) == s3.charAt(s3.length() -1);
    }
}
