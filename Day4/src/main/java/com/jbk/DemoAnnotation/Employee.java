package com.jbk.DemoAnnotation;

public class Employee {

	String name;
	Integer id;
	
	public Employee() {
		System.out.println("Employee Object is created");
	}
	
	public Employee(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
