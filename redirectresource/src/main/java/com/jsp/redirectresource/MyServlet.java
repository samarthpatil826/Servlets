package com.jsp.redirectresource;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/new")
public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//        RequestDispatcher rd = req.getRequestDispatcher("Demo.html");
//		
//		PrintWriter wr = resp.getWriter();
//		wr.write("<head>");
//		wr.write("<body>");
//		wr.write("<h1>Request Reached to Class MyServlet</h1>");
//		wr.write("</head>");
//		wr.write("</body>");
//		
//		rd.include(req, resp);
		
		String name = req.getParameter("name");
		
		resp.sendRedirect("https://www.google.com/search?q="+name);
	}
	
}
