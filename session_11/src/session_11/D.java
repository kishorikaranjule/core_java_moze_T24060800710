package session_11;

public class D {

	public static void main(String[] args) {
		 int a,b,c=0;
		 try
		 {
			 a = Integer.parseInt(args[0]);
			 b = Integer.parseInt(args[1]);
			 c=a/b;
			 System.out.println("Division ="+c);
			 
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("Denominator should no be zero");
		 }
		 catch(NumberFormatException e) {
			 System.out.println("Please enter only integer data");
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Please enter atleast two values");
		 }
		 catch(Exception e) {
			 System.out.println("Exception Occurred!!!");
		 }
		 finally
		 {
			 System.out.println("Finally Block invoked");
		 }

	}

}
