package basic.part1.ex111120;

import tools.InputRequests;

import java.util.Scanner;

//117. Write a Java program to compute the square root of a given integer.
public class Exercise117 {
    public static void main(String[] args) {
//        int number = InputRequests.requestInt(new Scanner(System.in), "input a positive number", i -> i >= 0);

        int number = 144;

        System.out.println(Math.sqrt(number));
    }
}
