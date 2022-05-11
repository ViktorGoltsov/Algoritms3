import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountWordsTest {
    @Test
    public void testCountWordsHP1Java () {
    String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
            "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
            "version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support " +
            "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost " +
            "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
    String word = "Java";
    String expectedResult = "" + word + " --> 5";

    CountWords obj = new CountWords();
    String actualResult = obj.CountWordsAlgorithm(text, word);

    Assertions.assertEquals(expectedResult, actualResult);
}

    @Test
    public void testCountWordsHP2Version () {
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support " +
                "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost " +
                "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = "version";
        String expectedResult = "" + word + " --> 2";

        CountWords obj = new CountWords();
        String actualResult = obj.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsWithWordsOnTheBoards () {
        String text = "Java. As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support " +
                "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost " +
                "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.java";
        String word = "Java";
        String expectedResult = "" + word + " --> 7";

        CountWords obj = new CountWords();
        String actualResult = obj.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsNoMatches () {
        String text = "Java. As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support " +
                "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost " +
                "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.java";
        String word = "Lumumba";
        String expectedResult = "" + word + " --> 0";

        CountWords obj = new CountWords();
        String actualResult = obj.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsNotAVariation () {
        String text = "As of March 2022, Java8 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support " +
                "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost " +
                "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = "Java";
        String expectedResult = "" + word + " --> 4";

        CountWords obj = new CountWords();
        String actualResult = obj.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsEmptyText () {
        String text = "";
        String word = "Java";
        String expectedResult = "text.length() < word.length()";

        CountWords obj = new CountWords();
        String actualResult = obj.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountWordsEmptyWord () {
        String text = "As of March 2022, Java8 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support " +
                "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost " +
                "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = "";
        String expectedResult = "word.length() = 0";

        CountWords obj = new CountWords();
        String actualResult = obj.CountWordsAlgorithm(text, word);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
