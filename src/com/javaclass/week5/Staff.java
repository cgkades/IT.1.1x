/**
 * 
 */
package com.javaclass.week5;

import java.util.ArrayList;

import com.javaclass.week5.Employee.Contract;

/**
 * @author byoakum
 *
 */
public class Staff {

	/**
	 * 
	 */
	public Staff() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String[] args) { 
		// … object array creation
		ArrayList<Employee> employee_array = new ArrayList<Employee>();
		employee_array.add(new ManagementEmployee("Bill", 9, "manager"));
		employee_array.add(new EngineeringEmployee("Anna", Contract.INDEFINITE, 9, "engineering"));
		employee_array.add(new EngineeringEmployee("John", Contract.INDEFINITE, 5, "engineering"));
		employee_array.add(new EngineeringEmployee("Elizabeth", Contract.TRAINING, 3, "engineering"));
		employee_array.add(new EngineeringEmployee("Michael", Contract.TRAINING, 2, "engineering"));
		employee_array.add(new AdministrationEmployee("Albert", "administration"));
		
		for (int i = 0;i < employee_array.size(); i++){
			System.out.println(employee_array.get(i).toString());
		}

		// … print info
		// … salary calculation and printing
	}

}
