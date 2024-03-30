package session_11;

public class C {

	public static void main(String[] args) {
		 int a,b,c=0;
		 try
		 {
			 a = Integer.parseInt(args[0]);
			 b = Integer.parseInt(args[1]);
			 c=a/b;
			 System.out.println("Division = "+c);
			 
		 }catch(Exception e)
		 {
			// System.out.println(e);
			// System.out.println(e.getMessage());
			 e.printStackTrace();
		 }

	}

}
