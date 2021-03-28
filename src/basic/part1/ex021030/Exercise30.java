package basic.part1.ex021030;

import tools.InputRequests;
import java.util.Scanner;

//29. Write a Java program to convert a hexadecimal to an octal number.
public class Exercise30 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestString(
                scanner,
                "please input a hexadecimal number",
                s -> s.matches("(?i)^[0-9a-f]+$"),
                "A hexadecimal number can only exist out of digits 0 to 9 & a(A) to f(F)");

        System.out.printf("The binary representation of your hex number is %d",
                Integer.toOctalString(Integer.parseInt(number1, 16)));

        scanner.close();
    }
}
