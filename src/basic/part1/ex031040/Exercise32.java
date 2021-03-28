package basic.part1.ex031040;

import tools.InputRequests;
import java.util.Scanner;

//32. Write a Java program to compare two numbers.
public class Exercise32 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "please input a number");
        var number2 = InputRequests.requestInt(scanner, "please input an other number");

        System.out.printf(
                "%d %c %d%n",
                number1,
                number1 == number2 ? '=' : number1 > number2 ? '>' : '<',
                number2);


        scanner.close();
    }
}
