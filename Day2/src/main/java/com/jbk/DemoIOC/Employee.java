package com.jbk.DemoIOC;

public class Employee {
	
	Integer id;
	String name;
	
	public Employee() {
		System.out.println("Employee Object Created..");
	}
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
