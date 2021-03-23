package basic.part1.ex5160;

import tools.InputRequests;
import java.util.Scanner;

/*
    53. Write a Java program that accepts three integers from the user and return true if the second number is greater
    than first number and third number is greater than second number.
    If "abc" is true second number does not need to be greater than first number.
 */
public class Exercise53 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "Input the first number:");
        var number2 = InputRequests.requestInt(scanner, "Input the second number:");
        var number3 = InputRequests.requestInt(scanner, "Input the third number:");

        System.out.println(checkNumbers(number1, number2, number3, true));

        scanner.close();
    }

    public static boolean checkNumbers(int a, int b, int c, boolean abc) {
        if(abc)
            return (c > b);
        return (c > b && b > a);
    }
}
