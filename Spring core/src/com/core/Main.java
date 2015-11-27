package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//load the xml file into container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//User   userObj  =  new User();  Manual Object creating
		
		User user = (User)context.getBean("user");  // object creating by container
		System.out.println(user);
	}

}
