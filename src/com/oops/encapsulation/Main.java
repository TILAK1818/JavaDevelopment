package com.oops.encapsulation;

public class Main extends Employee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		//Throws error since data's are declared as private
		//e1.name;
		e1.setName("Tilak");
		e1.setId(2076);
		e1.setSalary(15000);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
	}
}
