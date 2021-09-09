package Java_Advanced_Practice1;

import java.util.ArrayList;
import java.util.Iterator;

public class OwnIterableList implements Iterable<String> {

    ArrayList<String> arrayList;
    int count = 0;


    public OwnIterableList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }


    @Override
    public Iterator<String> iterator() {
        return new CustomIterator();
    }

     class CustomIterator implements  Iterator<String> {

        @Override
        public boolean hasNext() {
            if (arrayList.size() > count) return true;
            return false;
        }

        @Override
        public String next() {
            return "this is iteration number " + (count + 1) + " list value = " + arrayList.get(count++);
        }
    }
}
