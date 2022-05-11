import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersAndSpacesTest {
   @Test
    public void testStringToLettersAndSpaces () {
        String str = "a b c ABC123 0";
        String expectedResult = "a b c ABC ";

        StringToLettersAndSpaces obj = new StringToLettersAndSpaces();
        String actualResult = obj.StringToLettersAndSpacesAlgotithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersNoMatches () {
        String str = "165#16^51";
        String expectedResult = "";

        StringToLetters obj = new StringToLetters();
        String actualResult = obj.StringToLettersAlgotithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersEmpty () {
        String str = "";
        String expectedResult = "";

        StringToLetters obj = new StringToLetters();
        String actualResult = obj.StringToLettersAlgotithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
