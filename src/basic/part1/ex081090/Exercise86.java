package basic.part1.ex081090;

import tools.InputRequests;
import java.util.Scanner;

//86. Write a Java program start with an integer n, divide n by 2 if n is even or
// multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
public class Exercise86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = InputRequests.requestInt(scanner, "\ninput a number:");
        while (n != 1){
            System.out.print("Working :");
            if (n %2 == 0){
                n /=2;
                System.out.print("\tn/2 =");
            } else {
                n *=3;
                n++;
                System.out.print("\tn x 3 + 1 =");
            }
            System.out.printf(" %d%n",n);
        }
    }
}
