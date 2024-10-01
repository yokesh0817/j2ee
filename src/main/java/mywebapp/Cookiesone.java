package mywebapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookiesone")
public class Cookiesone extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("username");
		String pass=req.getParameter("userpassword");
		
		Cookie c1=new Cookie("k1", name);
		Cookie c2=new Cookie("k2", pass);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		req.getRequestDispatcher("cookiestwo").forward(req, resp);;
		
	}

}
