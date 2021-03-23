package basic.part1.ex5160;

/*
    56. Write a Java program to find the number of integers within the range of two specified numbers and
    that are divisible by another number.
    For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p
    i.e. { i :x ≤ i ≤ y, i mod p = 0 }
 */
public class Exercise56 {

    public static void main(String[] args){
        int x = 5;
        int y = 20;
        int p = 3;
        int count = 0;

        for (int i = 5; i <= 20; i++) {
            if(i%3 == 0) count++;
        }

        System.out.println(count);
    }
}
