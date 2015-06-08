/**
 * 
 */
package com.javaclass.week5;

/**
 * @author byoakum
 *
 */
public class AdministrationEmployee extends Employee {

	/**
	 * @param name
	 * @param contract
	 * @param years
	 * @param department
	 */
	public AdministrationEmployee(String name, String department) {
		super(name, Contract.TEMPORARY, 0, department);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public AdministrationEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public double getSalary(){
		/*
		 * the AdministrationEmployee class represents an employee 
		 * in the Administration department. These employees are 
		 * hired from employment agencies, so his/her contracts 
		 * are always temporary and count as 0 years in the company. 
		 * The salary is fixed, 18 000 bitcoins.
		 */
		return (double) 18000;
	}

}
