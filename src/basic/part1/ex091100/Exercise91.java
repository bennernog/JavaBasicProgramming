package basic.part1.ex091100;

//91. Write a Java program to measure how long some code takes to execute in nanoseconds.
public class Exercise91 {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        System.out.println ("The first 100 primes numbers are:\n");

        int count = 0;
        for (int i = 2; count < 100; i += 2) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
            if(i == 2) i--;
        }
        long duration = System.nanoTime() - startTime;
        System.out.printf("%nTime to find and print the first 100 primes %d ns! ", duration);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0)
                return false;
        }
        return number > 1;
    }
}
