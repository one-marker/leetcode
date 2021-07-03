package tasks.tree;


import java.util.*;

public class Solution {

    public static void printWideTree(Tree tree) {
        Queue<Tree> treeQueue = new LinkedList<>();
        treeQueue.add(tree);

        while (!treeQueue.isEmpty()) {
            Tree treeTMP = treeQueue.poll();

            System.out.println(treeTMP.value);
            if (treeTMP.left != null) {
                treeQueue.add(treeTMP.left);
            }
            if (treeTMP.right != null) {
                treeQueue.add(treeTMP.right);
            }
        }

    }

    public static void printDeepTree(Tree tree) {
        Stack<Tree> treeStack = new Stack<>();
        treeStack.add(tree);

        while (!treeStack.isEmpty()) {
            Tree treeTMP = treeStack.pop();

            System.out.println(treeTMP.value);

            if (treeTMP.right != null) {
                treeStack.push(treeTMP.right);
            }
            if (treeTMP.left != null) {
                treeStack.push(treeTMP.left);
            }
        }

    }

    public static int countDeep (Tree tree) {
        if (tree.left == null & tree.right == null) {
            return 1;
        }

        return 1 + Math.max(countDeep(tree.left), countDeep(tree.right));
    }

    public static int max_sum = Integer.MIN_VALUE;
    public static int countPath (Tree tree) {
        if (tree == null) {
            return 0;
        }

        int left = countPath(tree.left);
        int right = countPath(tree.right);
        int price_newpath = tree.value + left + right;

        // update max_sum if it's better to start a new path
        max_sum = Math.max(max_sum, price_newpath);

        return tree.value + Math.max(countPath(tree.left), countPath(tree.right));
    }

    static class B {
        public int k = 1;
        B() {}

    }
    public static void main(String[] args) {
//        TreeFactory treeFactory = new TreeFactory();
//        Tree tree = treeFactory.generate();
//
//        Optional.of(TreeFactory).

        B b =null;
        if (b==null || b.k==1) {
            System.out.println("1");
        }


//
//        boolean a = false;
//        boolean b = false;
//        if (a || b) {
//
//            return;
//        }
//        System.out.println("all false");
//        System.out.println(countDeep(tree));
     //   System.out.println(max_sum);
    }

}
