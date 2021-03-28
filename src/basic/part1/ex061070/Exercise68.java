package basic.part1.ex061070;

import tools.InputRequests;
import java.util.Scanner;

//68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
// The length of the original string must be 3 and above.
public class Exercise68 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var input = InputRequests.requestString(
                scanner,
                "Input some text:",
                s -> s.length() >= 3,
                "text must be at least 3 characters long");

        var substring = input.substring(input.length()-3);
        System.out.printf("%1$s%<s%<s%<s",substring);
        scanner.close();
    }
}
