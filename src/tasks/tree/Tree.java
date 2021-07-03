package tasks.tree;

public class Tree {
    Tree left = null;
    Tree right = null;
    int value;

    public Tree() {

    }

    public Tree(int value) {
        this.value = value;
    }

    public Tree(Tree left, Tree right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
}


