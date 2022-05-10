import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {
    @Test
    public void testStringToNumbersHP () {
        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = new int[]{1, 2, 3, 4, 5};

        StringToNumbers obj = new StringToNumbers();
        int[] actualResult = obj.StringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersHPOneItem () {
        String str = "1";
        int[] expectedResult = new int[]{1};

        StringToNumbers obj = new StringToNumbers();
        int[] actualResult = obj.StringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testStringToNumbersInputWithChar () {
        String str = "a, 2, 3, Z, 0";
        int[] expectedResult = new int[]{97, 2, 3, 90, 0};

        StringToNumbers obj = new StringToNumbers();
        int[] actualResult = obj.StringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersZero () {
        String str = "";
        int[] expectedResult = new int[]{};

        StringToNumbers obj = new StringToNumbers();
        int[] actualResult = obj.StringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
