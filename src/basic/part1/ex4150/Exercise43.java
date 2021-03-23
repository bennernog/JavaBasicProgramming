package basic.part1.ex4150;

/*
    43. Write a Java program to print the following string in a specific format (see the output).
    Sample Output

Twinkle, twinkle, little star,
	How I wonder what you are!
		Up above the world so high,
		Like a diamond in the sky.
Twinkle, twinkle, little star,
	How I wonder what you are
 */
public class Exercise43 {

    public static void main(String[] args) {
        var chorus ="Twinkle, twinkle, little star,\n\tHow I wonder what you are!";
        System.out.println(chorus);
        System.out.println("\t\tUp above the world so high,");
        System.out.println("\t\tLike a diamond in the sky.");
        System.out.println(chorus);
    }
}
