package collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public ArrListCollection<String> slice;

    public ListCollection() {
        this.slice = new ArrListCollection<String>();
    }

    public class ArrListCollection<T> {
        private List<T> al;

        ArrListCollection() {
            // ArrayList is preferred over Vector in general when in-built thread synchronization is not required. Vector methods are thread safe(and slow)
            this.al = new ArrayList<T>();
        }

        // below methods are just wrappers

        public void addToList(T elem) {
            this.al.add(elem);
        }

        public void removeElementFromList(T elem) {
            this.al.remove(elem);
        }

        public void removeElementFromList(int elemIndex) {
            this.al.remove(elemIndex);
        }

        public void updateList(int index, T updatedVal) {
            this.al.set(index, updatedVal);
        }

        public T getElement(int index) {
            return this.al.get(index);
        }

        public void printList() {
            System.out.println(this.al);
        }
    }
}