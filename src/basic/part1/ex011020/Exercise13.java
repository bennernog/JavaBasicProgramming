package basic.part1.ex011020;

import tools.InputRequests;
import java.util.Scanner;

//13. Write a Java program to print the area and perimeter of a rectangle.
public class Exercise13 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var width = InputRequests.requestFloat(scanner, "please input the width of your rectangle");
        var height = InputRequests.requestFloat(scanner, "please input the height of your rectangle");

        System.out.printf(
                "A rectangle with a height of %.2f and width of %.2f has a perimeter of %.2f and a area of %.2f%n",
                height,
                width,
                2 * (height + width),
                height * width );

        scanner.close();
    }
}
