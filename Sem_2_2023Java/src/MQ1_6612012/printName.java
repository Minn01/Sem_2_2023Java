/*
Name : Min Thant
ID : 6612012
Section : 544
 */
package MQ1_6612012;

public class printName {
    public static void main(String[] args) {
        String strTest1 = "There are students including :Ben Affleck, VinDiesel, :Ryan Renolds, in this section.";
        String strTest2 = "There are students including named-Min Thant,";
        System.out.print("List Names : ");
        printNames(strTest1);
        System.out.print("\nList Names : ");
        printNames(strTest2);
    }

    public static void printNames(String strTest) {

        for (int i = 0; i < strTest.length()-9; i++) {
            if (strTest.substring(i, i+10).equals("no student")) {
                return;
            }
        }

        String temp = "";
        boolean counting = false;
        for (int j = 0; j < strTest.length(); j++) {
            if (strTest.startsWith("There are students including :")) {
                if (counting) {
                    if (j != strTest.length()-1) {
                        temp += strTest.charAt(j);
                    }
                }

                if (strTest.charAt(j) == ':') {
                    counting = true;
                } else if (strTest.charAt(j) == ','){
                    System.out.print(temp + " ");
                    temp = "";
                    counting = false;
                }
            }

            if (strTest.startsWith("There are students including: named-"))  {
                if (counting) {
                    if (j != strTest.length()-1) {
                        temp += strTest.charAt(j);
                    }
                }

                if (strTest.charAt(j) == '-') {
                    counting = true;
                } else if (strTest.charAt(j) == ','){
                    System.out.print(temp + " ");
                    temp = "";
                    counting = false;
                }
            }
        }
    }
}
