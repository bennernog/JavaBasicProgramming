package basic.part1.ex041050;

import tools.InputRequests;
import java.util.Scanner;

//41. Write a Java program to print the ascii value of a given character.
public class Exercise41 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var input = InputRequests.requestString(
                scanner,
                "Please input a character:",
                s -> s.length() == 1,
                "only 1 character");

        input.chars().forEach(System.out::println);

        scanner.close();
    }
}
