import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoodNumberTest {
    @Test
    public void testGoodNumberGoog() {
        int m = 15;
        String expectedResult = "Good Number";

        GoodNumber obj = new GoodNumber();
        String actualResult = obj.GoodNumberAgirithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodNumberBad() {
        int m = 9;
        String expectedResult = "Bad Number";

        GoodNumber obj = new GoodNumber();
        String actualResult = obj.GoodNumberAgirithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodNumberPoor() {
        int m = 25;
        String expectedResult = "Poor Number";

        GoodNumber obj = new GoodNumber();
        String actualResult = obj.GoodNumberAgirithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGoodNumberMinusOne() {
        int m = 23;
        String expectedResult = "-1";

        GoodNumber obj = new GoodNumber();
        String actualResult = obj.GoodNumberAgirithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
