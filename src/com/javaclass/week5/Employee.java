package com.javaclass.week5;

public class Employee {
	protected String name;
	protected int years;
	protected String department;
	protected Contract contract;
	
	protected enum Contract {
		TEMPORARY (0, "temporary"),
		TRAINING (1, "training"),
		INDEFINITE (2, "indefinite");
		
		private int value;
		private String name;
		Contract (int contract_code, String contract_name) {
			this.value = contract_code;
			this.name = contract_name;
		}
		public String getName(){return this.name();}
		public static Contract getContract(int contract_code){
			
			for (Contract contract :Contract.values()){
				if (contract_code == contract.value){return contract;}
			}
			throw new IllegalArgumentException("Invalid contract code: " + contract_code + ".");
		}
	}
	
	public Employee(String name, int contract, int years, String department) {
		this.setContract(Contract.getContract(contract));
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}



	public interface Employed {
		double getSalary();
	}
	
	public String toString(){
		return  this.name + ":" + this.department + " department, " + this.contract.getName() + " contract, " + this.years + " years in the company, salary of " + getSalary() + " bitcoins.";
	}
	
	protected double getSalary(){
		
		return 0;
	}
}