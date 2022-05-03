//4
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {
    @Test
    public void testBiggerValueHP() {
        int a = 3333;
        int b = 9999;

        int expectedResult = b;
        BiggerValue obj = new BiggerValue();
        int actualResult = obj.BiggerValueAlgorothm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueHP2aEqualsb() {
        int a = 3333;
        int b = 3333;

        int expectedResult = a;
        BiggerValue obj = new BiggerValue();
        int actualResult = obj.BiggerValueAlgorothm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

        @Test
        public void testBiggerValueHP3() {
            int a = 1;
            int b = 0;

            int expectedResult = a;
            BiggerValue obj = new BiggerValue();
            int actualResult = obj.BiggerValueAlgorothm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
