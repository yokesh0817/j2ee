package mywebapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

public class Home extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		String email=(String) session.getAttribute("email");
		
		if(email!=null)
		{
			req.getRequestDispatcher("home.html").forward(req, resp);
		}
		else {
			req.getRequestDispatcher("login.html").forward(req, resp);
		}
	}

}
