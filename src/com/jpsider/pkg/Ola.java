package com.jpsider.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ola {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		User u1=(User)context.getBean("rcb");
		System.out.println(u1);
	}

}
