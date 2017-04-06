package com.model1;

public class Employee {

	int eid;
	String name;
	Address add;
	public Employee(int eid, String name, Address add) {
		super();
		this.eid = eid;
		this.name = name;
		this.add = add;
	}


public void show()
{
	System.out.println("id= "+eid+" Name ="+name);
	System.out.println(add);
}
}