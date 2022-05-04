public class MinMaxAve {

    public double[] MinMaxAveAlgorithm (int [] arr, int ind1, int ind2) {

        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double avg = 0;
        for (int i = ind1; i <= ind2; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } if (arr[i] > max) {
                max = arr[i];
            }
            avg += arr[i]/(Math.abs(ind2 - ind1) + 1);
        }
        double [] arrMminMaxAve = new double[3];
        arrMminMaxAve[0] = min;
        arrMminMaxAve[1] = max;
        arrMminMaxAve[2] = max;
        return arrMminMaxAve;
    }
}
