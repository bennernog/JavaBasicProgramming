package basic.part1.ex131140;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

/*
    135. Write a Java program to remove duplicates from a sorted linked list.
    Original List with duplicate elements:
    12->12->13->14->15->15->16->17->17
 */
public class Exercise135 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(12,12,13,14,15,15,16,17,17));

    }

    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list ) {

        return list.stream().distinct().collect(Collectors.toCollection(LinkedList::new));

    }

}
