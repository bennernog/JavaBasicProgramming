package basic.part1.ex081090;

import tools.InputRequests;

import java.util.Scanner;

//85. Write a Java program to check if a string starts with a specified word.
public class Exercise85 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var input = InputRequests.requestString(
                scanner,
                "Input some text:");

        System.out.println(input.toLowerCase().startsWith("hello"));

        scanner.close();
    }
}
