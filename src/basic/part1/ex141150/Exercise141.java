package basic.part1.ex141150;

import tools.TestUtils;

/*
141. Write a Java program to check if a given string has all unique characters.
Sample Output: Original String : xyyz
String has all unique characters: false
 */
public class Exercise141 {

    public static void main(String[] args) {

        TestUtils.test("xyyz",false, Exercise141::allUnique);
        TestUtils.test("abcxyz",true, Exercise141::allUnique);

    }
    public static boolean allUnique(String input) {
        return input.length() == input.codePoints().distinct().count();
    }
}
