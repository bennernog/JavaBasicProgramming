package basic.part1.ex121130;

import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

//121. Write a Java program to reverse a given linked list.
public class Exercise121 {
    public static void main(String[] args) {
        var list = new LinkedList<Integer>();
        var random = ThreadLocalRandom.current();

        for (int i = 0; i < random.nextInt(20) + 5; i++) {
            list.add(random.nextInt(50) + 1);
        }
        list.iterator().forEachRemaining(integer -> System.out.printf("%d\t",integer));
        System.out.println();
        Collections.reverse(list);
        list.iterator().forEachRemaining(integer -> System.out.printf("%d\t",integer));
    }
}
