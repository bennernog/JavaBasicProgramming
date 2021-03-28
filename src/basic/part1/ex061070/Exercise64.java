package basic.part1.ex061070;

import tools.InputRequests;
import java.util.Scanner;

//64. Write a Java program that accepts two integer values between 25 to 75
// and return true if there is a common digit in both numbers.
public class Exercise64 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "Input a number between 25 and 75:", i ->  i >= 25 && i <= 75);
        var number2 = InputRequests.requestInt(scanner, "Input an other number between 25 and 75:", i ->  i >= 25 && i <= 75);


        System.out.println(checkNumbers(number1,number2));

        scanner.close();
    }

    public static boolean checkNumbers(int x, int y) {

        var charx = Integer.toString(x).toCharArray();
        var chary = Integer.toString(y).toCharArray();

        for (char c : charx) {
            for (char d : chary) {
                if(c == d) return true;
            }
        }
        return false;
    }
}
