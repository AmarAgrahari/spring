package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args)
	{
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	    	AddNumber emp=(AddNumber)ctx.getBean("emp");
	    	int c=emp.getA()+emp.getB();
	    	System.out.println("c : "+c);
	    	//using method
	    	System.out.println(emp.add(emp.getA(), emp.getB()));
	}
}
