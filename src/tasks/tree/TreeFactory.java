package tasks.tree;

public class TreeFactory {


    private Tree firstTree() {
        return new Tree(new Tree(2), new Tree(new Tree(4), new Tree(new Tree(6),new Tree(7),5), 3), 1);
    }

    public Tree generate() {
        return firstTree() ;
    }
}
