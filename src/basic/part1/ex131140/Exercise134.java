package basic.part1.ex131140;
/*
    134. Write a Java program to find the distinct ways you can climb to the top (n steps to reach to the top) of stairs.
    Each time you can either climb 1 or 2 steps.
    Example: n = 5
    a) 1+1+1+1+1 = 5 b) 1+1+1+2 = 5 c) 1+2+2 = 5 d) 2+2+1 = 5 e) 2+1+1+1 = 5 f) 2+1+2 = 5 g) 1+2+1+1 = 5 h) 1+1+2+1 = 5
    Sample Output: Distinct ways can you climb to the top: 8
 */

public class Exercise134 {

    public static void main(String[] args) {
        System.out.println(getSteps(8));
    }

    public static int getSteps(int stairs) {

        double sqrt5 = Math.sqrt(5D);
        double phi = (sqrt5 + 1) / 2;

        return (int) Math.round(Math.pow(phi, stairs + 1) / sqrt5);
    }

}

