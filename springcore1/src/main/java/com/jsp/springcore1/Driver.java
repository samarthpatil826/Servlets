package com.jsp.springcore1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource rs = new ClassPathResource("spring_cnf.xml");
		BeanFactory bf= new XmlBeanFactory(rs);
		Demo bean = bf.getBean(Demo.class);
		System.out.println(bean);

	}

}
