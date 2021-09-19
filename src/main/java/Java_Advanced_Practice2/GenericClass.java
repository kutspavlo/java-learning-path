package Java_Advanced_Practice2;


import java.util.Collection;
import java.util.List;

public class GenericClass <T>{
    public <E> void test(Collection<E> collection) {
        for (E element: collection) {
            System.out.println(element);
        }
    }

    public void test(List<Integer> collection) {
       for (Integer element :collection ) {
           System.out.println(element);
       }
    }
}
