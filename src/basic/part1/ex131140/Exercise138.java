package basic.part1.ex131140;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    138. Write a Java program to find all of the longest word in a given dictionary.
    Example-1: { "cat", "flag", "green", "country", "w3resource" }
    Result: "w3resource"
    Example-2:
    { "cat", "dog","red","is","am" }
    Result: "cat", "dog", "red"
 */
public class Exercise138 {

    public static void main(String[] args) {
        String[] ex1 =  { "cat", "flag", "green", "country", "w3resource" }; // Result: "w3resource"
        String[] ex2 = { "cat", "dog","red","is","am" }; // Result: "cat", "dog", "red"
        findLargestWords(ex2);
    }

    public static void findLargestWords(String[] words) {
        Arrays.stream(words)
                .collect(Collectors.groupingBy(String::length))
                .entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .orElseThrow()
                .getValue()
                .forEach(System.out::println);
    }

}
