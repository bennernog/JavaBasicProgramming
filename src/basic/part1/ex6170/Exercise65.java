package basic.part1.ex6170;

import tools.InputRequests;
import java.util.Scanner;

//65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
public class Exercise65 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "Input number one:");
        var number2 = InputRequests.requestInt(scanner, "Input number two:");

        findModulo(Math.max(number1, number2), Math.min(number1, number2));

        scanner.close();
    }

    public static void findModulo(int x, int y) {
        System.out.println("without modulo:");
        System.out.println(x - ((x / y) *y));

        System.out.println("with modulo:");
        System.out.println(x % y);
    }
}
