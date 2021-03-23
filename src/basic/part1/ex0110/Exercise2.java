package basic.part1.ex0110;

import tools.InputRequests;

import java.util.Scanner;

//2. Write a Java program to print the sum of two numbers.
public class Exercise2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "please input a number");
        var number2 = InputRequests.requestInt(scanner, "please input an other number");

        System.out.printf("%d + %d = %d", number1, number2, number1 + number2);

        scanner.close();
    }
}
