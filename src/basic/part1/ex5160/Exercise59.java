package basic.part1.ex5160;

import tools.InputRequests;
import java.util.Scanner;

//59. Write a Java program to convert a given string into lowercase.
public class Exercise59 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var string = InputRequests.requestString(scanner, "Please input some text");

        System.out.println();
        System.out.println(string.toLowerCase());

        scanner.close();
    }
}
