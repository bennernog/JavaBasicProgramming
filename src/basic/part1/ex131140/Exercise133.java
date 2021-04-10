package basic.part1.ex131140;

import basic.part1.ex121130.Tree;

import java.util.Random;

/*
    133. Write a Java program to find a path from top left to bottom in right direction which minimizes the sum of all
    numbers along its path.
 */
public class Exercise133 {

    public static void main(String[] args) {
        Tree tree = Tree.getRandomTree(new Random(), 5);
        System.out.println(tree);
        System.out.println(sumOfRightPath(tree));
    }

    public static int sumOfRightPath(Tree tree) {
        return sumOfRightPath(tree, 0);
    }

    public static int sumOfRightPath(Tree tree, int sum) {
        if(tree == null)
            return sum;

        sum += tree.root;

        return sumOfRightPath(tree.right, sum);
    }

}
