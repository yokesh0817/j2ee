package mywebapp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/formdata")
public class FormInput extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String stringcontact=req.getParameter("contact");
		long contact=Long.parseLong(stringcontact);
		res.getWriter().println("name :"+name);
		res.getWriter().println("Contact: "+contact);
		
	}

}
