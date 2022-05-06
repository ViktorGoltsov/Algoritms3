import static Utils.Utils.checkzero;

public class NegativeOnTheRight {
    public int[] NegativeOnTheRightAlgorithm (int[]arr) {
        checkzero(arr);
        int[]arrResult = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            if (arr[i] < 0) {
                arrResult[arr.length - 1 - count] = arr[i];
                count++;
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arrResult[count] = arr[i];
                count++;
            }
        }

        return arrResult;
    }

}
