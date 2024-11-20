package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " project execution started  ...!!!!!" );
        ApplicationContext c=new ClassPathXmlApplicationContext("com/bridgelabz/config.xml");
        Test a=c.getBean("test1",Test.class);
        a.add();
        System.out.println(a);
        System.out.println( " project execution completed  ...!!!!!" );
    }
}
