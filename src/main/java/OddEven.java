//1 1 Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное, и “Even”,
// если число четное. Во всех остальных случаях результат будет “Undefined”.
public class OddEven {
    public String oddEvenAlgotithm (int number) {
        if (number % 2 != 0) {
            return "Odd";
        } if (number % 2 == 0) {
            return "Even";
        }
        return "Undefined";
    }
}
