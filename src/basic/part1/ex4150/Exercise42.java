package basic.part1.ex4150;

import tools.InputRequests;
import java.util.Scanner;

// 42.Write a Java program to input and display your password.
public class Exercise42 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var password = InputRequests.requestString(scanner, "Please input your password:");

        System.out.println(password);

        scanner.close();
    }
}
