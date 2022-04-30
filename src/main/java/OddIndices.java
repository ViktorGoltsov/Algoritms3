import static Utils.Utils.*;
//2
public class OddIndices {
  // Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result =  {590, 985, 68}
  public int[] OddIndicesAlgotitm(int[] arr) {
    checkzero(arr);

    int[] oddIndexesArr = new int[(int) (arr.length / 2)];
    int count = 0;
    for (int i = 1; i < arr.length; i += 2) {
      oddIndexesArr[count] = arr[i];
      count++;
    }

    return oddIndexesArr;
  }

  public double[] OddIndicesAlgotitm(double[] arr) {
    checkzero(arr);

    double[] oddIndexesArr = new double[(int) (arr.length / 2)];
    int count = 0;
    for (int i = 1; i < arr.length; i += 2) {
      oddIndexesArr[count] = arr[i];
      count++;
    }

    return oddIndexesArr;
  }



}

