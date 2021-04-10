package basic.part1.ex111120;

//116. Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz"
// instead of the number and print "Buzz" for the multiples of five. When number is divided by both
// three and five, print "fizz buzz".
public class Exercise116 {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            StringBuilder builder = new StringBuilder("");
            if(i % 3 == 0 && i % 5 == 0) {
                builder.append("fizz buzz");
            } else {
                if (i % 3 == 0 )
                    builder.append("Fizz");
                else if (i % 5 == 0)
                    builder.append("Buzz");
                else
                    builder.append(i);
            }
            builder.append(System.lineSeparator());

            System.out.println(builder);
        }
    }
}
