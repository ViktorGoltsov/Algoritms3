import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {
    @Test
    public void testNegativeOnTheRightHP () {
        int[] arr = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int [] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOnTheRight obj = new NegativeOnTheRight();
        int[] actualResult = obj.NegativeOnTheRightAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightAllNegativ () {
        int[] arr = {-3, -12, -2};
        int [] expectedResult = {-3, -12, -2};

        NegativeOnTheRight obj = new NegativeOnTheRight();
        int[] actualResult = obj.NegativeOnTheRightAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightNoNegativ () {
        int[] arr = {5, 0, 5};
        int [] expectedResult = {5, 0, 5};

        NegativeOnTheRight obj = new NegativeOnTheRight();
        int[] actualResult = obj.NegativeOnTheRightAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightEmpty () {
        int[] arr = {};
        int [] expectedResult = {};

        NegativeOnTheRight obj = new NegativeOnTheRight();
        int[] actualResult = obj.NegativeOnTheRightAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
