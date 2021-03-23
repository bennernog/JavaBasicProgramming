package basic.part1.ex3140;

import tools.InputRequests;
import java.util.Scanner;

//37. Write a Java program to reverse a string.
public class Exercise37 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var input = InputRequests.requestString(scanner,"Please input some text:");
        var stringBuilder = new StringBuilder(input);

        System.out.println(stringBuilder.reverse());

        scanner.close();
    }
}
