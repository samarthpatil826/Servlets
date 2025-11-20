package com.jsp.sessioncookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cookie1")
public class Cookie1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie c1 = new Cookie("username", "postgres");
		Cookie c2 = new Cookie("password", "root");
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		resp.sendRedirect("cookie2");
	}
}
