package basic.part1.ex0110;

import tools.InputRequests;
import java.util.Scanner;

//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
public class Exercise6 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "please input a number");
        var number2 = InputRequests.requestInt(scanner, "please input an other number");

        System.out.printf("%d + %d = %d%n", number1, number2, number1 + number2);
        System.out.printf("%d - %d = %d%n", number1, number2, number1 - number2);
        System.out.printf("%d * %d = %d%n", number1, number2, number1 * number2);
        System.out.printf("%d / %d = %d with a remainder of %d%n", number1, number2, number1 / number2, number1 % number2);

        scanner.close();
    }
}
