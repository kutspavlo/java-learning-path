package Java_Advanced_Practice1;

import java.util.*;

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

        //3. Create instances of HashSet using all types of its constructors and then perform
        //operations from task #1 (where it’s possible to execute)
        HashSet<String> strHashSet = new HashSet<>();
        HashSet<String> strHashSetWitInitialCapacity = new HashSet<>(100);
        HashSet<String> strHashSetWithLoadFactor = new HashSet<String>(1000, 0.50f);
        HashSet<String> strHashSetFromOtherSet = new HashSet<>(strHashSet);

        //Add a new element to some of them;
        strHashSet.add("one");
        strHashSet.add("two");

        //Add all elements of some collection;
        System.out.println(separator);
        strHashSetWitInitialCapacity.addAll(strHashSet);
        System.out.println(strHashSetWitInitialCapacity.contains("one"));

        //Clone
        System.out.println(separator);
        HashSet<String> clonedHashSet = (HashSet<String>) strHashSet.clone();
        System.out.println(clonedHashSet);

        //Check if a hashset contains certain element/collection;
        System.out.println(separator);
        System.out.println(clonedHashSet.contains("two"));

        //Check if a set is empty;
        System.out.println(separator);
        System.out.println(clonedHashSet.isEmpty());

        //Remove element/collection;
        System.out.println(separator);
        clonedHashSet.remove("two");
        clonedHashSet.clear();

        //Get the intersection of two sets;
        System.out.println(separator);
        strHashSet.clear();
        clonedHashSet.clear();
        strHashSet.add("one");
        strHashSet.add("two");
        strHashSet.add("three");
        clonedHashSet.add("two");
        clonedHashSet.add("three");
        clonedHashSet.add("five");
        strHashSet.retainAll(clonedHashSet);
        System.out.println(strHashSet);

        //Convert a set to an array;
        System.out.println(separator);
        System.out.println(strHashSet.toArray()[0] + " " + strHashSet.toArray()[1]);

        //Get the size of a list;
        System.out.println(separator);
        System.out.println(strHashSet.size());

        //Clear a list;
        strHashSet.clear();
        clonedHashSet.clear();
        strHashSetFromOtherSet.clear();

        //4. Create a HashSet and a TreeSet. Perform the same comparison as was described
        //in task #2 except getting an element by index
        System.out.println(separator);
        HashSet<Integer> intHashSet = new HashSet<>();
        TreeSet<Integer> intTreeSet = new TreeSet<>();

        for (int i = 0; i < 10000000; i++) {
            intHashSet.add(i);
        }

        for (int i = 0; i < 10000000; i++) {
            intTreeSet.add(i);
        }

        startTime = System.currentTimeMillis();
        intHashSet.remove(500000);
        endTime = System.currentTimeMillis();
        System.out.println("Hash set remove from the middle  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intTreeSet.remove(500000);
        endTime = System.currentTimeMillis();
        System.out.println("Trees set remove from the middle  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intHashSet.add(500000);
        endTime = System.currentTimeMillis();
        System.out.println("Hash set add to the middle  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intTreeSet.add(500000);
        endTime = System.currentTimeMillis();
        System.out.println("Trees set add to the middle  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intHashSet.contains(500000);
        endTime = System.currentTimeMillis();
        System.out.println("Hash set contains element  time spent: " +  (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        intTreeSet.contains(500000);
        endTime = System.currentTimeMillis();
        System.out.println("Trees set contains element  time spent: " +  (endTime - startTime) + " ms");

        //5. Create a HashMap and then:
        //Add a new pair key-value to it;
        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(1, "one");

        //Add all pairs of another map;
        System.out.println(separator);
        HashMap<Integer, String> anotherHashMap = new HashMap<>();
        anotherHashMap.put(2, "two");
        anotherHashMap.put(3, "three");
        myHashMap.putAll(anotherHashMap);
        System.out.println(myHashMap);

        //Check if the map contains certain key/value;
        System.out.println(separator);
        System.out.println(myHashMap.containsKey(2));
        System.out.println(myHashMap.containsValue("three"));

        //Display all the pairs contained in the map;
        System.out.println(separator);
        System.out.println(myHashMap);

        //Remove a pair;
        System.out.println(separator);
        myHashMap.remove(3);
        System.out.println(myHashMap);

        //Get the size of the map;
        System.out.println(separator);
        System.out.println(myHashMap.size());

        //Clear the map
        System.out.println(separator);
        myHashMap.clear();
        System.out.println(myHashMap.isEmpty());


        //6. Implement Iterable interface in your own class and try to use it as the data source
        //inside a foreach loop definition
        System.out.println(separator);
        ArrayList<String> itStr = new ArrayList<>();
        itStr.add("one");
        itStr.add("two");
        itStr.add("three");
        itStr.add("four");
        itStr.add("five");

        OwnIterableList ownItList = new OwnIterableList(itStr);
        for (Iterator<String> i = ownItList.iterator(); i.hasNext() ;) {
            System.out.println(i.next());
        }

        //7. Use the Collections class for executing following operations:
        //Add new elements to a collection;
        System.out.println(separator);
        ArrayList<Integer> collArrInt = new ArrayList<>();
        Collections.addAll(collArrInt, 17, 26, 11, 78, 63, 111, 9);
        System.out.println(collArrInt.get(0));

        //Sort a list and then carry out binary search;
        System.out.println(separator);
        System.out.println(collArrInt);
        Collections.sort(collArrInt);
        System.out.println(collArrInt);

        System.out.println(Collections.binarySearch(collArrInt, 78));

        //Copy a collection;
        System.out.println(separator);
        ArrayList<Integer> forCopy = new ArrayList<>();
        Collections.addAll(forCopy, 1, 2, 3, 4, 5, 6, 7);
        Collections.copy(forCopy, collArrInt);
        System.out.println(forCopy);

        //Check if two collections have at least one common element;
        System.out.println(separator);
        System.out.println(Collections.disjoint(collArrInt, forCopy));

        //Fill a collection by a single element;
        System.out.println(separator);
        Collections.fill(forCopy, 7);
        System.out.println(forCopy);

        //Find out the number of elements in a collection equal to some object;
        System.out.println(separator);
        Collections.addAll(collArrInt, 111,111,111);
        System.out.println(collArrInt);
        System.out.println(Collections.frequency(collArrInt, 111));

        //Find the max/min element in a collection;
        System.out.println(separator);
        System.out.println(Collections.max(collArrInt));
        System.out.println(Collections.min(collArrInt));

        //Replace all occurrences of one specified value in a list with another;
        System.out.println(separator);
        System.out.println(collArrInt);
        Collections.replaceAll(collArrInt, 111, 222);
        System.out.println(collArrInt);

        //Reverse a list;
        System.out.println(separator);
        System.out.println(collArrInt);
        Collections.reverse(collArrInt);
        System.out.println(collArrInt);

        //Randomly mix a list elements;
        System.out.println(separator);
        System.out.println(collArrInt);
        Collections.shuffle(collArrInt);
        System.out.println(collArrInt);

        //Create a collection with a single element;
        System.out.println(separator);
        Set<String> singletonSet = Collections.singleton("first");
        System.out.println(singletonSet);

        //Swap two elements in a list;
        System.out.println(separator);
        System.out.println(collArrInt);
        Collections.swap(collArrInt, 2, 3);
        System.out.println(collArrInt);

        //Create an immutable collection and try to modify it
        List<Integer> intArrListN = new ArrayList<>();
        intArrListN.add(2);
        intArrListN.add(5);
        List<Integer> immutablelist = Collections.unmodifiableList(intArrListN);
        immutablelist.add(5); //exception thrown
    }
}
