package basic.part1.ex061070;

//66. Write a Java program to compute the sum of the first 100 prime numbers.
public class Exercise66 {

    public static void main(String[] args) {
        int sum = 2;
        int count = 1;
        for (int i = 3; count < 100; i += 2) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
        }

        System.out.printf("%nSum of the first 100 prime numbers: %d%n",sum);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0)
                return false;
        }
        return number > 1;
    }
}
