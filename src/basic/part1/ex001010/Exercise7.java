package basic.part1.ex001010;

import tools.InputRequests;
import java.util.Scanner;

//7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
public class Exercise7 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "please input a number");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", number1, i, number1 * i);
        }

        scanner.close();
    }
}
