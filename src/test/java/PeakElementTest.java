import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PeakElementTest {
    @Test
    public void testPeakElementHP () {
        int[] arr = new int[]{3, 2, 7, 5, 1, 9, 23, 1};
        int [] expectedResult = {3, 7, 23};

        PeakElement obj = new PeakElement();
        int[] actualResult = obj.peakElementAlgorithm(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    public void testPeakElementHPSameNum () {
        int[] arr = new int[]{3, 2, 7, 1, 7, 3, 1};
        int [] expectedResult = {3, 7, 7};

        PeakElement obj = new PeakElement();
        int[] actualResult = obj.peakElementAlgorithm(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    public void testPeakElementHPEmpty () {
        int[] arr = new int[]{};
        int [] expectedResult = {};

        PeakElement obj = new PeakElement();
        int[] actualResult = obj.peakElementAlgorithm(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    public void testPeakElementHPDuplicate () {
        int[] arr = new int[]{2, 2, 8, 3, 3, 5};
        int[] expectedResult = {8, 5};

        PeakElement obj = new PeakElement();
        int[] actualResult = obj.peakElementAlgorithm(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    @Test
    public void testPeakElementHPDuplicate2 () {
        int[] arr = new int[]{5, 5, 5};
        int[] expectedResult = {};

        PeakElement obj = new PeakElement();
        int[] actualResult = obj.peakElementAlgorithm(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

}
