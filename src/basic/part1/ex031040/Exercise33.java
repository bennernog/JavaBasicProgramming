package basic.part1.ex031040;

import tools.InputRequests;
import java.util.Scanner;

// 33. Write a Java program and compute the sum of the digits of an integer.
public class Exercise33 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(
                scanner,
                "please input a number with more than one digit",
                i -> i > 9);

        int sum = Integer.toString(number1).chars().map(Character::getNumericValue).sum();
        System.out.println(sum);

        scanner.close();
    }
}
