import static Utils.Utils.checkzero;

public class PeakElement {

    public int [] PeakElementAlgorithm (int [] arr) {
        checkzero(arr);
        int count = 0;

        if (arr[0] > arr[1]) {
            count +=1;
        }
        if (arr[arr.length -1 ] > arr[arr.length - 2]) {
            count +=1;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
            count += 1;
            }
        }
        int first = 0;
        int last = arr.length;
        int [] arrPicNum = new int[count];
        if (arr[0] > arr[1]) {
            arrPicNum[0] = arr[0];
            first++;
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            arrPicNum[count-1] = arr[arr.length-1];
            last--;
        }

        for (int i = first; i < last; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                arrPicNum[first] = arr[i];
                first++;
            }
        }

        return arrPicNum;

    }
}
