package com.jsp.requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/a")
public class A extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher rd = req.getRequestDispatcher("b");
		
		PrintWriter wr = resp.getWriter();
		wr.write("<head>");
		wr.write("<body>");
		wr.write("<h1>Request Reached to Class A</h1>");
		wr.write("</head>");
		wr.write("</body>");
		
//		rd.forward(req, resp);  //ignore the current page content and forward the request to next resource
		
		rd.include(req, resp);   //		it include current page and next page and give response
	}

}
