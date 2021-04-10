package basic.part1.ex111120;

//118. Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.
public class Exercise118 {
    public static void main(String[] args) {
        String quote = "Be yourself; everyone else is already taken."; //Oscar Wilde
        String word = "pool";
//        String word = "everyone";
        int position = 0;
        int maxPosition = quote.length() - word.length();

        while (position < maxPosition && !quote.substring(position).startsWith(word))
            position++;

        System.out.println(position < maxPosition ? position : "not in string");

    }
}
