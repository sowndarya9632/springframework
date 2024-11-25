package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("project started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/reference/config.xml");
		B b = context.getBean("refB", B.class);
		System.out.println(b);
		A a = context.getBean("refA", A.class);
		System.out.println(a);

		// System.out.println(a.getVehicle());
		// System.out.println(a.getVehicle() .getClass().getName());
		/*
		 * System.out.println("_______________"); System.out.println(a.getEmail());
		 * System.out.println(a.getEmail() .getClass().getName());
		 * System.out.println("_______________"); System.out.println(a.getName());
		 * System.out.println(a.getName() .getClass().getName());
		 * System.out.println("_______________"); System.out.println(a.getDbprop());
		 * System.out.println(a.getDbprop() .getClass().getName());
		 */
		System.out.println("project completed");

	}

}
