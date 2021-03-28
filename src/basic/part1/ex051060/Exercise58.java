package basic.part1.ex051060;

import tools.InputRequests;
import java.util.Scanner;
import java.util.stream.Stream;

//58. Write a Java program to capitalize the first letter of each word in a sentence.
public class Exercise58 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var string = InputRequests.requestString(scanner, "Please input some text");

        System.out.println();
        System.out.println(toTitleCase(string));

        scanner.close();
    }

    public static String toTitleCase(String input) {

        if (input == null || input.length() == 0) return "";

        if (input.length() == 1) return input.toUpperCase();

        var builder = new StringBuilder("");
        Stream.of(input.split(" ")).forEach(s -> {
            if (s.length() > 1) {
                builder.append(s.substring(0,1).toUpperCase());
                builder.append(s.substring(1).toLowerCase());
            } else {
                builder.append(s.toUpperCase());
            }
            builder.append(" ");
        });

        builder.setLength(input.length());

        return builder.toString();
    }
}
