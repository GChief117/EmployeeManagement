package com.virtualprogrammers.expenses.utilities;
import com.virtualprogramers.expenses.exceptions.InvalidEmployeeException;
import com.virtualprogramers.expenses.exceptions.NameTooShortException;
import com.virtualprogrammers.expenses.domain.Employee;
import com.virtualprogrammers.expenses.domain.Employees;


public class EmployeeUtilities {
		
	public boolean employeeExists(Employees employees, Employee employee){
		return employees.findBySurname(employee.getSurname()) != null;
	}
	
	public Integer validateEmployeeId(String inputId) throws InvalidEmployeeException { ///you are suppose to return what you set at the top 
		//try catch
		//if the string can be cast to an integer, then do the cast and return it
		try {
			Integer id = Integer.valueOf(inputId);
			return id;
		} catch (NumberFormatException e) {
			throw new InvalidEmployeeException();
		}
		
	}
	
	
	public void validateEmployeeName(String firstName, String surname) throws NameTooShortException {
		Integer length = firstName.length() + surname.length();
		if (length < 6) {
			throw new NameTooShortException();
		}
	}
	
	
	
	//boolean method
	
	//public boolean(one, the other)
	
	//public String
	
	//public int
	
	//public double
	
	//public 
	
	
	
}

