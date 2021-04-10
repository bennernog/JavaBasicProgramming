package basic.part1.ex111120;

import java.util.stream.LongStream;

public class Exercise112 {
    public static void main(String[] args) {
        int n = 7;
        long factorial = factorialOf(n);
        int zeros = countTrailingZeros(factorial);
        boolean plural = zeros > 1;
        System.out.printf("%d! = %d %nhas %d trailing zero%s%n", n, factorial, zeros, plural ? "'s" : "");
    }

    public static int countTrailingZeros(long number) {
        char[] digits = Long.toString(number).toCharArray();
        int count = 0;
        int index = digits.length - 1;
        while (digits[index] == '0') {
            count++;
            index--;
        }
        return count;
    }

    public static long factorialOf(int n) {
        return LongStream
                .rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }
}
