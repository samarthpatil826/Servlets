package com.jsp.springcore2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac= new AnnotationConfigApplicationContext(MyConfig.class);
		
	}
	
}
