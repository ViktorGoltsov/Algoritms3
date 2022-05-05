import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortArrayTest {
    @Test
    public void testSortArray () {
        int[] arr = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int [] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray obj = new SortArray();
        int [] actualResult = obj.sortArrayAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
