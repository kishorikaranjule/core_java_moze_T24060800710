package session_08;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter array size: ");
		 int size=sc.nextInt();
		 int arr[] = new int[size];
		 int sum = 0;
		 
		 System.out.println("Enter " +size+ " elements: ");
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
			 sum += arr[i];
		 }
		 
		 System.out.println("Array elements are as follows: ");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 
		// Addition of array elements
//	        int sum = 0;
//	        for (int i = 0; i < arr.length; i++) {
//	            sum += arr[i];
//	        }
	        System.out.println("Sum of array elements: " + sum);

	}

}
