package basic.part1.ex7180;

//74. Write a Java program to test if 10 appears as either the first or last element of an array of integers.
// The length of the array must be greater than or equal to 2.
public class Exercise74 {
    public static void main(String[] args) {
        int[] array1 = { 10, -20, 0, 30, 40, 60, 10 };
        int[] array2 = { 30, 40, 60, 10, -20, 0, 1 };
        int[] array3 = { 0, 40, 60, 100, -20, 0, 3 };
        
        boolean first, last;
        first = last = false;
        
        //TODO
    }
    
    public static boolean firstIsTen(int[] arr) {

        return arr.length >= 2 && arr[0] == 10;
    }
}
