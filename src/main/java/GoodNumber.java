public class GoodNumber {
    public String GoodNumberAgirithm (int m) {
        if (m % 3 == 0 && m % 5 != 0) {

            return "Bad Number";
        } else if (m % 3 != 0 && m % 5 == 0) {

            return "Poor Number";
        } else if (m % 3 == 0 && m % 5 == 0) {

            return "Good Number";
        } else {

            return "-1";
        }
    }
}
