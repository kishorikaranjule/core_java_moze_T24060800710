package session_13;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws SQLException {
		 Connection con = null;
		 PreparedStatement pstmt = null;
		 Scanner sc = new Scanner(System.in);
		try
		{
			//1.Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			//Establish the connection
			con = DriverManager.getConnection
				   ("jdbc:mysql://localhost:3306/moze","root", "root");
			System.out.println("Connection Established");
			//Prepare statement
			pstmt = con.prepareStatement("insert into employeee(name,salary) values(?,?)");
			System.out.println("Enter employee name = ");
			String name = sc.next();
			System.out.println("Enter employee salary = ");
			double sal = sc.nextDouble();
			pstmt.setString(1, name);
			pstmt.setDouble(2, sal);
			
			int i = pstmt.executeUpdate();
			if(i>0)
			{
				System.out.println("Successfully Inserted");
			}
			else
			{
				System.out.println("FAILED!!!");
			}
			
			//Get the result set means table from database
			ResultSet rs = pstmt.executeQuery("select * from employeee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ " " + " " +rs.getString(2)+ " " + rs.getDouble(3));
			}
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			con.close();//connection closed
		}

	}

}
