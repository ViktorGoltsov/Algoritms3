import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PeakElementTest {
    @Test
    public void testPeakElementHP () {
        int[] arr = new int[]{3, 2, 7, 5, 1, 9, 23, 1};
        int [] expectedResult = {3, 7, 23};

        PeakElement obj = new PeakElement();
        int[] actualResult = obj.PeakElementAlgorithm(arr);

        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));

    }
}
