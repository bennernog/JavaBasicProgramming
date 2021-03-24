package basic.part1.ex6170;

//67. Write a Java program to insert a word in the middle of the another string.
public class Exercise67 {
    public static void main(String[] args) {
        var t = "Tutorial";
//        var s = "Python 3.0";
        var s = new StringBuilder("Python 3.0");

//        var arr = s.split(" ");/
        s.insert(s.length(), " "+t+" ");

        System.out.println(s.insert(s.length(), t));
//        System.out.printf("%n%s %s %s%n", arr[0], t, arr[1]);
    }
}
