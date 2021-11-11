import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTreeTests {
    private MyTree tree;

    @Test
    public void addByValueInTreeTest(){
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
    public void deleteByValueInTreeTest() {
        this.tree = new MyTree();

        this.tree.add(32);
        this.tree.add(22);
        this.tree.add(37);
        this.tree.add(19);

        this.tree.delete(22);

        boolean contain = this.tree.contains(22);

        Assertions.assertFalse(contain);
    }


}
