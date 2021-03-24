package basic.part1.ex7180;

import tools.InputRequests;
import java.util.Scanner;

//72. Write a Java program to create a new string taking first three characters from a given string.
// If the length of the given string is less than 3 use "#" as substitute characters.
public class Exercise72 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var input = InputRequests.requestString(scanner, "Input some text:").toCharArray();

        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < Math.min (input.length,3); i++) {
            builder.append(input[i]);
        }
        while (builder.length() <3){
            builder.append("#");
        }

        System.out.println(builder);

        scanner.close();
    }
}
