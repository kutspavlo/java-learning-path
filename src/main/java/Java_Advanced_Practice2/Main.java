package Java_Advanced_Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Create instances of ArrayList<Integer> and then
        ArrayList<Integer> myIntArrLost = new ArrayList<>();
        myIntArrLost.add(5);
        System.out.println(myIntArrLost.get(0));
        //myIntArrLost.add("rer"); - exception thrown

        //2. Create a generic class and use it
        GenericClass <String> gc = new GenericClass<>();
        List<String> list = Arrays.asList("one", "two", "three");
        gc.test(list);
//        GenericClass gci = new GenericClass();
//        gci.test(list);


    }
}
