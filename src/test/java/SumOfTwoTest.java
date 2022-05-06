import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SumOfTwoTest {
    @Test
    public void testSumOfTwoHP () {
        int [] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int [][] expectedResult = new int [][]{{3, 9}, {7, 5}};

        SumOfTwo obj = new SumOfTwo();
        int [][] actualResult = obj.sumOfTwoAlgoriyhm(arr, n);

        Assertions.assertEquals(Arrays.deepToString(expectedResult), Arrays.deepToString(actualResult));
    }

    @Test
    public void testSumOfTwoOnlyOnePair () {
        int [] arr = {4, 3, 7, 1, 5, 2, 9, 4, 2};
        int n = 16;
        int [][] expectedResult = new int [][]{{7,9}};

        SumOfTwo obj = new SumOfTwo();
        int [][] actualResult = obj.sumOfTwoAlgoriyhm(arr, n);

        Assertions.assertEquals(Arrays.deepToString(expectedResult), Arrays.deepToString(actualResult));
    }

    @Test
    public void testSumOfTwoNoNeededSumPairNegative () {
        int [] arr = {4, 3, 7, 1, 5, 2, 9, 4, 2};
        int n = 17;
        int [][] expectedResult = new int [][]{};

        SumOfTwo obj = new SumOfTwo();
        int [][] actualResult = obj.sumOfTwoAlgoriyhm(arr, n);

        Assertions.assertEquals(Arrays.deepToString(expectedResult), Arrays.deepToString(actualResult));
    }

    @Test
    public void testSumOfTwoZeroInput () {
        int [] arr = {};
        int n = 16;
        int [][] expectedResult = new int [][]{};

        SumOfTwo obj = new SumOfTwo();
        int [][] actualResult = obj.sumOfTwoAlgoriyhm(arr, n);

        Assertions.assertEquals(Arrays.deepToString(expectedResult), Arrays.deepToString(actualResult));
    }
}
