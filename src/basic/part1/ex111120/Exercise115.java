package basic.part1.ex111120;

import tools.InputRequests;

import java.util.Scanner;

//115. Write a Java program to check if a positive number is a palindrome or not.
public class Exercise115 {
    public static void main(String[] args) {
//        int number = InputRequests.requestInt(new Scanner(System.in), "input a positive number", i -> i >= 0);

        int number = 12344321;

        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {

        char[] chars = Integer.toString(number).toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {

            if(chars[start++] != chars[end--])
                return false;
        }

        return true;
    }
}
