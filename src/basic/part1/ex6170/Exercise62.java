package basic.part1.ex6170;

import tools.InputRequests;
import java.util.Scanner;

//62. Write a Java program that accepts three integer values and return true if
// one of them is 20 or more and less than the substractions of others.
public class Exercise62 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var number1 = InputRequests.requestInt(scanner, "Input the first number:");
        var number2 = InputRequests.requestInt(scanner, "Input the second number:");
        var number3 = InputRequests.requestInt(scanner, "Input the third number:");


        System.out.println(checkNumbers(number1,number2,number3));

        scanner.close();
    }

    static boolean checkNumbers(int x, int y, int z) {

        if(x >= 20 || y >= 20 || z >= 20){

            int[] ints = {x,y,z};

            for (int i = 0; i < ints.length; i++) {

                if (ints[i] >= 20) {

                    int k = 0;
                    for (int j = 0; j < ints.length; j++) {

                        if (i != j){
                            k = Math.abs(k-ints[j]);
                        }
                    }

                    if (k > ints[i]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
