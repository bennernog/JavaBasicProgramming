package basic.part1.ex4150;

import tools.InputRequests;

import java.util.Scanner;

//49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
public class Exercise49 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var number = InputRequests.requestInt(scanner, "please input a number");

        System.out.println(number % 2 == 0 ? 1 : 0);
    }
}
