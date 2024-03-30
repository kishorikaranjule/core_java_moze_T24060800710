package session_13;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		 Vector<Integer> v = new Vector<Integer>();
		 System.out.println(v.capacity());//10
		 for(int i=1;i<=10;i++)
		 {
			 v.addElement(i);
		 }
		 System.out.println(v);
		 v.add(11);
		 System.out.println(v);
		 System.out.println(v.capacity());
		 Enumeration<Integer> e = v.elements();
		 while(e.hasMoreElements())
		 {
			 int i = e.nextElement();
			 if((i%2 == 0)) {
				 System.out.println(i);
			 }
		 }
		 System.out.println(v);

	}

}
