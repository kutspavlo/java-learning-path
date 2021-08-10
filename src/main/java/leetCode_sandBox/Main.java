package leetCode_sandBox;

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

    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        shuffle(myArr);
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        System.out.println("*************");
        System.out.println(isValid("(){}}{"));

    }

}
