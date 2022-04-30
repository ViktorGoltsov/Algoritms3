import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
//2
public class OddIndicesTest {

    @Test

    public void testOddIndicesHP () {
        int[] arr = new int[]{-45, 590, 234, 985, 12, 68};
        int [] expectedResult = new int[] {590, 985, 68};

        OddIndices obj = new OddIndices();

        String actualResult = Arrays.toString(obj.OddIndicesAlgotitm(arr));
        Assertions.assertEquals(Arrays.toString(expectedResult), actualResult);
    }

    @Test
//positive
    public void testOddIndicesArrDoubleHP () {
        double[] arr = new double[]{2.3,53.2, 65.1};
        double [] expectedResult = new double[]{53.2};

        OddIndices obj = new OddIndices();

        String actualResult = Arrays.toString(obj.OddIndicesAlgotitm(arr));
        Assertions.assertEquals(Arrays.toString(expectedResult), actualResult);
    }

    @Test
//negative
    public void testOddIndicesEmpArr () {
        int[] arr = new int[]{};
        int [] expectedResult = new int[] {};

        OddIndices obj = new OddIndices();

        String actualResult = Arrays.toString(obj.OddIndicesAlgotitm(arr));
        Assertions.assertEquals(Arrays.toString(expectedResult), actualResult);
    }


}
