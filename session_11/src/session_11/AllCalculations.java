package session_11;

public class AllCalculations extends CalNumber
implements Staticcal, CompareCal{

	@Override
	public void min(int a, int b) {
		 int min = (a<b) ? a : b;
		 System.out.println("Min =" +min);
		
	}

	@Override
	public void add(int a, int b) {
		 System.out.println("Add ="+ (a + b));
		
	}

	@Override
	public void sub(int a, int b) {
		 System.out.println("Sub =" + (a - b));
		
	}

	@Override
	public void avg(int a, int b) {
		 int avg = (a + b) / 2;
		 System.out.println("Average =" + avg);
		
	}

}
