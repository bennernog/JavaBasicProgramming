package basic.part1.ex111120;

import java.util.concurrent.ThreadLocalRandom;

//114. Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right).
public class Exercise114 {
    public static void main(String[] args) {

        String string = "abcdefghijklmnop";

        int offset = ThreadLocalRandom.current().nextInt(string.length() - 1);

        System.out.printf("%nOriginal: %s", string);
        System.out.printf("%nOffset: %d", offset);

        String substring1 = string.substring(0, offset);
        String substring2 = string.substring(offset);

        System.out.printf("%n%nRotated: %s", substring2.concat(substring1));
    }
}
