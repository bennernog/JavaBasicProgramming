package basic.part1.ex011020;

import tools.InputRequests;
import java.util.Scanner;

//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
public class Exercise12 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "please input a number");
        var number2 = InputRequests.requestInt(scanner, "please input an other number");
        var number3 = InputRequests.requestInt(scanner, "please input yet an other number");

        System.out.printf(
                "Average of %d, %d & %d = %f",
                number1,
                number2,
                number3,
                ((double) number1 + number2 + number3) /3
        );

        scanner.close();
    }

}
