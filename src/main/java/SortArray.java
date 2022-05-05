import static Utils.Utils.checkzero;

public class SortArray {
    public int[] sortArrayAlgorithm (int[] arr) {
        checkzero(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int count;
                if (arr[j] < arr[i]) {
                    count = arr[i];
                    arr[i] = arr[j];
                    arr[j] = count;
                }
            }
        }
        return arr;
    }
}
