package basic.part1.ex1120;

import tools.InputRequests;
import java.util.Scanner;

//11. Write a Java program to print the area and perimeter of a circle.
public class Exercise11 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var radius = InputRequests.requestFloat(scanner, "please input the radius of your circle");

        System.out.printf("A circle with a radius of %f has a perimeter of %f and a area of %f%n",
                radius,
                2 * radius * Math.PI,
                radius * radius * Math.PI );

        scanner.close();
    }
}
