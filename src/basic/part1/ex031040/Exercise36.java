package basic.part1.ex031040;

import tools.InputRequests;
import java.util.Scanner;
/*
    36. Write a Java program to compute the distance between two points on the surface of earth.
    Distance between the two points [ (x1,y1) & (x2,y2)]
    d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
    Radius of the earth r = 6371.01 Kilometers
 */
public class Exercise36 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var lat1 = InputRequests.requestDouble(scanner, "Input the latitude of coordinate 1:");
        var long1 = InputRequests.requestDouble(scanner, "Input the longitude of coordinate 1:");
        var lat2 = InputRequests.requestDouble(scanner, "Input the latitude of coordinate 2:");
        var long2 = InputRequests.requestDouble(scanner, "Input the longitude of coordinate 2:");
        var radius = 6371.01d;

        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);

        double distance = radius * Math.acos(
                        Math.sin(lat1) * Math.sin(lat2) +
                        Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2) );

        System.out.printf("The distance between the two coordinates is %.2f km", distance);

        scanner.close();
    }
}