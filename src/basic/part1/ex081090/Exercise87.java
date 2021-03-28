package basic.part1.ex081090;

import tools.InputRequests;

import java.util.Scanner;

//87. Write a Java program than read an integer and calculate the sum of its digits
// and write the number of each digit of the sum in English.
public class Exercise87 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = InputRequests.requestInt(scanner, "\ninput a number larger than 10:", i -> i > 10);

        int sum = Integer.toString(number).chars().map(c -> c -= 48).sum();

        printDigits(sum);
    }

    public static void printDigits(int number) {
        final var digits = new String[] {
                "zero ", "one ", "two ",   "three ", "four ",
                "five ", "six ", "seven ", "eight ", "nine "
        };

        Integer.toString(number)
                .chars()
                .map(c -> c -= 48) // or c -> c -= '0'
                .forEach( i -> {
                    System.out.print(digits[i]);
                });
    }
}
