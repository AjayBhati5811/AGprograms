package practice;
import java.sql.*; 

public class sql {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con;
		Statement s;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anoop","root","");
			s=con.createStatement();
			ResultSet r=s.executeQuery("Select * from author");
			while(r.next())
			{
			 System.out.println(r.getInt("authorid")+"\t"+r.getString("firstname")+"\t"+r.getString("middlename")+"\t"+r.getString("lastname")+"\t"+r.getInt("phone"));
			}
			
			 /*if(con!=null) 
		  {
			  		System.out.println("Connected");
		  }
// else
{
System.out.println("Not Connected");
}
				  
			  */
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
