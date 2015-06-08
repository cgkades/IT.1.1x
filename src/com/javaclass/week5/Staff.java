/**
 * 
 */
package com.javaclass.week5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.javaclass.week5.Employee.Contract;

import java.util.HashMap;
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
		HashMap salary_calculation = new HashMap();
		ArrayList<Employee> employee_array = new ArrayList<Employee>();
		employee_array.add(new ManagementEmployee("Bill", 9, "manager"));
		employee_array.add(new EngineeringEmployee("Anna", Contract.INDEFINITE, 9, "engineering"));
		employee_array.add(new EngineeringEmployee("John", Contract.INDEFINITE, 5, "engineering"));
		employee_array.add(new EngineeringEmployee("Elizabeth", Contract.TRAINING, 3, "engineering"));
		employee_array.add(new EngineeringEmployee("Michael", Contract.TRAINING, 2, "engineering"));
		employee_array.add(new AdministrationEmployee("Albert", "administration"));
		
		for (int i = 0;i < employee_array.size(); i++){
			System.out.println(employee_array.get(i).toString());
			String department = employee_array.get(i).getDepartment();
			double current_salary = employee_array.get(i).getSalary();
			double department_total = 0;
			if (salary_calculation.get(department) != null){
				department_total = (double) salary_calculation.get(department);
			}
			salary_calculation.put(department,department_total + current_salary);
		}
		System.out.println("");
		Set salary_hashmap_set = salary_calculation.entrySet();
		Iterator i = salary_hashmap_set.iterator();
		double total = 0;
		while (i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + " total salary: " + me.getValue() + " bitcoins." );
			total += (double) me.getValue();
		}
		System.out.println("Acme total salary: "+ total+ " bitcoins.");
		
		// … salary calculation and printing
	}

}
