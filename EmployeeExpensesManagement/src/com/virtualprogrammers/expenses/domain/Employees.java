package com.virtualprogrammers.expenses.domain;

import java.util.HashSet;

import com.virtualprogramers.expenses.exceptions.EmployeeNotFoundException;

public class Employees {
	
	private HashSet<Employee>employees = new HashSet<>();
	
	//finding a space in the array
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	
	public void printEmployee() {
		for (Employee e: employees) {
			if (e != null)
				System.out.println(e); //e stands for employee
		}
	}
	
	
	//private Employee[] employees = new Employee[20];
	
	//public Employees(int numberOfEmployees) {
	//	employees = new Employee[numberOfEmployees]; //can determine the size of the number of Employees and array
	//}
	
	
//	public void addEmployee(Employee employee) {
//		//create a variable to store empty position in
//		int firstEmptyPosition = -1; //first empty position
//		for (int i = 0; i < employees.length; i++) { //loop through 
//			if(firstEmptyPosition == -1 && employees[i] == null) {
//				firstEmptyPosition = i; //we need a null condition and knowing what to do in that condition
//			}
//
//		}
//		if(firstEmptyPosition == -1) { //one without the condition of null
//			System.out.println("Sorry the array is full");
//		}else {
//			employees[firstEmptyPosition] = employee;
//		}
//
//	}
	
		
	    public Employee findBySurname(String surname) {
	        for(Employee e : employees) {
	            if (e.getSurname().equals(surname)) {
	                return e;
	            }
	        }
	        return null;
	    }
		
	    public Employee findById(int id) {
	        for(Employee e : employees) {
	            if (e.getId() == (id)) {
	                return e;
	            }
	        }
	        return null;
	    }

	
	
	public boolean employeeExists(int id) {
        for(Employee e : employees) {
            if (e.getId() == id) {
                return true;
            }
        }
        return false;
		
	}
	
	
	public void addExepnseClaim(ExpenseClaim claim) throws EmployeeNotFoundException {
		int employeeId = claim.getEmployeeID();//store as seperate variable
		
		if (!employeeExists(employeeId)) {
			throw new EmployeeNotFoundException();
		}
		
		
		//(e != null &&
		
		
		        for(Employee e : employees) {
		            if (e.getId() == employeeId) {
		            	//e represents the employee
		            	//then we want to add new claim into employee 
		            	e.getClaims().add(claim);
		            	
		            }
		        }
	
	
	}
}
