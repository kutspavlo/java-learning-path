package Java_Advanced_Practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String separator = "****************";
      //1. Create instances of ArrayList using all types of its constructors and then:
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<String> myExtendedArrayList = new ArrayList<>(stringList);
        ArrayList<String> stringArrayListWithSize = new ArrayList<>(1000);

        //  Add a new element to some of them;
        stringList.add("one");
        stringList.add("two");
        stringList.add("four");

        //Add a new element to certain position;
        System.out.println(separator);
        stringList.add(2, "three");
        System.out.println(stringList.get(2));

        //Add all elements of some collection;
        System.out.println(separator);
        myExtendedArrayList.addAll(stringList);
        myExtendedArrayList.addAll(1,stringList);
        System.out.println(myExtendedArrayList);

        //Clone a list;
        System.out.println(separator);
        ArrayList<String> clonedList = (ArrayList<String>) stringList.clone();
        System.out.println(clonedList);

        //Check if a list contains certain element/collection;
        System.out.println(separator);
        System.out.println(stringList.contains("one"));
        System.out.println(stringList.contains("zero"));

        //Retrieve an element by its index;
        System.out.println(separator);
        System.out.println(stringList.get(0));

        //Find out first and last indexes of some object;
        System.out.println(separator);
        System.out.println("First index: " + myExtendedArrayList.indexOf("two"));
        System.out.println("Last index: " + myExtendedArrayList.lastIndexOf("two"));

        //Check if a list is empty;
        System.out.println(separator);
        System.out.println(myExtendedArrayList.isEmpty());
        System.out.println(stringArrayListWithSize.isEmpty());

        //Remove element/collection;
        System.out.println(separator);
        stringArrayListWithSize = (ArrayList<String>) stringList.clone();
        System.out.println(stringArrayListWithSize);
        stringArrayListWithSize.remove("one");
        System.out.println(stringArrayListWithSize);
        stringArrayListWithSize.clear();
        System.out.println(stringArrayListWithSize.isEmpty());

        //Get the intersection of two lists;
        System.out.println(separator);
        stringList.remove(3);
        System.out.println(stringList);
        stringArrayListWithSize = (ArrayList <String>) stringList.clone();
        stringArrayListWithSize.add("four");
        System.out.println(stringArrayListWithSize);
        stringArrayListWithSize.retainAll(stringList);
        System.out.println(stringArrayListWithSize);

        //Override some element by its index (set a new value);
        System.out.println(separator);
        System.out.println(stringList);
        stringList.set(1, "2");
        System.out.println(stringList);

        //Get a sub list;
        System.out.println(separator);
        System.out.println(stringList.subList(0,2));

        //Convert a list to an array;
        System.out.println(separator);
        String[] strArr = new String[stringList.size()];
        stringList.toArray(strArr);
        System.out.println(strArr[0] + " " + strArr[1] + " " + strArr[2]);

        //Get the size of a list;
        System.out.println(separator);
        System.out.println(stringList.size());

        //Clear a list;
        System.out.println(separator);
        System.out.println(stringList);
        stringList.clear();
        System.out.println(stringList.size());

        //2. Create an ArrayList and a LinkedList. Both must be huge. You can fill them using
        //generating random numbers for example. Compare performance between them
        //executing following operations: get an element by index, insert/remove a new
        // element in the middle, check if the list contain some element, calculate the sum of
        //all the elements
        System.out.println(separator);
        ArrayList<Integer> intArrList = new ArrayList<>();
        int randomValue;
        for (int i = 0; i < 10000000; i++) {
            randomValue = (int) (1000 * Math.random());
           intArrList.add(i, randomValue);
        }

        LinkedList<Integer> intLinkedList = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            randomValue = (int) (1000 * Math.random());
            intLinkedList.add(i, randomValue);
        }

        long startTime = System.currentTimeMillis();
        int result = intArrList.get(732451);
        long endTime = System.currentTimeMillis();
        System.out.println("Array list get by index time spent: "  + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        result = intLinkedList.get(732451);
        endTime = System.currentTimeMillis();
        System.out.println("Linked list get by index time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intArrList.add(500000, 4234);
        endTime = System.currentTimeMillis();
        System.out.println("Array list insert in the middle  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intLinkedList.add(500000, 4234);
        endTime = System.currentTimeMillis();
        System.out.println("Linked list insert in the middle  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intArrList.remove(500005);
        endTime = System.currentTimeMillis();
        System.out.println("Array list remove from the middle  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intLinkedList.remove(500005);
        endTime = System.currentTimeMillis();
        System.out.println("Linked list remove from the middle  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intArrList.contains(432452333);
        endTime = System.currentTimeMillis();
        System.out.println("Array list check if element is present  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intLinkedList.contains(432452333);
        endTime = System.currentTimeMillis();
        System.out.println("Linked list check if element is present  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        int sumResult = 0;
        for (int i: intArrList) {
            sumResult += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Array list sum of all elems is " + sumResult + " time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        sumResult = 0;
        for (int i: intLinkedList) {
            sumResult += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Linked list sum of all elems is " + sumResult + " time spent: " +  (endTime - startTime) + " ms");
    }
}
