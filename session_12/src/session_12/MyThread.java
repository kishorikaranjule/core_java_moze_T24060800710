package session_12;

public class MyThread extends Thread{
	
	public void run()
	{
		//resource
		System.out.println("Name = "+Thread.currentThread().getName());
		System.out.println("ID = "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
		System.out.println("Priority = "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		 
		MyThread t1 = new MyThread();//creation of thread
		MyThread t2 = new MyThread();//creation of thread
		t1.setName("ONE");
		t2.setName("TWO");
		t1.start();//thread one started 
		t2.start();//thread two started

	}

}
