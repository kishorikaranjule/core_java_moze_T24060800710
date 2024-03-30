package session_13;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteration {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();

        l.add("Kiya");
        l.add("BMW");
        l.add("Audi");
        l.add("HeroHonda");

        System.out.println("Original LinkedList: " + l);

        // ListIterator applying on the LinkedList
        ListIterator<String> itr = l.listIterator();
        while (itr.hasNext()) {
            String s = itr.next(); // Fetch the next element
            if (s.equals("HeroHonda")) {
                itr.remove(); // Remove the current element
                //itr.set("abc");
                //itr.add("xyz");
            }
        }

        System.out.println("Modified LinkedList: " + l);
    }
}
