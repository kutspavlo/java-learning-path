package leetCode_sandBox;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static void shuffle (int[] arr){
        for (int i = 0; i < arr.length; i++) {
           Random rand = new Random();
           int index = rand.nextInt(arr.length);
           int a = arr[index];
           arr[index] = arr[i];
           arr[i] = a;
        }
    }

    static boolean isValid(String s) {
        boolean isAllClosed = false;
        boolean isArraySym = false;
        boolean allNulls = false;
        int[] brackArr = new int[s.length()];
        int zeroCouner = 0;
        int arrSum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') brackArr[i] = 1;
            else if (s.charAt(i) == '[') brackArr[i] = 2;
            else if (s.charAt(i) == '{') brackArr[i] = 3;
            else if (s.charAt(i) == ')') brackArr[i] = -1;
            else if (s.charAt(i) == ']') brackArr[i] = -2;
            else if (s.charAt(i) == '}') brackArr[i] = -3;
        }

        for (int i = 0; i < brackArr.length; i++) {
            arrSum += brackArr[i];
        }

        for (int i = 0; i < (brackArr.length -1); i++) {
            if (((brackArr[i] + brackArr[i+1]) == 0) && (brackArr[i] > brackArr[i+1])) {
                brackArr[i] = 0;
                brackArr[i+1] = 0;
            }
        }

        for (int i = 0; i < brackArr.length; i++) {
            System.out.println(brackArr[i]);
        }

        for (int i = 0; i < brackArr.length; i++) {
            if (brackArr[i] != 0) allNulls = false;
            else allNulls = true;
        }

        if (allNulls) return true;

        int j = 0;
        while (brackArr[j] == 0) {
            j++;
        }

        int[] newBrackArr = new int[brackArr.length - j];
        for (int i = j; i < brackArr.length ; i++) {
            newBrackArr[i-j] = brackArr[i];

        }

        for (int i = 0; i < newBrackArr.length; i++) {
        }

        for (int i = 0; i < (newBrackArr.length)/2; i++) {
            if (Math.abs(newBrackArr[i]) != Math.abs(newBrackArr[newBrackArr.length - i-1])) isArraySym = false;
            else isArraySym = true;
        }



        if (arrSum == 0) isAllClosed = true;

        return isAllClosed && isArraySym;
    }


    static int reverse(int x) {
        int result = 0;
        System.out.println(Integer.MAX_VALUE);

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            System.out.println("result " + result);
            System.out.println("tail " + tail);
            System.out.println("new result " + newResult);
            System.out.println("new result - tail / 10  = " + (newResult-tail)/10);

            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;

        }

        static boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        int length = xStr.length();
        int[] xArr = new int[length];
        int xReversed = 0;
            for (int i = 0; i < length; i++) {
                System.out.println( "xxx" + x /(10^(length-i-1)));
               xReversed = (int) (xReversed + x /Math.round(Math.pow(10, length-i)));

                System.out.println(xReversed);
            }
        return true;
        }

    public static void main(String[] args) {
//        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        shuffle(myArr);
//        for (int i = 0; i < myArr.length; i++) {
//            System.out.print(myArr[i] + " ");
//        }
//        System.out.println();
//        System.out.println("*************");
//        System.out.println(isValid("(){}}{"));
        isPalindrome(123);

    }

}
