package com.jsp.servlettest;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet(urlPatterns = "/do")
public class MyServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = req.getParameter("name");
		
	}

//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		HttpServletRequest hrp= (HttpServletRequest)req;
//		
//		String mt = hrp.getMethod();
//		Y
//		if (mt.equals("POST"))
//			System.out.println(mt+" type of request");
//			
//		else if (mt.equals("GET"))
//			System.out.println(mt+" type of request");
//		
//	}
	
	
	

}
