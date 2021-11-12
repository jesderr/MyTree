import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTreeTests {
    private MyTree tree;

    @Test
    public void addByValueInBinaryTreeTest(){
        this.tree = new MyTree();

        this.tree.add(12);

        int actual = this.tree.getNodeValue(12);

        int expected = 12;

        Assertions.assertEquals(expected,actual);

        /*
        boolean contain = this.tree.contains(12);

        Assertions.assertTrue(contain);
         */
    }

    @Test
    public void deleteByValueInBinaryTreeTest() {
        this.tree = new MyTree();

        this.tree.add(32);
        this.tree.add(22);
        this.tree.add(37);
        this.tree.add(19);

        this.tree.delete(22);

        boolean contain = this.tree.contains(22);

        Assertions.assertFalse(contain);
    }

    @Test
    public void shouldReturnTrueForContainsInBinaryTreeTest(){
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(3);
        this.tree.add(47);
        this.tree.add(32);
        this.tree.add(75);
        this.tree.add(70);
        this.tree.add(94);
        this.tree.add(49);

        boolean isContain = this.tree.contains(94);

        Assertions.assertTrue(isContain);
    }

    @Test
    public void shouldReturnFalseForContainsInBinaryTreeTest(){
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(2);
        this.tree.add(47);
        this.tree.add(65);
        this.tree.add(49);

        boolean isContain = this.tree.contains(12);

        Assertions.assertFalse(isContain);
    }

    @Test
    public void checkingOnMethodDFCPreOrderInBinaryTreeTest(){
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(3);
        this.tree.add(75);

        this.tree.printDfsPreOrder();

        int[] expected = new int[] {48,27,3,75};

        Assertions.assertArrayEquals(this.tree.arrayOfValues,expected);
    }

    @Test
    public void checkingOnMethodDFCInOrderInBinaryTreeTest(){
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(3);
        this.tree.add(75);

        this.tree.printDfsInOrder();

        int[] expected = new int[] {3,27,48,75};

        Assertions.assertArrayEquals(this.tree.arrayOfValues,expected);
    }

    @Test
    public void checkingOnMethodDFCPostOrderInBinaryTreeTest(){
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(3);
        this.tree.add(75);

        this.tree.printDfsPostOrder();

        int[] expected = new int[] {3,27,75,48};

        Assertions.assertArrayEquals(this.tree.arrayOfValues,expected);
    }


}
