import static Utils.Utils.*;

public class CountWords {
    public String CountWordsAlgorithm (String text, String word) {

        if (text.length() < word.length()) {

        return "text.length() < word.length()";}

        if (word.length() == 0) {
            return "word.length() = 0";
        }

        int count = 0;
        for (int i = 1; i < text.length() - word.length(); i++) {
            if (text.substring(i, i + word.length()).equalsIgnoreCase(word)
                    && !checkIfCharIsLetter(text.charAt(i - 1)) && !checkIfCharIsNumber(text.charAt(i - 1))
//                    && (text.charAt(i - 1) < 48
//                    || text.charAt(i - 1) > 57 && text.charAt(i - 1) < 65
//                    || text.charAt(i - 1) > 90 && text.charAt(i - 1) < 97
//                    || text.charAt(i - 1) > 122)
                    && !checkIfCharIsLetter(text.charAt(i + word.length())) && !checkIfCharIsNumber(text.charAt(i + word.length()))
//                    && (text.charAt(i + word.length()) < 48
//                    || text.charAt(i + word.length()) > 57 && text.charAt(i + word.length()) < 65
//                    || text.charAt(i + word.length()) > 90 && text.charAt(i + word.length()) < 97
//                    || text.charAt(i + word.length()) > 122)
            ) {
                count++;
                i += word.length()-1;
            }
        }
        // условие для начала строки
        if (text.substring(0, word.length()).equalsIgnoreCase(word)
                && !checkIfCharIsLetter(text.charAt(word.length())) && !checkIfCharIsNumber(text.charAt(word.length())))
//                && (text.charAt(word.length()) < 48
//                || text.charAt(word.length()) > 57 && text.charAt(word.length()) < 65
//                || text.charAt(word.length()) > 90 && text.charAt(word.length()) < 97
//                || text.charAt(word.length()) > 122))
              {
            count++;
        }
        // условие для конца строки
        if(text.substring(text.length() - word.length()).equalsIgnoreCase(word)) {
            count++;
                }

        return ("" + word + " --> " + count);
    }
}
