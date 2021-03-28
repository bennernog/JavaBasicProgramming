package basic.part1.ex041050;

import tools.InputRequests;
import java.util.Scanner;

// 44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
public class Exercise44 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var n = InputRequests.requestInt(
                scanner,
                "Please input a digit 1-9:",
                i -> (i > 0 && i < 10),
                "only 1 digit");
        var nn = n*10 + n;
        var nnn = n*100 + nn;

        System.out.printf("%d + %d + %d = %d", n, nn, nnn, n + nn + nnn);

        scanner.close();
    }
}
