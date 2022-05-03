import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    //3
    @Test
    public void testsumOfNumberInArrHP () {
        int []arr = new int [] {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray obj = new SumArray();

        int actualResult = obj.sumOfNumberInArrAlgorithm(arr);
        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testsumOfNumberInArrHP2 () {
        int []arr = new int [] {-7, -3};
        int expectedResult = -10;

        SumArray obj = new SumArray();

        int actualResult = obj.sumOfNumberInArrAlgorithm(arr);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testsumOfNumberInArrHP3WithDouble () {
        double []arr = new double [] {-7.2, -3.5};
        double expectedResult = -10.7;

        SumArray obj = new SumArray();

        double actualResult = obj.sumOfNumberInArrAlgorithm(arr);
        Assertions.assertEquals(expectedResult, actualResult);
    }



}
