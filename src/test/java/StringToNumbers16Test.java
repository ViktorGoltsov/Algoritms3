import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbers16Test {
    @Test
    public void testStringToNumbers16 () {
        String str = "d5 fg 7kjlh1 1";
        String expectedResult = "5711";

        StringToNumbers16 obj = new StringToNumbers16();
        String actualResult = obj.StringToNumbers16Algotithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbers16OneItem () {
        String str = "d5 fg kjlh";
        String expectedResult = "5";

        StringToNumbers16 obj = new StringToNumbers16();
        String actualResult = obj.StringToNumbers16Algotithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbers16NoMatches () {
        String str = "d fg kjlh";
        String expectedResult = "";

        StringToNumbers16 obj = new StringToNumbers16();
        String actualResult = obj.StringToNumbers16Algotithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
