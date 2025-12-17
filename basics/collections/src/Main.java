package main;

import collections.ListCollection;
import collections.SetCollection;

public class Main {
    public static void main(String[] args) {
        // List
        ListCollection lc = new ListCollection();

        // List
        lc.slice.addToList("Hello");
        lc.slice.addToList("World");
        lc.slice.printList(); //  [Hello, World]
        lc.slice.updateList(1, "Amigos");
        System.out.printf("Element at index 0: %s\n", lc.slice.getElement(0)); //  Element at index 0: Hello
        lc.slice.removeElementFromList("Hello");
        lc.slice.printList(); // [Amigos]

        System.out.println("------------------------------------------------------------------------------------------");

        // Set
        SetCollection sc = new SetCollection();

        // hash set
        sc.hs.addElement(10);
        sc.hs.addElement(59);
        sc.hs.printSet(); // [10, 59]
        System.out.println(sc.hs.containsElement(23)); // false
        System.out.println(sc.hs.containsElement(59)); // true
        sc.hs.removeElement(10);
        sc.hs.printSet();   // [59]
    }
}