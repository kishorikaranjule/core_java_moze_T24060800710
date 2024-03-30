package session_11;

public class CalNumber {
	
	int fact=1;
	
	public int factorial(int no)
	{
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
