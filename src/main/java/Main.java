import com.sun.source.tree.Tree;

public class Main {
    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.add(48);
        myTree.add(27);
        myTree.add(3);
        myTree.add(47);
        myTree.add(32);
        myTree.add(75);
        myTree.add(70);
        myTree.add(49);
        myTree.add(94);

        System.out.println(myTree.getPostOrderTreeArray());
    }
}
