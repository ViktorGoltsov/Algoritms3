import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IntersectionTest {
    @Test
    public void testIntersectionHP1 () {
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 4, 2};
        int[] expecterdResult = {2, 4};

        Intersection obj = new Intersection();
        int[] actualResult = obj.IntersectionAlgorithm(arr1, arr2);

        Assertions.assertEquals(Arrays.toString(expecterdResult), Arrays.toString(actualResult));
    }

    @Test
    public void testIntersectionHP2 () {
        int[] arr1 = {1, 2, 4, 5, 8, 9};
        int[] arr2 = {8, 9, -4, -2};
        int[] expecterdResult = {8, 9};

        Intersection obj = new Intersection();
        int[] actualResult = obj.IntersectionAlgorithm(arr1, arr2);

        Assertions.assertEquals(Arrays.toString(expecterdResult), Arrays.toString(actualResult));
    }

    @Test
    public void testIntersectionHP3 () {
        int[] arr1 = {1, 2, 4, 5, 89};
        int[] arr2 = {8, 9, 45};
        int[] expecterdResult = {};

        Intersection obj = new Intersection();
        int[] actualResult = obj.IntersectionAlgorithm(arr1, arr2);

        Assertions.assertEquals(Arrays.toString(expecterdResult), Arrays.toString(actualResult));
    }

    @Test
    public void testIntersectionHPRepeteingElements () {
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 2, 1};
        int[] expecterdResult = {1, 2, 3};

        Intersection obj = new Intersection();
        int[] actualResult = obj.IntersectionAlgorithm(arr1, arr2);

        Assertions.assertEquals(Arrays.toString(expecterdResult), Arrays.toString(actualResult));
    }


}
