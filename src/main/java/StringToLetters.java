public class StringToLetters {
    public String StringToLettersAlgotithm (String str) {
        if (str.equalsIgnoreCase("")) {

            return "";
        }
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <=90 || str.charAt(i) >= 97 && str.charAt(i) <= 122) {
        newStr += str.charAt(i);
            }
        }

        return newStr;
    }
}
