package session_11;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		 FileOutputStream fos=null;
		 try {
			 fos = new FileOutputStream("d://mno.txt",true);
			 //fos.write(65);
			 String str="Welcome to Moze";
			 byte[] b= str.getBytes();
			 fos.write(b);
			 System.out.println("Success");
		 }catch(Exception e) {
			 
		 }
		 finally
		 {
			 fos.close();
		 }

	}

}
