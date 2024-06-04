import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Name : Min Thant
ID : 6612012
Section : 544
 */

public class ArrayListAssignment {
    public static void main(String[] args) {
        ArrayList<Double> numList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many elements you want in the list : ");
        int n = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number you want to put in the list : ");
            numList.add(scanner.nextDouble());
        }
        Collections.sort(numList);
        System.out.println("\nSorted List : " + numList);
        System.out.println("Average : " + getAverage(numList));
    }

    public static double getAverage(ArrayList<Double> numList) {
        double sum = 0;
        for (double num : numList) {
            sum += num;
        } return sum / (double) numList.size();
    }
}
