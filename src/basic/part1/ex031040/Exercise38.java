package basic.part1.ex031040;

import tools.InputRequests;
import java.util.Scanner;

//38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.
public class Exercise38 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var input = InputRequests.requestString(
                scanner,
                "Please input some text, throw some number and punctuation in there:");

        var letters = input
                .chars()
                .mapToObj(i -> Character.toString((char)i))
                .filter(s -> s.matches("(?i)[a-z]"))
                .count();
        var spaces = input
                .chars()
                .mapToObj(i -> Character.toString((char)i))
                .filter(s -> s.matches("\s"))
                .count();
        var numbers = input
                .chars()
                .mapToObj(i -> Character.toString((char)i))
                .filter(s -> s.matches("[0-9]"))
                .count();
        var other = input.length() - letters - spaces - numbers;

        System.out.printf("letters : %d%nspaces : %d%nnumbers : %d%nother : %d%n", letters, spaces, numbers, other );

        scanner.close();
    }
}
