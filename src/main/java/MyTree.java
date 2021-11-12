import java.util.ArrayList;

public class MyTree {
    private Node root = null;
    public int size = 0;
    public int[] arrayOfValues;
    public int i = 0;

    public void add(int value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
            size++;
            return;
        }
        Node cur = this.root;
        while (cur != null) {
            if (cur.value > value) {
                if (cur.left == null) {
                    cur.left = newNode;
                    size++;
                    break;
                } else {
                    cur = cur.left;
                }
            } else if (cur.value <= value) {
                if (cur.right == null) {
                    cur.right = newNode;
                    size++;
                    break;
                } else {
                    cur = cur.right;
                }
            }
        }
    }

    public int size() {
        return size;
    }

    /*
    public void addRec(int value) {
        if (this.root == null) {
            this.root = new Node(value);
            return;
        }
        this.recursiveAdd(value, this.root);
    }

    private void recursiveAdd(int value, Node cur) {
        if (cur.value > value) {
            if (cur.left == null) {
                cur.left = new Node(value);
                return;
            }
            this.recursiveAdd(value, cur.left);
        } else if (cur.value <= value) {
            if (cur.right == null) {
                cur.right = new Node(value);
                return;
            }
            this.recursiveAdd(value, cur.right);
        }
    }
     */


    public void delete(int value) {
        Node previousNodeForDelete = this.searchPrevious(value);
        Node nodeForDelete = previousNodeForDelete.value > value
                ? previousNodeForDelete.left
                : previousNodeForDelete.right;
        if (nodeForDelete.right == null && nodeForDelete.left == null
                && previousNodeForDelete.value > value) {
            previousNodeForDelete.left = null;
            return;
        }
        if (nodeForDelete.right == null) {
            previousNodeForDelete.left = nodeForDelete.left;
            return;
        }
        Node cur = nodeForDelete.right;
        Node prev = cur;
        while (cur.left != null) {
            prev = cur;
            cur = cur.left;
        }
        Node node = new Node(cur.value);
        if (previousNodeForDelete.value > value) {
            previousNodeForDelete.left = node;
            node.left = nodeForDelete.left;
            node.right = nodeForDelete.right;
            prev.left = null;
        } else {
            previousNodeForDelete.right = node;
            node.left = nodeForDelete.left;
            node.right = cur.right;
        }
    }

    private Node searchPrevious(int value) {
        Node cur = this.root;
        Node previous = null;
        while (cur.value != value) {
            previous = cur;
            if (cur.value > value) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return previous;
    }

    public int getNodeValue(int value) {
        Node cur = this.root;
        while (cur.value != value) {
            if (cur.value > value) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return cur.value;
    }

    public boolean contains(int value) {
        Node cur = this.root;
        Node previous = null;
        if (cur.value == value) {
            return true;
        }
        while (cur.value != value) {
            previous = cur;
            if (cur.value > value && cur.left != null) {
                cur = cur.left;
            } else if (cur.value < value && cur.right != null) {
                cur = cur.right;
            } else {
                return false;
            }
        }
        return previous.left == cur || previous.right == cur;
    }

    private void dfsPreOrder(Node cur) {
        if (cur == null) {
            return;
        }
        if(i == 0){
            this.arrayOfValues = new int[size];
        }
        arrayOfValues[i] = cur.value;
        i++;
        dfsPreOrder(cur.left);
        dfsPreOrder(cur.right);
    }

    public void printDfsPreOrder() {
        dfsPreOrder(this.root);
    }

    private void dfcInOrder(Node cur) {
        if (cur == null) {
            return;
        }
        dfcInOrder(cur.left);
        if(i == 0){
            this.arrayOfValues = new int[size];
        }
        arrayOfValues[i] = cur.value;
        i++;
        dfcInOrder(cur.right);
    }

    public void printDfsInOrder() {
        dfcInOrder(this.root);
    }

    private void dfcPostOrder(Node cur) {
        if (cur == null) {
            return;
        }
        dfcPostOrder(cur.left);
        dfcPostOrder(cur.right);
        if(i == 0){
            this.arrayOfValues = new int[size];
        }
        arrayOfValues[i] = cur.value;
        i++;
    }

    public void printDfsPostOrder() {
        dfcPostOrder(this.root);
    }
}








