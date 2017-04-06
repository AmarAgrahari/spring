package com.moddel;

import java.util.Scanner;

public class Employee {
String name;
public Employee(String name)
{
	this.name=name;
}

public static Employee getData()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name");
	String sc1=sc.nextLine();
	return new Employee(sc1);
}
public void show()
{
	System.out.println("HI "+name);
}
}
