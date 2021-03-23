package basic.part1.ex2130;

import tools.InputRequests;
import java.util.Scanner;


//22. Write a Java program to convert a binary number to decimal number.
public class Exercise22 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestString(
                scanner,
                "please input a binary number",
                s -> s.matches("^[01]+$"),
                "A binary number can only exist out of 1's & 0's");

        System.out.printf("The decimal representation of your binary number is %s", Integer.parseInt(number1, 2));

        scanner.close();
    }
}
