package session_09;

public class A extends Object{
	private int a;
	public String name="kishori";
	
	public A() {
		System.out.println("Default constructor of A");
	}
	
	public A(String s) {
		System.out.println("Parameterized constructor of A");
	}
	
	public void get()
	{
		System.out.println("In get() of A");
	}
	
	@Override
	public String toString()
	{
		return "";
	}

	public static void main(String args) {
		 
	}

	 

}
