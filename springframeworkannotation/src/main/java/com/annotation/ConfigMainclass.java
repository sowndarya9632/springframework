package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMainclass {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Pizzaconfig2.class);
        Pizzza pizza = context.getBean("d", Pizzza.class);
        System.out.println(pizza);
        pizza.deliver();
        System.out.println("Project completed");
    }
}
