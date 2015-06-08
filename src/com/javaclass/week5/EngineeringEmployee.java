/**
 * 
 */
package com.javaclass.week5;

/**
 * @author byoakum
 *
 */
public class EngineeringEmployee extends Employee {

	/**
	 * @param name
	 * @param contract
	 * @param years
	 * @param department
	 */
	public EngineeringEmployee(String name, Contract contract, int years,
			String department) {
		super(name, contract, years, department);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public EngineeringEmployee() {
		// TODO Auto-generated constructor stub
	}
	public double getSalary(){
		/*
		 * Similarly, the EngineeringEmployee class represents an employee 
		 * in the Engineering department. The salary of an engineer starts 
		 * with 25 000 bitcoins and is incremented in 2 500 bitcoins each 
		 * complete year that he/she stays in the company.
		 */		
		double salary = 25000 + (this.years * 2500);
		return salary;
	}

}
