import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArrayHP () {
        int[] arr = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray obj = new ReverseArray();
        int [] actualResult = obj.ReverseArrayAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayEmpty () {
        int[] arr = {};
        int[] expectedResult = {};

        ReverseArray obj = new ReverseArray();
        int [] actualResult = obj.ReverseArrayAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayOneItem () {
        int[] arr = {1};
        int[] expectedResult = {1};

        ReverseArray obj = new ReverseArray();
        int [] actualResult = obj.ReverseArrayAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
