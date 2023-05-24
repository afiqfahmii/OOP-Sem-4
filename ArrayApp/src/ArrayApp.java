import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        float sum = 0f;
        int largestIndex = 0;
        int lowestIndex = 0;

        // ? 1st Syntax
        String[] aList = { "Afiq", "Fahmi", "Roslan" };
        // int[] aList;
        // aList = new int[10];

        // ? 2nd Syntax
        int[] aBilangan = new int[10]; // or int aNum = new int[10];
        // int aBilangan[] = { 1, 2, 3, 4, 5, 6 };

        // ? 3rd Syntax
        float aNum[] = { 1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f, -10.5f, -12.3f };
        float largestElement = aNum[0];

        System.out.println("Value of fNum: " + aNum[2]);
        for (int i = 0; i < aNum.length; i++) {
            System.out.println("Value Of Each Element : " + aNum[i]);
        }

        // for (String val : aList) {
        // System.out.println(val);
        // }

        // for (float val : aNum) {
        // System.out.println(val);
        // }
        // for (int val : aBilangan) {
        // System.out.println(val);
        // }

        for (int i = 0; i < aNum.length; i++) {
            sum += aNum[i];
        }

        System.out.println("The sum of all elements in the array is: " + sum);

        for (int i = 1; i < aNum.length; i++) {
            if (aNum[i] > aNum[largestIndex]) {
                largestIndex = i;
            }
            if (aNum[i] < aNum[lowestIndex]) {
                lowestIndex = i;
            }
        }

        System.out.println("The index of the largest position in the array is: " + largestIndex);
        System.out.println("The index of the lowest position in the array is: " + lowestIndex);

        // Finding Largest Element Number

        for (int i = 1; i < aNum.length; i++) {
            if (aNum[i] < aNum[largestIndex]) {
                largestElement = aNum[i];
            }

        }
        System.out.println("The index of the largest Element in the array is: " + aNum[largestIndex]);

        // for (float temp : aNum) {
        // System.out.println("Enter Value: " + temp);
        // temp = s.nextFloat();
        // }

        // Call method to display all element in aNum
        diplayAll(aNum);
        swapvalue(aNum);
        System.out.println("After Swap :");
        diplayAll(aNum);
        displayAll(aList);

        // implement method sum to the value of Num
        float result = sumMethod(aNum);
        System.out.println("Sum is:" + sum);
        
        // float highest = largestMethod(aNum);
        // System.out.println("Largest is:" + highest);

    }

    private static void diplayAll(float[] x) {
        for (float temp : x) {
            System.out.println(temp);
        }
    }

    private static void displayAll(String[] y) {
        for (String name : y) {
            System.out.println(name);
        }
    }

    private static float sumMethod(float[] x) {
        float sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

    // public static float largestMethod(float[] x) {
    // float highest = 0f;
    // for (int i = 1; i < x.length; i++) {
    // if (x[i] < x[highest]) {
    // highest = x[i];
    // }

    // }
    // return highest;
    // }

    private static void swapvalue(float[] x) {
        float temp = x[0];
        x[0] = x[x.length - 1];
        x[x.length - 1] = temp;
    }

}
