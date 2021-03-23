package basic.part1.ex2130;

import tools.InputRequests;
import java.util.Scanner;

//24. Write a Java program to convert a binary number to a Octal number.
public class Exercise24 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestString(
                scanner,
                "please input a binary number",
                s -> s.matches("^[01]+$"),
                "A binary number can only exist out of 1's & 0's");

        System.out.printf("The octal representation of your binary number is %s",
                Integer.toOctalString(Integer.parseInt(number1, 2)));

        scanner.close();
    }
}
