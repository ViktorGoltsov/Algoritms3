import static Utils.Utils.*;
public class SumArray {
    //3
    public int sumOfNumberInArrAlgorithm (int[] arr) {
         checkzero(arr);
         int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
         return sum;
    }

    public double sumOfNumberInArrAlgorithm (double[] arr) {
        checkzero(arr);
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
