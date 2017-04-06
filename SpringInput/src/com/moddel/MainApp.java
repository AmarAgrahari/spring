package com.moddel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext res=new ClassPathXmlApplicationContext("spring.xml");
Employee emp=(Employee) res.getBean("emp");
emp.show();
	}

}
