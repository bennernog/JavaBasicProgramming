package basic.part1.ex021030;

import tools.InputRequests;
import java.util.Scanner;

//21. Write a Java program to convert a decimal number to octal number.
public class Exercise21 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var number = InputRequests.requestInt(scanner, "please input a number");

        System.out.printf("The octal representation of your number is %s", Integer.toOctalString(number));

        scanner.close();
    }
}
