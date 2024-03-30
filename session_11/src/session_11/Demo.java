package session_11;

public final class Demo {
	
	final float PI;
	
	public Demo()
	{
		PI = 3.14f;
	}
	
	public final void get()
	{
		System.out.println(PI);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.get();
		 

	}

}
