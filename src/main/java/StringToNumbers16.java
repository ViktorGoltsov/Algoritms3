public class StringToNumbers16 {
    public String StringToNumbers16Algotithm (String str) {
        if (str.equalsIgnoreCase("")) {

            return "";
        }
        int count = 0;
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                newStr += str.charAt(i);
            }
        }

        return newStr;
    }
}
