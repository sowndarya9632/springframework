package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPComponent {

	public static void main(String[] args) {
		 System.out.println("project start");
	     ApplicationContext context=new ClassPathXmlApplicationContext("com/autowire/autocomponent.xml");
	     Ipl c=context.getBean("ipl",Ipl.class);
	     System.out.println(c);
	     Ipl c1=context.getBean("ipl",Ipl.class);
	     System.out.println(c1);
	     System.out.println("project completed");
	}

}
