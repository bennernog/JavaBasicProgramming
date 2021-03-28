package basic.part1.ex041050;

import java.io.File;
import java.net.URISyntaxException;

//45. Write a Java program to find the size of a specified file.
public class Exercise45 {

    public static void main(String[] args) throws URISyntaxException {

        var url = Exercise45.class.getResource("exercises.txt.txt");
        var file = new File(url.toURI());

        if (file.exists()) {

            long bytes = file.length();
            long kilobytes = (bytes / 1024);
            long megabytes = (kilobytes / 1024);
            long gigabytes = (megabytes / 1024);


            if(gigabytes > 0)
                System.out.printf("%,d gigabytes%n", gigabytes);

            else if (megabytes > 0)
                System.out.printf("%,d megabytes%n", megabytes);

            else if (kilobytes > 0)
                System.out.printf("%,d kilobytes%n", kilobytes);
            else if (bytes > 0)
                System.out.printf("%,d bytes%n", bytes);


        } else {
            System.out.println("File does not exist!");
        }
    }
}
