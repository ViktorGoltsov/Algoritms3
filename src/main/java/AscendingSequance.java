public class AscendingSequance {


    public int[] AscendingSequanceAlgorithm(int start, int end, int step) {
        if (step > 0 && start < end) {
            int[] result = new int[(end - start + 1)/step];

 //           int j = 0;

//            for (int i = start; i<= end;i  +=  step) {
//                if (j < result.length) {
//                    result[i]=i;
//                    j++;
//                }
//
//            }
            for (int i = 0; i < result.length; i++) {
                if (start <= end) {
                    result[i] = start;
                    start += step;
                }
            }
            return result;
        }
        return new int[]{}; //если не выполняются условия построения последовательности, возвращаем пустой массив
    }

}
