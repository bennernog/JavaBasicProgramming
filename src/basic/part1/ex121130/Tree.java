package basic.part1.ex121130;

import java.util.Random;

//Tree object for Tree problems
public class Tree {

    public final int root;
    public Tree left,right;

    public Tree(int root) {
        this(root, null, null);
    }

    public Tree(int root, Tree left, Tree right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public void reverseNodes(){
        if(left == null && right == null) return;

        var temp = left;
        left = right;
        right = temp;
    }

    @Override
    public String toString() {

        var sb = new StringBuilder();
        sb.append(root);

        var pointerRight = "└──";
        var pointerLeft = (count() == 2) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, left, right != null);
        traverseNodes(sb, "", pointerRight, right, false);

        return sb.toString();
    }

    private void traverseNodes(StringBuilder sb, String padding, String pointer, Tree node, boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.root);

            var paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            var paddingForBoth = paddingBuilder.toString();
            var pointerRight = "└──";
            var pointerLeft = (node.count() == 2) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.left, node.count() == 2);
            traverseNodes(sb, paddingForBoth, pointerRight, node.right, false);
        }
    }

    public int count() {
        int c = 0;
        if (left != null) c++;
        if (right != null) c++;

        return c;
    }

    public static Tree getRandomTree(Random random, int depth) {
//        Tree tree = null;
//
//        do {
//            tree = getRandomTree(random, depth, 0);
//        } while (tree == null);
//
//        return tree;
        return getRandomTree(random, depth, 0);
    }

    private static Tree getRandomTree(Random random, int depth, int count) {
        boolean make = coinFlip(random) || count < 2;
        if(make && count < depth){
            int root = random.nextInt(20) + 1;
            count++;
            Tree left = getRandomTree(random, depth, count);
            Tree right = getRandomTree(random, depth, count);
            return new Tree(root, left, right);
        }
        return null;
    }

    private static boolean coinFlip(Random random) {
        int r = random.nextInt(100);
        return r % 2 == 0 || r % 3 == 0;
    }
}

