package Java_Basic_Practise1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //1. Create and initialize 8 variables – one for each primitive type.
        byte byteVar = 111;
        System.out.println(byteVar);
        short shortVar = 15300;
        System.out.println(shortVar);
        int intVar = 1000000;
        System.out.println(intVar);
        long longVar = 3123432433123123188L;
        System.out.println(longVar);
        float floatVar = 3.142344f;
        System.out.println(floatVar);
        double doubleVar = 222.1231231231242432432434d;
        System.out.println(doubleVar);
        boolean booleanVar = true;
        System.out.println(booleanVar);
        System.out.println("************************************");

        //Assign the variables to a variable with a different type.
        //Try both widening and narrowing conversion.
        int myInt = shortVar;
        System.out.println(myInt);
        float myFloat = byteVar;
        System.out.println(myFloat);
        //narrow casting + using constant
        final byte myNewByte = (byte) (intVar / 10000);
        System.out.println(myNewByte);
        final float myNewFloat = (float) (doubleVar / 2);
        System.out.println(myNewFloat);
        System.out.println("************************************");

        //2. Use arithmetic, increment/decrement, relational and boolean operators with the variables.
        int x = 5;
        int y = 15;
        int z = 20;
        boolean t = true;
        boolean f = false;

        int sum = x + y;
        System.out.println(sum);
        int ded = z - y;
        System.out.println(ded);
        int mult = x * y;
        System.out.println(mult);
        System.out.println(z % y);
        System.out.println(++x);
        System.out.println(2 + ++x);
        System.out.println(~x);
        System.out.println(!t);
        System.out.println(10 << 2);
        System.out.println(x == y);
        System.out.println(x);
        System.out.println((x < y) && (z > 10000));
        System.out.println(!(t && f) || !f);
        System.out.println("************************************");

        //3. Use Math class methods with the variables
        int max = Math.max(99, y);
        System.out.println(max);
        double mathInt = Math.random();
        System.out.println("You're on " + Math.round(mathInt * 100) + "% lucky today");
        double tang = Math.tan(0.785398);
        System.out.println(tang);

        //5. Create few String variables and try to perform following
        //transformations and print the results:
        String stringOne = "What we will do with the drunken sailor early in the morning?";
        String stringTwo = "Put him in the longboat till he's sober!";
        String concat = stringOne.concat(stringTwo);
        System.out.println(concat);
        System.out.println(stringOne.charAt(3));
        System.out.println(stringOne.compareTo(stringTwo));
        System.out.println(stringOne.contains(stringTwo.substring(24, 25)));
        System.out.println(stringTwo.startsWith("Put"));
        System.out.println(stringOne.equals(stringTwo));
        System.out.println(stringOne.isEmpty());
        System.out.println(stringTwo.length());
        System.out.println(stringOne.matches("\\D*"));
        System.out.println(stringOne.replace(stringOne.substring(5, 7), "you"));
        String[] splitted = stringOne.split(" ");
        System.out.println(splitted[0]);
        System.out.println(Arrays.toString(splitted));
        System.out.println(stringOne.substring(0, 5));
        char[] myChatarray = stringOne.toCharArray();
        System.out.println(myChatarray[0]);
        System.out.println(stringOne.toLowerCase());
        System.out.println(stringOne.toUpperCase());
        String trimExample = "                   start";
        System.out.println(trimExample);
        System.out.println(trimExample.trim());
        System.out.println(stringOne.replace("a", "o"));
        int myIntToString = 94329423;
        String convertedString = String.valueOf(myIntToString);
        System.out.println(convertedString);
        System.out.println("************************************");

        //6. Console input/output example
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name.");
        String name = in.nextLine();
        String capName = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Enter your age.");
        String age = in.nextLine();
        System.out.println("Your name is " + capName + " and you are " + age + " years old.");
        System.out.println("************************************");

        //7. File input/output example: implement the functionality from previous
        //example using files for input and output data.
        File myFile = new File("src/main/java/Java_Basic_Practise1/my.txt");
        System.out.println(myFile.getName());
        System.out.println(myFile.getAbsolutePath());
        System.out.println(myFile.exists());
        String writeStr = "Pavlo 40";
        byte[] strBytes = writeStr.getBytes();
        Files.write(myFile.toPath(), strBytes);
        byte[] readedBytes = Files.readAllBytes(myFile.toPath());
        String readedString = new String(readedBytes);
        System.out.println(readedString);
        String[] splttedString = readedString.split(" ");
        System.out.println("Your name is " + splttedString[0] + " and you are " + splttedString[1] + " years old");
        System.out.println("************************************");

        //8. Compare pairs of numbers, strings, chars using conditional statement
        //   and print the greater value;
        int comp1 = 38;
        int comp2 = 18;

        if (comp1 > comp2) System.out.println(comp1 + " is bigger then " + comp2);
        else System.out.println(comp1 + " is smaller then " + comp2);

        String stringComp1 = "aaaaaaaaaaaaaaaaaaa44";
        String stringComp2 = "aaaaaaaaaaaaaaaaaaa";

        if (stringComp1.equals(stringComp2)) System.out.println(stringComp1 + " is same as " + stringComp2);
        else System.out.println(stringComp1 + " is not same as " + stringComp2);

        if (stringComp1.length() > stringComp2.length()) System.out.println(stringComp1 + " is bigger then " + stringComp2);
        else System.out.println(stringComp1 + " is smaller then " + stringComp2);

        char firstChar = 'A';
        char secondChar = 'Z';
        int charCompare = Character.compare(firstChar, secondChar);
        System.out.println(charCompare);

        if (charCompare < 0) System.out.println(firstChar + " is less then " + secondChar);
        else System.out.println(firstChar + " is bigger then " + secondChar);

        //9. Perform the same using ternary operator;
        String resultInt = (comp1 > comp2) ? comp1 + " is bigger then " + comp2 : stringComp1 + " is not same as " + stringComp2;
        System.out.println(resultInt);

        String resultString = (stringComp1.length() > stringComp2.length()) ? stringComp1 + " is bigger then " + stringComp2
                : stringComp1 + " is smaller then " + stringComp2;
        System.out.println(resultString);

        String resultChar = (charCompare < 0) ? firstChar + " is less then " + secondChar : firstChar + " is bigger then " + secondChar;
        System.out.println(resultChar);
        System.out.println("************************************");

        //10. Define the season by month name/index using switch operator
        System.out.println("Input month name starting with capital letter to find out what season is now");
        String monthName = in.nextLine();
        switch (monthName) {
            case "December":
            case "January":
            case "February":
                System.out.println("It's winter now");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("It's spring now");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("It's summer now");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("It's fall now");
                break;
            default:
                System.out.println("Wrong month spelling");
                break;
            }

        System.out.println("************************************");

        //11. Print integers from 0 to 100 using all types of loops
        for (int i = 0; i<=100; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j <= 100) {
            System.out.println(j++);
        }

        //12. Calculate the sum of all odd integers from 100 to 500 using loops
        int sumOdd = 0;
        for (int i = 101; i<=500; i = i + 2) {
            sumOdd+=i;
        }
        System.out.println(sumOdd);

        int k = 100;
        int sumOdd2 = 0;
        while (k <= 500) {
            sumOdd2+=k;
            k = k+2;
        }
        System.out.println(sumOdd2);

        //13. Create a one-dimensional array of strings
        String[] myArray = new String [] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

        //bubble sort
        String temp;
        for (int i = 0; i < myArray.length; i++) {
            for (j = i + 1; j < myArray.length; j++) {
                if (myArray[i].compareTo(myArray[j]) > 0) {
                    temp = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
        //Concatenate all the strings to a single string (use space symbol as a delimiter)
        String tempString = myArray[0];
        String joined = new String();
        for (int i = 1; i < myArray.length; i++){
            joined = String.join(" ",tempString, myArray[i]);
            tempString = joined;
        }
        System.out.println(joined);

        //14. Create multidimensional array of doubles
        double [][] myDoubleArray = new double[5][2];

        for (int i = 0; i < myDoubleArray.length; i++) {
            for (int l = 0; l < myDoubleArray[i].length; l++) {
                myDoubleArray[i][l] = Math.round(Math.random()*100);
            }
        }
        System.out.println(Arrays.deepToString(myDoubleArray));

        double array2dSum = 0.0;
        for (int i = 0; i < myDoubleArray.length; i++) {
            for (int l = 0; l < myDoubleArray[i].length; l++) {
                array2dSum += myDoubleArray[i][l];
            }
        }
        System.out.println(array2dSum);

        double[][] myRagged2dArray = new double[3][];
        myRagged2dArray[0] = new double[2];
        myRagged2dArray[1] = new double[5];
        myRagged2dArray[2] = new double[7];

        for (int i = 0; i < myRagged2dArray.length; i++) {
            for (int l = 0; l < myRagged2dArray[i].length; l++) {
                myRagged2dArray[i][l] = Math.round(Math.random()*100);
            }
        }
        System.out.println(Arrays.deepToString(myRagged2dArray));

        boolean isRagged = false;
        for (int i = 0; i < myRagged2dArray.length; i++) {
            if (myRagged2dArray[i].length != myRagged2dArray[0].length) {
                isRagged = true;
            }
        }
        System.out.println("Array is ragged: " + Boolean.toString(isRagged));

    }
}
