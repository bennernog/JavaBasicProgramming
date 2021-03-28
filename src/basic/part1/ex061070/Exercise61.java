package basic.part1.ex061070;

import tools.InputRequests;
import java.util.Scanner;

//61. Write a Java program to reverse a word.
public class Exercise61 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String requestString = InputRequests.requestString(scanner, "please input some text:");

        StringBuilder stringBuilder = new StringBuilder(requestString);

        String output = stringBuilder.reverse().toString();

        System.out.println(output);
    }
}
