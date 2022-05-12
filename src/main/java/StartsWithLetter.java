import static Utils.Utils.checkIfCharIsLetter;
import static Utils.Utils.checkIfCharIsNumber;

public class StartsWithLetter {
    public String StartsWithLetterAlgorithm(String text, String letter) {
        String strResult = "";

        for (int i = 0; i < text.length(); i++) {
            if (i > 0 && text.substring(i, i + 1).equalsIgnoreCase(letter) && !checkIfCharIsLetter(text.charAt(i - 1))
                    && !checkIfCharIsNumber(text.charAt(i - 1)) || text.substring(i, i + 1).equalsIgnoreCase(letter) && i == 0) {
                do {
                    strResult += text.charAt(i);
                    i++;
                    if ((i == text.length() - 1) && checkIfCharIsLetter(text.charAt(i))) {
                        strResult += text.charAt(i);
                    }
                }
                while (checkIfCharIsLetter(text.charAt(i)) && i < text.length() - 1);
                if (i < text.length() - 2) {
                    strResult += ", ";
                }
            }
        }
        if (!strResult.equalsIgnoreCase("") && strResult.substring(strResult.length() - 2).equalsIgnoreCase(", ")) {
            strResult = strResult.substring(0, strResult.length() - 2);
        }
        return strResult;
    }
}
