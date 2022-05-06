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

    @Test
    public void testSortArrayfromMinus () {
        int[] arr = {4, 3,- 7, 12, 5, 2, 9, 4, 12};
        int [] expectedResult = {-7, 2, 3, 4, 4, 5, 9, 12, 12};

        SortArray obj = new SortArray();
        int [] actualResult = obj.sortArrayAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayEmpty () {
        int[] arr = {};
        int [] expectedResult = {};

        SortArray obj = new SortArray();
        int [] actualResult = obj.sortArrayAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayAllTheSame () {
        int[] arr = {3, 3, 3};
        int [] expectedResult = {3, 3, 3};

        SortArray obj = new SortArray();
        int [] actualResult = obj.sortArrayAlgorithm(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }



}
