package cod;
import java.sql.*;


public class MyJDBC {
	
	

	

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	String connectionString="jdbc:mysql://localhost:3306/demo?characterEncoding";
	String userName="root";
	String password="root";
	Connection con=DriverManager.getConnection(connectionString,userName,password);
	if(con!=null)
	{
	System.out.println("connected");
	}
	else
	{
	System.out.println("Not connected");
	}

	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	}

	}

