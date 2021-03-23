package basic.part1.ex0110;
/*
    4. Write a Java program to print the result of the following operations.
    Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
 */
public class Exercise4 {
    public static void main(String[] args) {
        System.out.printf("-5 + 8 * 6 = %d%n",              -5 + 8 * 6);
        System.out.printf("(55+9) %% 9 = %d%n",              (55+9) % 9);
        System.out.printf("20 + -3*5 / 8 = %d%n",           20 + -3*5 / 8);
        System.out.printf("5 + 15 / 3 * 2 - 8 %% 3 = %d%n",  5 + 15 / 3 * 2 - 8 % 3);
    }
}
