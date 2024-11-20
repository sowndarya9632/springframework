package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowire.Certificate;
import com.autowire.Student;

public class App {

	public static void main(String[] args) {
		System.out.println("project start");
	     ApplicationContext context=new ClassPathXmlApplicationContext("com/autowire/autowire.xml");
	     /*Certificate c=context.getBean("certi",Certificate.class);
	     System.out.println(c);*/
	    Student  s=context.getBean("stu",Student.class);
	     System.out.println(s);
	     System.out.println("project completed");
	}

}