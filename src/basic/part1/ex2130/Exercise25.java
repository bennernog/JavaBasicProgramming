package basic.part1.ex2130;

import tools.InputRequests;
import java.util.Scanner;

//25. Write a Java program to convert a octal number to a decimal number.
public class Exercise25 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestString(
                scanner,
                "please input an octal number",
                s -> s.matches("^[0-7]+$"),
                "An octal number can only exist out of digits 1 to 7");

        System.out.printf("The decimal representation of your octal number is %d",
                Integer.parseInt(number1, 8));

        scanner.close();
    }
}
