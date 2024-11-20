package com.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/constructorinjection/config.xml");
		/*Employee b = context.getBean("emp", Employee.class);
		System.out.println(b);*/
		Dept d= context.getBean("refDept", Dept.class);
		Employee e=context.getBean("refemp",Employee.class);
		System.out.println(e);
		
		System.out.println("project completed");

	}

}
