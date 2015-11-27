package com.my;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

			
		
		User user = (User)context.getBean("user");   // Factory design pattern
		System.out.println(user.getUserValues());
		
		System.out.println(user.getUserPersonalInfo());					
		
		//user.callPersonalDetail();
		//User   user   =   new User();
		
		/*System.out.println("Name :"+user.getName());
		System.out.println("Age :"+user.getAge());
		//System.out.println("Address Values "+user.getUserValues());
*/		
	
		
	}

}
;