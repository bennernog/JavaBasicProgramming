package basic.part1.ex051060;

import tools.InputRequests;
import java.util.Scanner;

//52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
public class Exercise52 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "Input the first number:");
        var number2 = InputRequests.requestInt(scanner, "Input the second number:");
        var number3 = InputRequests.requestInt(scanner, "Input the third number:");

        System.out.println(number1  + number2 == number3);

        scanner.close();
    }

}
