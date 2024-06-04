/*
Name : Min Thant
ID : 6612012
Section : 544
 */

public class Q12_ID6612012 {
    public static boolean isSplitable (int[] arr) {
        if (arr.length <= 1) {
            return false;
        }
        int sumLeft = 0;
        int sumRight;

        for (int i = 0; i < arr.length-1; i++) {
            sumRight = 0;
            sumLeft += arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sumRight += arr[j];
            }

            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isSplitable(new int[]{5}));
        System.out.println(isSplitable(new int[]{25, 25}));
        System.out.println(isSplitable(new int[]{1, 1, 1, 2, 1}));
        System.out.println(isSplitable(new int[]{2, 1, 1, 2, 1}));
        System.out.println(isSplitable(new int[]{5, 7, 16 , 44, 72}));
    }
}
