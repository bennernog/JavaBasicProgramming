package basic.part1.ex2130;

import tools.InputRequests;
import java.util.Scanner;

//27. Write a Java program to convert a octal number to a hexadecimal number.
public class Exercise27 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestString(
                scanner,
                "please input an octal number",
                s -> s.matches("^[1-7]+$"),
                "An octal number can only exist out of digits 1 to 7");

        System.out.printf("The hexadecimal representation of your octal number is %s",
                Integer.toHexString(Integer.parseInt(number1, 8)));

        scanner.close();
    }
}
