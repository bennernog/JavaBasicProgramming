package basic.part1.ex001010;

import tools.InputRequests;
import java.util.Scanner;

// 3. Write a Java program to divide two numbers and print on the screen.
public class Exercise3 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "please input a number");
        var number2 = InputRequests.requestInt(scanner, "please input an other number");

        System.out.printf("%d / %d = %d", number1, number2, number1 / number2);

        scanner.close();
    }
}
