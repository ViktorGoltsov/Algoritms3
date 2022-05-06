public class NumberOccurrences {
    public int [][] NumberOccurrencesAlgorithm (int [] arr) {

        if (arr.length == 0) {
            return new int[][]{};
        } else if (arr.length == 1) {
            return new int[][]{{arr[0],1}};
        } else {
            SortArray obj = new SortArray();
            int[] array = obj.sortArrayAlgorithm(arr);

            int countMass = 0;
            for (int i = 0; i < array.length - 1; i++) {

                while (array[i] == array[i + 1] && i < array.length - 2) {
                    i++;
                }
                countMass++;
            }
            if (array[array.length - 1] != array[array.length - 2]) {
                countMass++;
            }

            int[][] arrNumOfOccur = new int[countMass][2];

            int j = 0;
            for (int i = 0; i < array.length - 1; i++) {
                int count = 1;
                while (array[i] == array[i + 1] && i < array.length - 2) {
                    i++;
                    count++;
                }
                arrNumOfOccur[j][0] = array[i];
                arrNumOfOccur[j][1] = count;
                j++;
            }
            if (array[array.length - 1] == array[array.length - 2]) {
                arrNumOfOccur[arrNumOfOccur.length - 1][1] += 1;
            } else {
                arrNumOfOccur[arrNumOfOccur.length - 1][0] = (array[array.length - 1]);
                arrNumOfOccur[arrNumOfOccur.length - 1][1] = 1;
            }

            return arrNumOfOccur;
        }
    }
}
