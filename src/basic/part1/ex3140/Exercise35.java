package basic.part1.ex3140;

import tools.InputRequests;
import java.util.Scanner;
/*
35. Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
 */
public class Exercise35 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var num = InputRequests.requestDouble(scanner, "Input the number of sides on the polygon:");
        var side = InputRequests.requestDouble(scanner, "Input the length of one of the sides:");

        double area = (num * side * side) / (4 * Math.tan(Math.PI / num));
        System.out.printf("The area of your polygon = %.3f", area);

        scanner.close();
    }
}
