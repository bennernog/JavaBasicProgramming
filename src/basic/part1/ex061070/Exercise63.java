package basic.part1.ex061070;

import tools.InputRequests;
import java.util.Scanner;

//63. Write a Java program that accepts two integer values from the user and return the larger values.
// However if the two values are the same, return 0 and return the smaller value if the two values
// have the same remainder when divided by 6.
public class Exercise63 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "Input the first number:");
        var number2 = InputRequests.requestInt(scanner, "Input the second number:");


        System.out.println(checkNumbers(number1,number2));

        scanner.close();
    }

    public static int checkNumbers(int x, int y) {

        if (x == y) {
            return 0;
        }

        if(x % 6 == y % 6) {
            return Math.min(x,y);
        }

        return Math.max(x,y);
    }
}
