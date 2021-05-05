package basic.part1.ex141150;

import java.util.ArrayList;
import java.util.Collections;

/*
143. Write a Java program to merge two given sorted lists.
Sample Output:
Merge Two Sorted ListsT:
1 2 3 7 9 13 40
 */
public class Exercise143 {

    public static void main(String[] args) {
        LLNode list1 = new LLNode(1);
        list1.next = new LLNode(2);
        list1.next.next = new LLNode(9);
        list1.next.next.next = new LLNode(13);
        LLNode list2 = new LLNode(3);
        list2.next = new LLNode(7);
        list2.next.next = new LLNode(40);

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(merged(list1, list2));
    }

    public static LinkedList merged(LLNode llNode1, LLNode llNode2) {
        LinkedList merged = new LinkedList();
        int nextValue;

        while (llNode1 != null && llNode2 != null) {
            if (llNode1.value < llNode2.value) {
                nextValue = llNode1.value;
                llNode1 = llNode1.next;
            } else {
                nextValue = llNode2.value;
                llNode2 = llNode2.next;
            }
            merged.append(nextValue);
        }

        merged.appendAll(llNode1 == null ? llNode2 : llNode1);

        return merged;
    }


    static class LLNode {

        int value;
        LLNode next;

        public LLNode(int value) {
            this.value = value;
        }

        boolean hasNext() {
            return this.next != null;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(Integer.toString(this.value));
            LLNode next = this.next;
            while (next != null) {
                sb.append(", ");
                sb.append(next.value);
                next = next.next;
            }

            return sb.toString();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LLNode) {
                LLNode other = (LLNode) obj;
                return this.toString().equals(other.toString());
            }
            return false;
        }
    }

    static class LinkedList {

        LLNode head;

        void append(int value) {
            if (head == null) {
                head = new LLNode(value);
                return;
            }

            LLNode current = head;
            while (current.hasNext()) {
                current = current.next;
            }
            current.next = new LLNode(value);
        }

        void appendAll(LLNode node) {
            if (node == null) return;
            if (head == null) {
                head = node;
                return;
            }

            LLNode current = head;
            while (current.hasNext()) {
                current = current.next;
            }
            current.next = node;
        }

        @Override
        public String toString() {
            return "[" + this.head.toString() + "]";
        }
    }
}
