package com.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beanlifecycle/lifecycle.xml");
		Exam e = context.getBean("test1", Exam.class);
		System.out.println(e);
		System.out.println("project completed");
	}

}