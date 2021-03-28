package basic.part1.ex101110;

import java.text.MessageFormat;

//109. Write a Java program to form a staircase shape of n coins where every k-th row must have exactly k coins.
public class Exercise109 {
    public static void main(String[] args) {
        int rows = 0;
        for (int i = 0; i < 60; i++) {
            int count = getRowCount(i);
            if( rows < count) {
                System.out.println(i + " = " + count);
                rows = count;
            }
        }
    }

    public static int getRowCount(int coins) {
        if (coins < 1) return 0;

        int rows = 0;
        for (int i = coins; i >0; ) {

            if(i - rows + 1 >= 0){
                rows ++;
                i -= rows;
            } else i--;
        }
        return rows;
    }
}
