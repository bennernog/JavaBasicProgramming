package basic.part1.ex1120;

import tools.InputRequests;
import java.util.Scanner;

//20. Write a Java program to convert a decimal number to hexadecimal number.
public class Exercise20 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var number = InputRequests.requestInt(scanner, "please input a number");

        System.out.printf("The hexadecimal representation of your number is %s", Integer.toHexString(number));

        scanner.close();
    }
}
