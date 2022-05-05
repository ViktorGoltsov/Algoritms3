public class KthLargest {
    public int KthLargestAlgotiyhm (int [] array, int k) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int count;

                if (array[i] > array[j]) {
                    count = array[i];
                    array[i] = array[j];
                    array[j] = count;
                }
            }
        }

        if (k < 1 || k > array.length) {
            return 0;
        } else {

            return array [array.length - k];
        }
    }
}
