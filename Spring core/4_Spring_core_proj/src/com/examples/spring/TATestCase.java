package com.examples.spring;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class TATestCase {
	public static void main(String[] args) {
		
//		final BeanFactory beans=new XmlBeanFactory(new FileSystemResource("mybeans.xml"));


	/*	ApplicationContext beans=
			new ClassPathXmlApplicationContext(
					new String[]{ "mybeans-daos.xml", 
							"mybeans-services.xml"});*/
		
		ApplicationContext beans = new ClassPathXmlApplicationContext("mybeans-services.xml");

		TransferAmountService ta= 	(TransferAmountService)	beans.getBean("taService");
		
		boolean flag=ta.transferAmount(101, 102, 1000);
		
		System.out.println(flag);
	}
}
