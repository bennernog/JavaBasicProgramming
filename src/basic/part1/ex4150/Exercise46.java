package basic.part1.ex4150;

//46. Write a Java program to display the system time.
public class Exercise46 {
    public static void main(String[] args) {
        //t -> date time c -> formatted as "%ta %tb %td %tT %tZ %tY", e.g. "Sun Jul 20 16:17:00 EDT 1969".
        System.out.printf("%nCurrent Date time: %tc%n", System.currentTimeMillis());
    }
}
