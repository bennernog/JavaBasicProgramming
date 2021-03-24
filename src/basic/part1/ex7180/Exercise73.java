package basic.part1.ex7180;

import tools.InputRequests;
import java.util.Scanner;

//73. Write a Java program to create a new string taking first and last characters from two given strings.
// If the length of either string is 0 use "#" for missing character.
public class Exercise73 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var input1 = InputRequests.requestString(
                scanner,
                "Input some text:").trim();
        var input2 = InputRequests.requestString(
                scanner,
                "Input more text:").trim();

        var output1 = Character.toString(input1.length() > 0 ? input1.charAt(0) : '#');
        var output2 = Character.toString(input2.length() > 0 ? input2.charAt(input2.length()-1) : '#');

        System.out.println(output1.concat(output2));

        scanner.close();
    }
}
