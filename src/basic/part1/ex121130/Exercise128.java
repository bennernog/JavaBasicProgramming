package basic.part1.ex121130;

//128.Write a Java program to calculate the median of a given unsorted array of integers.
public class Exercise128 {

    public static void main(String[] args) {

        int[] arr1 = { 10, 2, 38, 23, 38, 23, 21 };
        int[] arr2 = { 10, 2, 38, 38, 23, 21 };
    }

    public static int getMedian(int[] array) {

        if(array.length % 2 == 0) {
            int mid = array.length / 2;
            return (array[mid] + array[mid - 1]) / 2;
        }

        return array[array.length / 2];
    }

}
