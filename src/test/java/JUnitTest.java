import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {
    @Test
    public void testFindMax() {
        int[] emptyArray = {};
        int[] nullArray = null;
        int[] testArray = {1, 2, 25, 53, -22, 0, 4};


        Assert.assertNull(Finder.findMax(emptyArray));
        Assert.assertNull(Finder.findMax(nullArray));
        Assert.assertEquals(53, (int) Finder.findMax(testArray));
    }

    @Test
    public void testFindMin() {
        int[] emptyArray = {};
        int[] nullArray = null;
        int[] testArray = {1, 2, 25, 53, -22, 0, 4};


        Assert.assertNull(Finder.findMin(emptyArray));
        Assert.assertNull(Finder.findMin(nullArray));
        Assert.assertEquals(-22, (int) Finder.findMin(testArray));
    }
}
