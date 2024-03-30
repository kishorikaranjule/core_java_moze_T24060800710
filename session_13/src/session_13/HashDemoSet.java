package session_13;

import java.util.HashSet;

public class HashDemoSet {

	public static void main(String[] args) {
		 
		HashSet h = new HashSet();//non generic
		h.add(10);
		h.add(20);
		h.add(null);
		System.out.println(h.add(10));//will return false because duplicate values not allowed
		h.add('K');
		System.out.println(h);
		

	}

}
