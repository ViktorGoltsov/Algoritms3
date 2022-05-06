import static Utils.Utils.checkzero;

public class SumOfTwo {
    public int[][] sumOfTwoAlgoriyhm (int [] arr, int n) {
        checkzero(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    count++;
                }
            }
        }
       int[][] arrOfPair =new int[count][2];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    arrOfPair[count][0] = arr[i];
                    arrOfPair[count][1] = arr[j];
                    count++;
                }
            }
        }

        return arrOfPair;
    }
}
