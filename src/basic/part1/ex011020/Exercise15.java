package basic.part1.ex011020;

import tools.InputRequests;
import java.util.Scanner;

//15. Write a Java program to swap two variables.
public class Exercise15 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "please input a number");
        var number2 = InputRequests.requestInt(scanner, "please input an other number");

        System.out.printf("Before swapping: number 1 = %d & number2 = %d%n", number2, number1);
        System.out.println("Oompa loompa dippity dap \nThese are the numbers after you swap:");
        var temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.printf("number 1 = %d & number2 = %d%n", number2, number1);

        scanner.close();
    }
}
