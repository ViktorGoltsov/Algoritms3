import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {
    @Test
    public void testMinMaxAveHP () {
       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int ind1 = 2;
        int ind2 = 6;
        double[] expectedResult = {3, 7, 5};

        MinMaxAve obj = new MinMaxAve();
        double [] actualResult = obj.MinMaxAveAlgorithm(arr, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveHP2MinLanth () {
        int[] arr = {1};
        int ind1 = 0;
        int ind2 = 0;
        double[] expectedResult = {1, 1, 1};

        MinMaxAve obj = new MinMaxAve();
        double [] actualResult = obj.MinMaxAveAlgorithm(arr, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexAtTheBoundary () {
        int[] arr = {2, 3, 4};
        int ind1 = 0;
        int ind2 = 2;
        double[] expectedResult = {2, 4, 3};

        MinMaxAve obj = new MinMaxAve();
        double [] actualResult = obj.MinMaxAveAlgorithm(arr, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexesOutOfArr () {
        int[] arr = {2, 3, 4};
        int ind1 = 0;
        int ind2 = 3;
        double[] expectedResult = {};

        MinMaxAve obj = new MinMaxAve();
        double [] actualResult = obj.MinMaxAveAlgorithm(arr, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexesOutOfArr2 () {
        int[] arr = {2, 3, 4};
        int ind1 = -1;
        int ind2 = 2;
        double[] expectedResult = {};

        MinMaxAve obj = new MinMaxAve();
        double [] actualResult = obj.MinMaxAveAlgorithm(arr, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexesOutOfArr5 () {
        int[] arr = {2, 3, 4, 5};
        int ind1 = 0;
        int ind2 = 4;
        double[] expectedResult = {};

        MinMaxAve obj = new MinMaxAve();
        double [] actualResult = obj.MinMaxAveAlgorithm(arr, ind1, ind2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
