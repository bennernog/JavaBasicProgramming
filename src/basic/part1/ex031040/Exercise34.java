package basic.part1.ex031040;

import tools.InputRequests;
import java.util.Scanner;
/*
34. Write a Java program to compute the area of a hexagon.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
 */
public class Exercise34 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var side = InputRequests.requestDouble(scanner,
                "please input the length of the side of your hexagon");

        double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of your hexagon = %.3f", area);

        scanner.close();
    }
}
