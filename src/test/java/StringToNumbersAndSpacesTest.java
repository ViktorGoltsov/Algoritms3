import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersAndSpacesTest {
    @Test
    public void testStringToNumbersAndSpaces () {
        String str = "fh hj2 2JKn $** ";
        String expectedResult = " 2 2  ";

        StringToNumbersAndSpaces obj = new StringToNumbersAndSpaces();
        String actualResult = obj.StringToNumbersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesOneMatches () {
        String str = "fhhj2JKn$**";
        String expectedResult = "2";

        StringToNumbersAndSpaces obj = new StringToNumbersAndSpaces();
        String actualResult = obj.StringToNumbersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesNoMatches () {
        String str = "fhhjJKn$**";
        String expectedResult = "";

        StringToNumbersAndSpaces obj = new StringToNumbersAndSpaces();
        String actualResult = obj.StringToNumbersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesEmpty () {
        String str = "";
        String expectedResult = "";

        StringToNumbersAndSpaces obj = new StringToNumbersAndSpaces();
        String actualResult = obj.StringToNumbersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
