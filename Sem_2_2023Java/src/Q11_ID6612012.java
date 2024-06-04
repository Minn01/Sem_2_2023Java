/*
Name : Min Thant
ID : 6612012
Section : 544
 */

public class Q11_ID6612012 {
    public static String catchFoodFromSecondRat(String str) {
        boolean ratFound = false;

        for (int i = 0; i < str.length()-2; i++) {
            if (ratFound) {
                if (str.charAt(i) == 'r' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't') {
                    return str.substring(i+3);
                }
            } else {
                if (str.charAt(i) == 'r' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't') {
                    ratFound = true;
                }
            }
        } return null;
    }

    public static void main(String[] args) {
        System.out.println(catchFoodFromSecondRat("ratxxrat00"));
        System.out.println(catchFoodFromSecondRat("ratxxratyraty"));
        System.out.println(catchFoodFromSecondRat("xxratyyzzz"));
        System.out.println(catchFoodFromSecondRat("xyzxrat"));
        System.out.println(catchFoodFromSecondRat("mouseratapprrratrat"));
    }
}
