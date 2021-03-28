package basic.part1.ex101110;

import tools.InputRequests;

import java.util.Scanner;

//108. Write a Java program to add all the digits of a given positive integer until the result has a single digit.
public class Exercise108 {

    public static void main(String[] args) {

        int sum = InputRequests.requestInt(new Scanner(System.in),"input a positive numbers", i -> i >= 0);

        do {

            sum = Integer.toString(sum).chars().map(c -> c -= '0').sum();

        } while (sum > 9);

        System.out.println(sum);
    }
}
