package basic.part1.ex5160;

import tools.InputRequests;
import java.util.Scanner;

//Write a Java program to convert a string to an integer in Java.
public class Exercise51 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var number = InputRequests.requestString(scanner, "Please input a number");

        System.out.printf("&nas a string: %s%n",number);
        System.out.printf("&nas an integer: %s%n",Integer.valueOf(number));

        scanner.close();

    }
}
