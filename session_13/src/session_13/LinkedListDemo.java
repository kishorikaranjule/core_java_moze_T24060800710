package session_13;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		 LinkedList<String> l = new LinkedList<String>();
		 l.add("kishori");
		 l.add("Jayshree");
		 l.add("Nikita");
		 l.add("Rutuja");
		 l.add("Monika");
		 l.add(null);
		 //l.add(10);//CTE
		 System.out.println(l);
		 l.set(5, "Raj");
		 System.out.println(l);
		 l.removeLast();
		 System.out.println(l);
		 l.addFirst("Raj");

	}

}
