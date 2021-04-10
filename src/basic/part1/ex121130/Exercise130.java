package basic.part1.ex121130;

import java.util.Random;

//130. Write a Java program to find the maximum depth of a given a binary tree.
public class Exercise130 {

    public static void main(String[] args) {
        Tree tree = Tree.getRandomTree(new Random(), 5);
        System.out.println(tree);
        System.out.println(getMaxDepth(tree));
    }

    public static int getMaxDepth(Tree tree) {
        return getMaxDepth(tree, 0);
    }

    public static int getMaxDepth(Tree tree, int count) {

        if(tree == null) return count;
        else count++;

        return Math.max(getMaxDepth(tree.left, count), getMaxDepth(tree.right, count));
    }

}
