package basic.part1.ex1120;

import tools.InputRequests;
import java.util.Scanner;

//19. Write a Java program to convert a decimal number to binary number.
public class Exercise19 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var number = InputRequests.requestInt(scanner, "please input a number");

        System.out.printf("The binary representation of your number is %s", Integer.toBinaryString(number));

        scanner.close();
    }
}
