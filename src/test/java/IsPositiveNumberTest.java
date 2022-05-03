//5
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumberHP1 () {
        int a = 555;

        boolean expectedResult = true;
        IsPositiveNumber obj = new IsPositiveNumber();
        boolean actualresult = obj.IsPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualresult);
    }

    @Test
    public void testIsPositiveNumberHP2 () {
        int a = 0;

        boolean expectedResult = true;
        IsPositiveNumber obj = new IsPositiveNumber();
        boolean actualresult = obj.IsPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualresult);
    }

    @Test
    public void testIsPositiveNumberHP3 () {
        int a = -555;

        boolean expectedResult = false;
        IsPositiveNumber obj = new IsPositiveNumber();
        boolean actualresult = obj.IsPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualresult);
    }

}
