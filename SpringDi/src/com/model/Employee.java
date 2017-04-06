package com.model;

public class Employee {

	int eid;
	String name;
	Address add;
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show()
	{
		System.out.println("id= "+eid+" Name ="+name);
		System.out.println(add);
	}
}
