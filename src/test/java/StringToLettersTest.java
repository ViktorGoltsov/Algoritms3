import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersTest {

   @Test
   public void testStringToLettersHP () {
        String str = "a b c ABC123 0";
        String expectedResult = "abcABC";

        StringToLetters obj = new StringToLetters();
        String actualResult = obj.StringToLettersAlgotithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testStringToLettersNoMatches () {
        String str = "15156 1651 651";
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

    @Test
    public void testStringToLettersWrongSimbols () {
        String str = "*)|#";
        String expectedResult = "";

        StringToLetters obj = new StringToLetters();
        String actualResult = obj.StringToLettersAlgotithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
