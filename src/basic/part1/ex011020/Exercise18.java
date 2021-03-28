package basic.part1.ex011020;

import tools.InputRequests;
import java.util.Scanner;

//18. Write a Java program to multiply two binary numbers.
public class Exercise18 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestString(
                scanner,
                "please input a binary number",
                s -> s.matches("^[01]+$"),
                "A binary number can only exist out of 1's & 0's");
        var number2 = InputRequests.requestString(
                scanner,
                "please input an other binary number",
                s -> s.matches("^[01]+$"),
                "Try again!");

        var bin1 = Integer.parseInt(number1, 2);
        var bin2 = Integer.parseInt(number2, 2);

        System.out.printf("The product of your binary numbers is %s", Integer.toBinaryString(bin1 * bin2));

        scanner.close();
    }

}
