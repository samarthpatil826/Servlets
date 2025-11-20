package com.jsp.sessionhttpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/session1")
public class Session1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession ss = req.getSession();
		
		Animal a1 = new Animal("Dog", "Black");
		Animal a2 = new Animal("Cat", "White");
		
		ss.setAttribute("animal1", a1);
		ss.setAttribute("animal2", a2);
		
		Animal ani1 =(Animal) ss.getAttribute("animal1");
		Animal ani2 =(Animal) ss.getAttribute("animal2");
		
		System.out.println(ani1);
		System.out.println(ani2);
		
		System.out.println(ss.getId());
		
	}
}
