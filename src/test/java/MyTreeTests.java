import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MyTreeTests {
    private MyTree tree;

    @Test
    public void addByValueInBinaryTreeTest() {
        this.tree = new MyTree();

        this.tree.add(12);

        int actual = this.tree.getNodeValue(12);

        int expected = 12;

        Assertions.assertEquals(expected, actual);

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
    public void shouldReturnTrueForContainsInBinaryTreeTest() {
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

        boolean isContain = this.tree.contains(3);

        Assertions.assertTrue(isContain);
    }

    @Test
    public void shouldReturnFalseForContainsInBinaryTreeTest() {
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(2);
        this.tree.add(47);
        this.tree.add(65);
        this.tree.add(49);

        boolean isContain = this.tree.contains(555);

        Assertions.assertFalse(isContain);
    }

    @Test
    public void checkingForCorrectOnMethodDFCPreOrderInBinaryTreeTest() {
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(3);
        this.tree.add(75);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(48);
        expected.add(27);
        expected.add(3);
        expected.add(75);

        Assertions.assertIterableEquals(expected, this.tree.getPreOrderTreeArray());


    }

    @Test
    public void checkingForIncorrectOnMethodDFCPreOrderInBinaryTreeTest(){
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(3);
        this.tree.add(75);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(48);
        expected.add(100);
        expected.add(100);
        expected.add(75);

        Assertions.assertNotEquals(expected,this.tree.getPreOrderTreeArray());
    }

    @Test
    public void checkingForCorrectOnMethodDFCInOrderInBinaryTreeTest() {
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(3);
        this.tree.add(75);

        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(3);
        expected.add(27);
        expected.add(48);
        expected.add(75);

        Assertions.assertIterableEquals(expected, this.tree.getInOrderTreeArray());
    }

    @Test
    public void checkingForIncorrectOnMethodDFCInOrderInBinaryTreeTest() {
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(3);
        this.tree.add(75);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(48);
        expected.add(100);
        expected.add(100);
        expected.add(75);

        Assertions.assertNotEquals(expected, this.tree.getInOrderTreeArray());
    }

    @Test
    public void checkingForCorrectOnMethodDFCPostOrderInBinaryTreeTest() {
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(3);
        this.tree.add(75);

        ArrayList<Integer> expected = new ArrayList<>();

        expected.add(3);
        expected.add(27);
        expected.add(75);
        expected.add(48);

        Assertions.assertIterableEquals(expected, this.tree.getPostOrderTreeArray());
    }

    @Test
    public void checkingForIncorrectOnMethodDFCPostOrderInBinaryTreeTest() {
        this.tree = new MyTree();

        this.tree.add(48);
        this.tree.add(27);
        this.tree.add(3);
        this.tree.add(75);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(48);
        expected.add(100);
        expected.add(100);
        expected.add(999);

        Assertions.assertNotEquals(expected, this.tree.getPostOrderTreeArray());
    }
}
