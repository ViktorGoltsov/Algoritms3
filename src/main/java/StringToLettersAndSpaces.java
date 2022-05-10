public class StringToLettersAndSpaces {
    public String StringToLettersAndSpacesAlgotithm (String str) {
        if (str.equalsIgnoreCase("")) {
            return "";
        }
        //String[] arrCharsFromString = str.split("");
        int count = 0;
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <=90 || str.charAt(i) >= 97 && str.charAt(i) <= 122 || str.charAt(i) == ' ') {
                newStr += str.charAt(i);
            }
        }

        return newStr;
    }
}
