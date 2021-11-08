
public class MyTree {
    private Node root = null;
    private Node cur = null;

    public MyTree() {
    }

    public void add(int value, int key) {
        Node cur = null;
        Node TreeTop = root;
        while (TreeTop != null) {
            cur = TreeTop;
            if (key < TreeTop.key) {
                TreeTop = TreeTop.left;
            } else if (key > TreeTop.key) {
                TreeTop = TreeTop.right;
            } else {
                break;
            }
        }
        Node newNode = new Node(value, key);
        if (root == null) {
            root = newNode;
        } else if (key > cur.key) {
            cur.right = newNode;
        } else {
            cur.left = newNode;
        }
    }

    public boolean delete() {
        return true;
    }

}
