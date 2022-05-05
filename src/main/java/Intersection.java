import java.util.Arrays;

import static Utils.Utils.checkzero;

public class Intersection {
    public int[] IntersectionAlgorithm(int[] arr1, int[] arr2) {
        checkzero(arr1);
        checkzero(arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] arrLong = new int[]{};
        int[] arrShort = new int[]{};
        if (arr1.length > arr2.length) {
            arrLong = arr1;
            arrShort = arr2;
        } else {
            arrLong = arr2;
            arrShort = arr1;

        }
        int count = 0;
        int previous = arrShort[0] + 1;

        for (int i = 0; i < arrShort.length; i++) {
            if (arrShort[i] == previous) {
                continue;
            } else {
                previous = arrShort[i];
                for (int j = 0; j < arrLong.length; j++) {
                    if (arrShort[i] == arrLong[j]) {
                        count++;
                        break;
                    }
                }
            }
        }

        if (count == 0) {
            return new int[]{};
        }

        int[] arr = new int[count];
        int count2 = 0;
        previous = arrShort[0] + 1;
        for (int i = 0; i < arrShort.length; i++) {
            if (arrShort[i] == previous) {
                continue;
            } else {
                previous = arrShort[i];

                for (int j = 0; j < arrLong.length; j++) {
                    if (arrShort[i] == arrLong[j]) {
                        arr[count2] = arrShort[i];
                        count2++;
                        break;
                    }
                }
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}
