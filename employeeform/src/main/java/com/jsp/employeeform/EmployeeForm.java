package com.jsp.employeeform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeForm extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String loc = req.getParameter("location");
		String num = req.getParameter("number");
		String age = req.getParameter("age");
		String gen = req.getParameter("gender");
		String role = req.getParameter("role");
		String yoe = req.getParameter("yoe");
		
		PrintWriter pw = res.getWriter();
		pw.write("<head>");
		pw.write("<body>");
		pw.write("<h1>"+fname+"</h1>");
		pw.write("<h1>"+lname+"</h1>");
		pw.write("<h1>"+loc+"</h1>");
		pw.write("<h1>"+num+"</h1>");
		pw.write("<h1>"+age+"</h1>");
		pw.write("<h1>"+gen+"</h1>");
		pw.write("<h1>"+role+"</h1>");
		pw.write("<h1>"+yoe+"</h1>");
		pw.write("</head>");
		pw.write("</body>");
		
	}

}
