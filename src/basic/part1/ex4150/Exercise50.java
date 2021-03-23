package basic.part1.ex4150;

//50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
public class Exercise50 {
    public static void main(String[] args) {
        var builder3 = new StringBuilder("");
        var builder5 = new StringBuilder("");
        var builder35 = new StringBuilder("");
        for (int i = 0; i < 100; i++) {
            if(i % 3 == 0) {
                builder3.append(i);
                builder3.append(", ");
            }
            if(i % 5 == 0) {
                builder5.append(i);
                builder5.append(", ");
            }
            if(i % 3 == 0 && i % 5 == 0) {
                builder35.append(i);
                builder35.append(", ");
            }
        }

        System.out.println("\nDivided by 3:");
        builder3.setLength(builder3.length() - 2);
        System.out.println(builder3);
        System.out.println("\nDivided by 5:");
        builder5.setLength(builder5.length() - 2);
        System.out.println(builder5);
        System.out.println("\nDivided by 3 and 5:");
        builder35.setLength(builder35.length() - 2);
        System.out.println(builder35);
    }
}
