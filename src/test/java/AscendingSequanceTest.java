import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)  //для того, чтобы работал тест ордер

public class AscendingSequanceTest {
    //  AscendingSequance as;

    //  @BeforeEach  //используем чтобы вынести повторяющуюся часть одинаково используемую перед каждым тестом
    //  void setUp() {
    //     as = new AscendingSequance();
    // }

    // @RepeatedTest(2) //повторяет тест нужное количество раз
    @Order(1) //тест ордер - помечаем порядок для нужных тестов
    @Test
    public void testAscendingSequanceHappyPathPositivNumber() {
        //0.1.2.3.4.5 //Happy Path
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};  //весь блок выше это arrange

        AscendingSequance as = new AscendingSequance(); // создаем объект
        int[] actualResult = as.AscendingSequanceAlgorithm(start, end, step); //вызываем метод от объекта класса.
        // здесь не должно быть хардкода, только ссылки на параметры. Их пишем в начале теста, или в начале класса

        Assertions.assertArrayEquals(expectedResult, actualResult);//такой ассерт есть только в джей юнит // в юнит тестах делаю только по 1 ассерту
        //сначала экспектед, потом актуал. так в джей юнит. в тест нг - наоборот, сначала актуал, потом экспектед
    }

    @Order(2)
    @Test
    public void testAscendingSequanceHappyPathNegativ() {
        //-10.-9.-8.-7 //Happy Path
        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7};  //весь блок выше это arrange

        AscendingSequance as = new AscendingSequance(); // создаем объект
        int[] actualResult = as.AscendingSequanceAlgorithm(start, end, step); //вызываем метод от объекта класса.
        // здесь не должно быть хардкода, только ссылки на параметры. Их пишем в начале теста, или в начале класса

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAscendingSequanceHappyPathNegativNegPosNum() {
        //-10.-9.-8.-7 //Happy Path
        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5}; //весь блок выше это arrange

        AscendingSequance as = new AscendingSequance(); // создаем объект
        int[] actualResult = as.AscendingSequanceAlgorithm(start, end, step); //вызываем метод от объекта класса.
        // здесь не должно быть хардкода, только ссылки на параметры. Их пишем в начале теста, или в начале класса

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAscendingSequanceHappyPathNegativStepTwo() {
        //-10.-9.-8.-7 //Happy Path
        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4}; //весь блок выше это arrange

        AscendingSequance as = new AscendingSequance(); // создаем объект
        int[] actualResult = as.AscendingSequanceAlgorithm(start, end, step); //вызываем метод от объекта класса.
        // здесь не должно быть хардкода, только ссылки на параметры. Их пишем в начале теста, или в начале класса

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequanceStartLargeThenEnd() {
        //-10.-9.-8.-7 //Happy Path
        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {}; //весь блок выше это arrange

        AscendingSequance as = new AscendingSequance(); // создаем объект
        int[] actualResult = as.AscendingSequanceAlgorithm(start, end, step); //вызываем метод от объекта класса.
        // здесь не должно быть хардкода, только ссылки на параметры. Их пишем в начале теста, или в начале класса

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequanceNegativeStep() {
        //-10.-9.-8.-7 //Happy Path
        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {}; //весь блок выше это arrange

        AscendingSequance as = new AscendingSequance(); // создаем объект
        int[] actualResult = as.AscendingSequanceAlgorithm(start, end, step); //вызываем метод от объекта класса.
        // здесь не должно быть хардкода, только ссылки на параметры. Их пишем в начале теста, или в начале класса

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequanceStepIsZero() {
        //-10.-9.-8.-7 //Happy Path
        int start = 0;
        int end = 5;
        int step = 0;
        int[] expectedResult = {}; //весь блок выше это arrange

        AscendingSequance as = new AscendingSequance(); // создаем объект
        int[] actualResult = as.AscendingSequanceAlgorithm(start, end, step); //вызываем метод от объекта класса.
        // здесь не должно быть хардкода, только ссылки на параметры. Их пишем в начале теста, или в начале класса

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
