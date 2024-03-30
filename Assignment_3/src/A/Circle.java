package A;

import java.util.Scanner;

public class Circle {
	
	private double radius;
	private double area;
	
	
	public void intit()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the radius of the circle: ");
		 radius = sc.nextDouble();
	}
	
	public void calc()
	{
		area=3.14*radius*radius;
	}
	
	public void display()
	{
		System.out.println("Area of circle : "+area);
	}
	

	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.intit();
		c.calc();
		c.display();

	}

}
