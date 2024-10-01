package mywebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/url3")
public class MyThirdWeb extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
      PrintWriter pw=res.getWriter();
      pw.print("bye.....");
      
      RequestDispatcher rd=req.getRequestDispatcher("url1");
      rd.include(req, res);
     
	}

}
