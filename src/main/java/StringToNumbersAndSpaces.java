public class StringToNumbersAndSpaces {
    public String StringToNumbersAndSpacesAlgorithm (String str) {
        if (str.equalsIgnoreCase("")) {

            return "";
        }
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57 || str.charAt(i) == ' ') {
                newStr += str.charAt(i);
            }
        }

        return newStr;
    }
}
