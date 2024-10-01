package mywebapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s1")
public class S1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String mail=req.getParameter("email");
		String pass=req.getParameter("password");
		
		req.setAttribute("email", mail);
		req.setAttribute("password", pass);
		
		req.getRequestDispatcher("s2").forward(req, res);
		
	}

}
