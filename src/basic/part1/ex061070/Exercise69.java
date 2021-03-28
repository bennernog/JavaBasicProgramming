package basic.part1.ex061070;

import tools.InputRequests;
import java.util.Scanner;

//69. Write a Java program to extract the first half of a string of even length.
public class Exercise69 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var input = InputRequests.requestString(
                scanner,
                "Input some text:",
                s -> s.length() % 2 == 0,
                "text must be of even length");

        var substring = input.substring(input.length()/2);
        System.out.printf(substring);

        scanner.close();
    }
}
