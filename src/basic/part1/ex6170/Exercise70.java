package basic.part1.ex6170;

import tools.InputRequests;
import java.util.Scanner;

//70. Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
// The strings must not have the same length.
public class Exercise70 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var input1 = InputRequests.requestString(scanner, "Input some text:");
        var input2 = InputRequests.requestString(
                scanner,
                "Input more text:",
                s -> s.length() != input1.length(),
                "text must be of different length than previous input");

        var longString = input1.length() > input2.length() ? input1 : input2;
        var shortString = input1.length() < input2.length() ? input1 : input2;
        System.out.printf("%1$s%2$s%1$s",shortString, longString);
        scanner.close();
    }
}
