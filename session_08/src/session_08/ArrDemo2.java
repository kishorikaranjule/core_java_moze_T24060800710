package session_08;

public class ArrDemo2 {

	public static void main(String[] args) {
	   int [][] arr = new int[2][2];
	   arr[0][0]=10;
	   arr[0][1]=20;
	   arr[1][0]=30;
	   
	   for(int i=0;i<arr.length;i++) {
		   for(int j=0;j<arr[i].length;j++)
		   {
			   System.out.print(arr[i][j]+"\t");
		   }
		   System.out.println();
	   }
	   
	   //nested for each loop by passing array or either we can pass collection
	   
//	   for(int i[]:arr)
//	   {
//		   for(int j:i)
//		   {
//			   System.out.print(j+"\t");
//		   }
//		   System.out.print();
//	   }

	}

}
