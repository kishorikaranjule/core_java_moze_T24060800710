package session_11;

public class B {
	
	public static void getMsg()
	{
		msg();
	}
	
	public static void msg()
	{
		int c = 10/0;
		System.out.println("c = "+c);
	}

	public static void main(String[] args) {
		B.getMsg();// calling by class name because it is static method

	}

}
