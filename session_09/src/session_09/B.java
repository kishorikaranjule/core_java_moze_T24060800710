package session_09;

public class B extends A{
	
	public B()
	{
		System.out.println("default constructor of B");
	}
	
	public B(int a)
	{
		//super()
		super("abc");//if we want to call the parents class parameterized constructor then we have to explicitly do it by passing the values
		System.out.println("Parameterized constructor of B");
	}
	
	@Override
	public void get()
	{
		System.out.println("In get() of B");
	}
	
	public static void main(String args) {
		B b = new B(10);
		b.get();
		//System.out.println(b.a);
	}

	 
}
