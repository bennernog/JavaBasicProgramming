package basic.part1.ex021030;

import tools.InputRequests;
import java.util.Scanner;

//26. Write a Java program to convert a octal number to a binary number.
public class Exercise26 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestString(
                scanner,
                "please input an octal number",
                s -> s.matches("^[0-7]+$"),
                "An octal number can only exist out of digits 1 to 7");

        System.out.printf("The binary representation of your octal number is %s",
                Integer.toBinaryString(Integer.parseInt(number1, 8)));

        scanner.close();
    }
}
