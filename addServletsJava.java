package aris;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServletsJava extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String no1=req.getParameter("num1");
		String no2=req.getParameter("num2");
		
		System.out.println(no1);
		System.out.println(no2);
		
		int c = Integer.parseInt(no1)+ Integer.parseInt(no2);
		
		PrintWriter out = resp.getWriter();
		out.println("Sum is from POST "+c);
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			
			String no1=req.getParameter("num1");
			String no2=req.getParameter("num2");
			
			System.out.println(no1);
			System.out.println(no2);
			
			int c = Integer.parseInt(no1)+ Integer.parseInt(no2);
			
			PrintWriter out = resp.getWriter();
			out.println("Sum is "+c);
					
		//super.doGet(req, resp);
	}
	

}
