package basic.part1.ex111120;

import java.util.stream.IntStream;

public class Exercise111 {
    public static void main(String[] args) {

    }
    public static int sum(int a, int b) {
        return IntStream.of(a,b).sum();
    }
}
