import static Utils.Utils.*;

public class ReverseArray {
    public int[] ReverseArrayAlgorithm (int[] arr) {
        checkzero(arr);
        int[] arrRevers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrRevers[i] = arr[arr.length - 1 - i];
        }

        return arrRevers;
    }
}
