package basic.part1.ex141150;

import tools.TestUtils;

import java.util.Arrays;

/*
142. Write a Java program to check if two given strings are anagrams or not.
According to Wikipedia "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once. For example, the word anagram can be rearranged into nag a ram,
or the word binary into brainy."
Sample Output: String-1 : wxyz
String-2 : zyxw
Check if two given strings are anagrams or not?: true
 */
public class Exercise142 {

    public static void main(String[] args) {

        TestUtils.test("wxyz","zyxw",true,Exercise142::areAnagram);
        TestUtils.test("binary","brainy",true,Exercise142::areAnagram);
        TestUtils.test("anagram","nag a ram",true,Exercise142::areAnagram);
        TestUtils.test("abcd","wzysa",false,Exercise142::areAnagram);
    }

    public static boolean areAnagram(String a, String b) {

        return Arrays.equals(
                a.toLowerCase().codePoints().filter(i -> i > 96 && i < 123).sorted().toArray(),
                b.toLowerCase().codePoints().filter(i -> i > 96 && i < 123).sorted().toArray()
        );
    }
}
