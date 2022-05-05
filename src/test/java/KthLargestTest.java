import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestTest {
    @Test
    public void testKthLargestHP () {
        int [] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest obj = new KthLargest();
        int actualResult = obj.KthLargestAlgotiyhm(arr, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestOneItem () {
        int [] arr = {4, 3, 3};
        int k = 3;
        int expectedResult = 3;

        KthLargest obj = new KthLargest();
        int actualResult = obj.KthLargestAlgotiyhm(arr, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestEmpty () {
        int [] arr = {};
        int k = 1;
        int expectedResult = 0;

        KthLargest obj = new KthLargest();
        int actualResult = obj.KthLargestAlgotiyhm(arr, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestkLessThenArrLength () {
        int [] arr = {0, 5, 4};
        int k = -1;
        int expectedResult = 0;

        KthLargest obj = new KthLargest();
        int actualResult = obj.KthLargestAlgotiyhm(arr, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
