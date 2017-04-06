package com.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.scope.Emp;

public class MainApp {

	public static void main(String[] args) {
       
		
		//using bean factory
		/*Resource res=new ClassPathResource("spring.xml");
		BeanFactory b=new XmlBeanFactory(res);
		Employee emp=(Employee)b.getBean("emp");
		System.out.println("Emp Id: "+emp.getEid()+" Name : "+emp.getName());*/
		
		
		
		//using application context
		//it is advanced version of the bean container
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	Emp emp=(Emp)ctx.getBean("emp_scope");
    	emp.setMsg("Singleton");
    	System.out.println(emp.getMsg());
    	Emp emp1=(Emp)ctx.getBean("emp_scope");
    	System.out.println(emp1.getMsg());
    	Emp emp2=(Emp)ctx.getBean("emp_scope1");
    	emp2.setMsg("Prototype");
    	System.out.println(emp2.getMsg());
    	Emp emp3=(Emp)ctx.getBean("emp_scope1");
    	System.out.println(emp3.getMsg());
		
	}

}
