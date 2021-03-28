package basic.part1.ex051060;

import tools.InputRequests;
import java.util.Scanner;

//57. Write a Java program to accepts an integer and count the factors of the number.
public class Exercise57 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var number = InputRequests.requestInt(scanner, "Please input a number");
        var count = 1;

        for (int i = 1; i < number / 2; i++) {
            if(number % i == 0) count++;
        }

        System.out.println(count);

        scanner.close();

    }
}
