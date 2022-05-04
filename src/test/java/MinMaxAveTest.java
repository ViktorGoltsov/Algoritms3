import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {
    @Test
    public void testMinMaxAve () {
       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int ind1 = 2;
        int ind2 = 6;
        double[] expectedResult = {3,7,5};

        MinMaxAve obj = new MinMaxAve();
        double [] actualResult = obj.MinMaxAveAlgorithm(arr, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
