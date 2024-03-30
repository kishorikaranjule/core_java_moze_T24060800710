package session_11;

public class Test1 {

	public static void main(String[] args) {
		 
		E e = new E();
		double d = e.div(5, 2);
		if(d<1)
		{
			try {
				throw new MyException();
			}catch (MyException e1) {
				System.out.println(e1);
			}
		}
		else
		{
			System.out.println("d = "+d);
		}

	}

}
