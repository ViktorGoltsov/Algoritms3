import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testAreNumbersEqual {
    @Test
    public void testAreNumbersEqualAEqualsB () {
        int a = 89;
        Integer b = 89;
        int expectedResult = 0;

        AreNumbersEqual obj = new AreNumbersEqual();
        int actualResult = obj.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

        @Test
        public void testAreNumbersEqualAmoreThenB () {
            int a = 89;
            int b = -89;
            int expectedResult = 1;

            AreNumbersEqual obj = new AreNumbersEqual();
            int actualResult = obj.AreNumbersEqualAlgorithm(a, b);

            Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualBmoreThenA () {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual obj = new AreNumbersEqual();
        int actualResult = obj.AreNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
