package Java_Advanced_Practice2;

import java.util.Collection;
import java.util.List;

public class UniversalList<E>{
    private List<E> list;

    public UniversalList(List<E> list){
        this.list = list;
    }

    public <G> void test(Collection<G> list) {
        for (Object t: list) {
            System.out.println(t.toString());
        }
    }
}
