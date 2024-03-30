package session_13;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		 
//		ArrayList a = new ArrayList();
//		a.add(10);
//		a.add("A");
//		a.add('a');
//		a.add(10);
//		a.add(null);
//		System.out.println(a);
//		a.remove(2);
//		System.out.println(a);
//		a.add(3, "Java");
//		System.out.println(a);
		
		
		//Iteration cursor in collection
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for (int i=1;i<=10;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		Iterator<Integer> itr = a.iterator();
		while(itr.hasNext())//means if a has values in arraylist
		{
			int i = itr.next();//to retrive
			if((i%2) == 0)
				System.out.println(i);
			else
				itr.remove();
		}
		System.out.println(a);

	}

}
