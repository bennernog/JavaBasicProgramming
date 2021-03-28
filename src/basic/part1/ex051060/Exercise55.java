package basic.part1.ex051060;

import tools.InputRequests;
import java.util.Scanner;

//55. Write a Java program to convert seconds to hour, minute and seconds.
public class Exercise55 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var seconds = InputRequests.requestInt(scanner, "Input the amount of seconds to convert:");

        var minutes = seconds / 60;
        var hours = minutes / 60;
        minutes = minutes % 60;
        seconds = (seconds % 60) % 60;

        System.out.printf("%n%d:%d:%d",hours, minutes, seconds);

        scanner.close();
    }
}
