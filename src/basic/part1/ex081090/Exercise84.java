package basic.part1.ex081090;

import tools.InputRequests;

import java.util.Scanner;

//84. Write a Java program to take the last three characters from a given string and add the three characters
// at both the front and back of the string. String length must be greater than three and more.
public class Exercise84 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var input = InputRequests.requestString(
                scanner,
                "Input some text:",
                s -> s.length() > 3,
                "text must be more than 3 characters long");

        var substring = input.substring(input.length()-3);
        System.out.printf("%1$s%2$s%1$s", substring, input);

        scanner.close();
    }
}
