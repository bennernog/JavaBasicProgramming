package basic.part1.ex101110;

//110. Write a Java program to check whether a given integer is a power of 4 or not.
public class Exercise110 {
    public static void main(String[] args) {

        System.out.println("256 is " + isPowerOf4(256));
        System.out.println("64 is " + isCube(64));

    }
    public static boolean isPowerOf4(int toCheck) {
        double fourthRoot = Math.sqrt(Math.sqrt(toCheck));
        return fourthRoot == (long) fourthRoot;
    }
    public static boolean isCube(int toCheck) {
        double cubeRoot = Math.cbrt(toCheck);
        return cubeRoot == (long) cubeRoot;
    }
}
