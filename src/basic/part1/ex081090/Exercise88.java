package basic.part1.ex081090;

import java.util.function.BiConsumer;

//88. Write a Java program to get the current system environment and system properties.
public class Exercise88 {
    public static void main(String[] args) {

        BiConsumer printformat = (k, v) -> {
            System.out.printf("\"%s = %s%n\", k, v");
        };

        System.out.println("\nCurrent system environment:");
        System.getenv().forEach(printformat);
        System.out.println("\n\nCurrent system properties:");
        System.getProperties().forEach(printformat);
    }
}
