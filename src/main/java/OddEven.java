//1 1 Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное, и “Even”,
// если число четное. Во всех остальных случаях результат будет “Undefined”.
public class OddEven {
    public String oddEvenAlgotithm(long number) {

        if (number <= 2147483647L && number >= -2147483647L && Character.getNumericValue((char)number) == - 1) {
            if (number % 2 != 0) {

                return "Odd";
            } else {

                return "Even";
            }
        } else {

            return "Undefined";
        }
    }
}
