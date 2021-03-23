package basic.part1.ex3140;

import java.nio.charset.Charset;

//40. Write a Java program to list the available character sets in charset objects.
public class Exercise40 {
    public static void main(String[] args) {
        Charset.availableCharsets().values().stream().forEach(System.out::println);
    }
}
