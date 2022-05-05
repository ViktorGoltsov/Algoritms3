import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PeakElement1Test {
    @Test
    public void testPeakElementHP () {
        int[] arr = new int[]{3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement1 obj = new PeakElement1();
        int[] actualResult = obj.peakElementAlgorithm1(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }
    @Test
    public void testPeakElementHPSameNum () {
        int[] arr = new int[]{3, 2, 7, 1, 7, 3, 1};
        int [] expectedResult = {3, 7, 7};

        PeakElement1 obj = new PeakElement1();
        int[] actualResult = obj.peakElementAlgorithm1(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    public void testPeakElementHPEmpty () {
        int[] arr = new int[]{};
        int [] expectedResult = {};

        PeakElement1 obj = new PeakElement1();
        int[] actualResult = obj.peakElementAlgorithm1(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    public void testPeakElementHPDuplicate () {
        int[] arr = new int[]{3, 2, 3, 1, 8, 3, -2, 5};
        int[] expectedResult = {3, 3, 8, 5};

        PeakElement1 obj = new PeakElement1();
        int[] actualResult = obj.peakElementAlgorithm1(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    public void testPeakElementAllTheSame () {
        int[] arr = new int[]{7, 7, 7};
        int[] expectedResult = {};

        PeakElement1 obj = new PeakElement1();
        int[] actualResult = obj.peakElementAlgorithm1(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

}
