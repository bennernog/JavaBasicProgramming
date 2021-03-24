package basic.part1.ex7180;

import tools.InputRequests;
import java.util.Scanner;

//71. Write a Java program to create the concatenation of the two strings except removing the
// first character of each string. The length of the strings must be 1 and above.
public class Exercise71 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var input1 = InputRequests.requestString(
                scanner,
                "Input some text:",
                s -> s.matches("\\w+") ,
                "text must be more than 1 non-space character");
        var input2 = InputRequests.requestString(
                scanner,
                "Input more text:",
                s -> s.matches("\\w+") ,
                "text must be more than 1 non-space character");

        System.out.println(input1.substring(1).concat(input2.substring(1)));
        scanner.close();
    }
}
