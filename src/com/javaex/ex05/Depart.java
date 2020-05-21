package com.javaex.ex05;

public class Depart extends Employee {

	//코드작성
	private String departName;
	
	public Depart() {}
	
	public Depart(String name, int salary, String departName) {
		super(name, salary);
		this.departName = departName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}
	
	
	public void showInformation() {
		System.out.println("이름:" + name + "  연봉:" + salary + "  부서:" + departName);
	}

	@Override
	public String toString() {
		return "Depart [departName=" + departName + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
