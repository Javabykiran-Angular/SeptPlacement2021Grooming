package com.jbk.DemoDI;

public class Employee {
	
	String name;
	Integer id;
	Address addr;	
	
	public Employee() {
		
	}	
		
	public Employee(String name, Integer id, Address addr) {
		super();
		this.name = name;
		this.id = id;
		this.addr = addr;
	}




	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
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
	public void setId1(Integer id) {
		this.id = id;
	}
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", id=" + id + "]";
//	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", addr=" + addr + "]";
	}
	
	
	

}
