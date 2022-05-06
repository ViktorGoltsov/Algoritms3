import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NumberOccurrencesTest {
    @Test
    public void testNumberOccurrencesHP () {
        int [] arr = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int [][] expectedResult = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        NumberOccurrences obj = new NumberOccurrences();
        int [][] actualResult = obj.NumberOccurrencesAlgorithm(arr);

        Assertions.assertEquals(Arrays.deepToString(expectedResult), Arrays.deepToString(actualResult));
    }

    @Test
    public void testNumberOccurrencesNoRepeats () {
        int [] arr = {1, 2, 3, 4, 5};
        int [][] expectedResult = {{1, 1}, {2, 1}, {3, 1}, {4, 1}, {5, 1}};

        NumberOccurrences obj = new NumberOccurrences();
        int [][] actualResult = obj.NumberOccurrencesAlgorithm(arr);

        Assertions.assertEquals(Arrays.deepToString(expectedResult), Arrays.deepToString(actualResult));
    }

    @Test
    public void testNumberOccurrencesTwoItem () {
        int [] arr = {2, 5};
        int [][] expectedResult = {{2, 1}, {5, 1}};

        NumberOccurrences obj = new NumberOccurrences();
        int [][] actualResult = obj.NumberOccurrencesAlgorithm(arr);

        Assertions.assertEquals(Arrays.deepToString(expectedResult), Arrays.deepToString(actualResult));
    }


    @Test
    public void testNumberOccurrencesOneItem () {
        int [] arr = {2};
        int [][] expectedResult = {{2, 1}};

        NumberOccurrences obj = new NumberOccurrences();
        int [][] actualResult = obj.NumberOccurrencesAlgorithm(arr);

        Assertions.assertEquals(Arrays.deepToString(expectedResult), Arrays.deepToString(actualResult));
    }

    @Test
    public void testNumberOccurrencesZero () {
        int [] arr = {};
        int [][] expectedResult = new int [][]{};

        NumberOccurrences obj = new NumberOccurrences();
        int [][] actualResult = obj.NumberOccurrencesAlgorithm(arr);

        Assertions.assertEquals(Arrays.deepToString(expectedResult), Arrays.deepToString(actualResult));
    }
}
