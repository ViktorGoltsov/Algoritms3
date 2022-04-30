//1 Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное, и “Even”,
// если число четное. Во всех остальных случаях результат будет “Undefined”.
//
//Test Data:
//-345 →  “Odd”
//0 →  “Even”
//222222 →  “Even”
//2147483647 + 1 →  “Undefined”
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void testOddEven1 () {

        int number = -345;
        String expectedResult = "Odd";

        OddEven oe = new OddEven();

        String actualResult = oe.oddEvenAlgotithm(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven2 () {

        int number = -0;
        String expectedResult = "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEvenAlgotithm(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven3 () {

        int number = 222222;
        String expectedResult = "Even";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEvenAlgotithm(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenMaxIntPlus1 () {


        int number = 2147483647 + 11; // целочисленный охват //https://javascopes.com/java-overflow-underflow-6e10f90e/

        String expectedResult = "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEvenAlgotithm(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenCharF () {


        int number = 'f';

        String expectedResult = "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEvenAlgotithm(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenCharNum () {


        int number = '7';

        String expectedResult = "Undefined";

        OddEven oe = new OddEven();
        String actualResult = oe.oddEvenAlgotithm(number);
        Assertions.assertEquals(expectedResult, actualResult);
    }




}
