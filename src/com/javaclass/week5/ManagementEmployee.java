/**
 * 
 */
package com.javaclass.week5;

/**
 * @author byoakum
 *
 */
public class ManagementEmployee extends Employee {

	/**
	 * @param name
	 * @param contract
	 * @param years
	 * @param department
	 */
	public ManagementEmployee(String name, int years, String department) {
		super(name, Contract.INDEFINITE, years, department);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public ManagementEmployee() {
		// TODO Auto-generated constructor stub
	}

	public double getSalary(){
		/*
		 * The ManagementEmployee class represents an employee 
		 * in the Management department. A manager always has 
		 * an indefinite contract and his/her salary is based 
		 * on a starting salary of 40 000 bitcoins plus 6 000 
		 * bitcoins for every year in the company. 
		 */
		double salary = 40000 + ( 6000 * this.years);
		return salary;
	}
}
