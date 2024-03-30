package session_11;

public class Test {

	public static void main(String[] args) {
		 //AithCal a = new ArithCal(); //we cannot be instantiated
		
		AllCalculations a = new AllCalculations();
		System.out.println("Factorial " +a.factorial(5));
		a.add(10, 20);
		a.sub(60, 30);
		a.avg(5, 4);
		a.min(67, 24);

	}

}
