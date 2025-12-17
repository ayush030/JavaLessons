package collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public HashSetCollection<Integer> hs;

    public SetCollection() {
        this.hs = new HashSetCollection<Integer>();
    }

    public class HashSetCollection<T> {
        private HashSet<T> hs;

        HashSetCollection() {
            this.hs = new HashSet<T>();
        }

        // wrapper methods

        public void addElement(T t) {
            this.hs.add(t);
        }

        public void removeElement(T t) {
            this.hs.remove(t);
        }

        public boolean containsElement(T t) {
            return this.hs.contains(t);
        }

        public void printSet() {
            System.out.println(this.hs);
        }
    }
}