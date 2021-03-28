package basic.part1.ex031040;

/*
    39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4.
    Also count how many three-digit numbers are there.
*/
public class Exercise39 {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if(j != i)
                    for (int k = 1; k < 5 ; k++) {
                        if(k != i && k != j) {
                            System.out.println(i * 100 + j * 10 + k);
                            count++;
                        }
                    }
            }
        }
        System.out.printf("There are %d unique three-digit numbers using 1, 2, 3, 4%n",count);
    }
}
