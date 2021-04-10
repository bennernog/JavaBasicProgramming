package basic.part1.ex121130;

import java.util.Random;

/*
    125. Write a Java program to get the preorder traversal of its nodes' values of a given a binary tree.
    126. Write a Java program to get the inorder traversal of its nodes' values of a given a binary tree.
    127. Write a Java program to get the Postorder traversal of its nodes' values of a given a binary tree.
 */
public class Exercise125_126_127 {

    public static void main(String[] args) {

        Tree tree = Tree.getRandomTree(new Random(), 3);
        System.out.println(tree);

        System.out.println("PREORDER");
        printPreOrder(tree);
        System.out.println("INORDER");
        printInOrder(tree);
        System.out.println("POSTORDER");
        printPostOrder(tree);
    }

    public static void printPreOrder(Tree tree) {

        if (tree != null) {
            System.out.println(tree.root);
            printPreOrder(tree.left);
            printPreOrder(tree.right);
        }
    }

    public static void printInOrder(Tree tree) {

        if (tree != null) {
            printInOrder(tree.left);
            System.out.println(tree.root);
            printInOrder(tree.right);
        }
    }

    public static void printPostOrder(Tree tree) {

        if (tree != null) {
            printPostOrder(tree.left);
            printPostOrder(tree.right);
            System.out.println(tree.root);
        }
    }
}
