package Java_Advanced_Practice1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      //1. Create instances of ArrayList using all types of its constructors and then:
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<String> myExtendedArrayList = new ArrayList<>(stringList);
        ArrayList<String> stringArrayListWithSize = new ArrayList<>(1000);

        //  Add a new element to some of them;
        stringList.add("one");
        stringList.add("two");
        stringList.add("four");

        //Add a new element to certain position;
        stringList.add(2, "three");
        System.out.println(stringList.get(2));

    }
}
