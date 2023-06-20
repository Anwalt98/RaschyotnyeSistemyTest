import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

@Test
class TaskTest {

    @Test
    void findEquals() {
        String[] array = {"a", "f", "ffa", "faf", "bb", "bwb", "w2bb", "bb2w"};
        Task.findEquals(array);
        ArrayList list = new ArrayList();
        list.add("aff = [2, 3]");
        list.add("2bbw = [6, 7]");
        Assert.assertEquals(Task.findEquals(array), list);
    }

    @Test
    void findEqualsWithEmptyLine() {
        String[] array = new String[0];
        Task.findEquals(array);
        ArrayList list = new ArrayList();
        Assert.assertEquals(Task.findEquals(array), list);
    }

    @Test
    void findWithInvalidInput() {
        String[] array = {"%s%s", "s%%s", "ffa", "0"};
        Task.findEquals(array);
        ArrayList list = new ArrayList();
        list.add("%s%s = [0, 1]");
        Assert.assertNotEquals(Task.findEquals(array), list);
    }
}