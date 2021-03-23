package basic.part1.ex2130;

import tools.InputRequests;
import java.util.Scanner;

//23. Write a Java program to convert a binary number to hexadecimal number.
public class Exercise23 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestString(
                scanner,
                "please input a binary number",
                s -> s.matches("^[01]+$"),
                "A binary number can only exist out of 1's & 0's");

        System.out.printf("The hexadecimal representation of your binary number is %s",
                Integer.toHexString(Integer.parseInt(number1, 2)));

        scanner.close();
    }
}
