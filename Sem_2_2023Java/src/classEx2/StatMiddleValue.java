/*
 * Name : Min Thant
 * ID : 6612012
 * Sec.544
 */

package classEx2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class StatMiddleValue {
    public static double mean(double[] arr, int n) {
        if (arr.length > 0) {
            double sum = 0;

            for (double num : arr) {
                sum += num;
            }
            return sum / n;
        } else {
            System.out.println("No valid mean available");
            return -1;
        }
    }

    public static double mode(double[] arr, int n) {
        ArrayList<Double> seen = new ArrayList<>();
        ArrayList<double[]> mainList = new ArrayList<>();

        if (arr.length > 0) {

            for (double i : arr) {
                if (!seen.contains(i)) {
                    seen.add(i);
                }
            }

            for (double x : seen) {
                int count = 0;
                for (double y : arr) {
                    if (x == y) {
                        count += 1;
                    }
                } mainList.add(new double[]{x, count});
            }

//	        for(double[] subList : mainList) {
//	        	for (double dblElement : subList) {
//	        		System.out.print(dblElement + " ");
//	        	}
//	        	System.out.println();
//	        }

            double maxCountElementIndex = 0;
            double maxCount = 0;

            for (double[] z : mainList) {
                if (z[1] > maxCount) {
                    maxCountElementIndex = z[0];
                    maxCount = z[1];
                }
            }

            int modeCount = 0;
            String otp = "";
            for (double[] c : mainList) {
                if (c[1] == maxCount) {
                    modeCount++;
                    otp += String.valueOf(c[0] + "\n");
                }
            }

//	        for (double[] t : mainList) {
//	        	System.out.print(t[0] + " ");
//	        	System.out.println(t[1]);
//	        }

            if (seen.size() > 1 && maxCount == 1.0) {
                System.out.println("THERE IS NO MODE IN THE ARRAY!");
                return -1;
            } else if (modeCount > 1) {
                System.out.println("INVALID! THERE ARE " + modeCount + " MODES IN THE LIST!\n" + "MODES:-\n" + otp);
                return -1;
            } else {
                return maxCountElementIndex;
            }

        } else {
            System.out.println("No valid mode available");
            return -1;
        }
    }

    public static double median(double[] arr, int n) {
        if (arr.length > 0) {
            Arrays.sort(arr);
            if (n % 2 == 0) {
                int midIndex1 = (n/2)-1;
                int midIndex2 =  n/2;

                return (arr[midIndex1] + arr[midIndex2]) / 2.0;

            } else {
                return arr[n/2];
            }
        } else {
            System.out.println("No valid median available");
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//		Testing with inputed values

        System.out.print("Enter the size of the array (n) : ");
        int n = reader.nextInt();

        if (n <= 0) {
            System.out.println("INVALID INPUT! PLEASE TRY AGAIN");
            System.exit(0);
        }


        int index = 0;
        double[] doubleArray = new double[n];
        while (true) {
            System.out.print("Enter item(" + String.valueOf(index+1) + "): ");
            doubleArray[index] = reader.nextDouble();
            index++;
            if (index == n) {
                break;
            }
        }

        System.out.println("The mean is " + String.format("%.6f", mean(doubleArray, n)));
        System.out.println("The median is " + median(doubleArray, n));
        System.out.println("The mode is " + mode(doubleArray, n));

        reader.close();

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//		Testing with pre-intialized (n) value with 100 randomized numbers

//		int n = 100;
//		double[] doubleArray = new double[n+1];
//		for (int i = 0; i < n; i++) {
//			doubleArray[i] = Math.floor(random.nextDouble()*100);
//		}
//		
//		can use this to check the 100 randomized elements in the list 
//		for (double j : doubleArray) {
//			System.out.println(j);
//		}
//		
//		System.out.println("The mean is " + String.format("%.6f", mean(doubleArray, n)));
//		System.out.println("The median is " + median(doubleArray, n));
//		System.out.println("The mode is " + mode(doubleArray, n));
//		reader.close();

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//		Testing with an input (n) value with 100 randomized numbers

//		System.out.print("Enter the integer of the size of the list 'n' : ");
//		int n = reader.nextInt() + 1;
//		
//		if (n <= 0) {
//			System.out.println("INVALID INPUT! PLEASE TRY AGAIN");
//			System.exit(0);
//		}
//		
//		double[] doubleArray = new double[n];
//		for (int i = 0; i < n; i++) {
//			doubleArray[i] = Math.floor(random.nextDouble()*100);
//		}
//		
//		for (double j : doubleArray) {
//			System.out.println(j);
//		}
//		
//		System.out.println("The mean is " + String.format("%.6f", mean(doubleArray, n)));
//		System.out.println("The median is " + median(doubleArray, n));
//		System.out.println("The mode is " + mode(doubleArray, n));
//		reader.close();
    }
}