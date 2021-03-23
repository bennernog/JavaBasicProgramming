package basic.part1.ex4150;

//47. Write a Java program to display the current date time in specific format. Now: 2017/06/16 08:52:03.066
public class Exercise47 {
    public static void main(String[] args) {
        //t -> date time // < -> repeat index 1$ // Y -> yyyy  //m -> mm // d -> dd //T -> HH:MM:SS // L -> milisec.
        System.out.printf("%nCurrent Date time:  %1$tY/%<tm/%<td %<tT.%<tL  %n", System.currentTimeMillis());
    }
}
