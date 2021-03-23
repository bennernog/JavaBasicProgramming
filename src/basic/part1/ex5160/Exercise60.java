package basic.part1.ex5160;

import tools.InputRequests;
import java.util.Scanner;

//60. Write a Java program to find the penultimate (next to last) word of a sentence.
public class Exercise60 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var string = InputRequests.requestString(scanner, "Please input some text");

        System.out.println();
        var words = string.split(" ");
        System.out.println(words[words.length -2]);

        scanner.close();
    }
}
