public class StringToNumbers {
    public int[] StringToNumbersAlgorithm (String str) { //*дополнено уточняющим условием: если строка содержит буквы,
        // то в массив записываются коды соотствующих значений char
        if (str.equalsIgnoreCase("")) {
            return new int[]{};
        }
        String[] arrOfNumString = str.split(", ");

        int [] arrOfNumInt = new int[arrOfNumString.length];

        for (int i = 0; i < arrOfNumString.length; i++) {
            if (((int) arrOfNumString[i].charAt(0) >= 65 && (int) arrOfNumString[i].charAt(0) <= 90)
                    || ((int) arrOfNumString[i].charAt(0) >= 97 && (int) arrOfNumString[i].charAt(0) <= 122)) {
                arrOfNumInt[i] = (int) arrOfNumString[i].charAt(0);
            } else {
                arrOfNumInt[i] = Integer.parseInt(arrOfNumString[i]); //*
            }
        }

        return arrOfNumInt;
    }
}
