package com.virtualprogramers.expenses.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.virtualprogramers.expenses.exceptions.InvalidEmployeeException;
import com.virtualprogramers.expenses.exceptions.NameTooShortException;
import com.virtualprogrammers.expenses.domain.Department;
import com.virtualprogrammers.expenses.domain.Employee;
import com.virtualprogrammers.expenses.domain.ExpenseClaim;
import com.virtualprogrammers.expenses.domain.StaffEmployee;
import com.virtualprogrammers.expenses.utilities.EmployeeUtilities;

public class UIFunctions {
	
	public Employee registerNewEmployee() {
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();
		EmployeeUtilities employeeUtilities = new EmployeeUtilities();
		
		
		
		boolean idIsValid = false;
		while(!idIsValid) {
		
		System.out.println("Enter the id");
		
		//convert it to an integer
		
		String inputId = scanner.nextLine();
		try {
			Integer id = employeeUtilities.validateEmployeeId(inputId);
			//we have a valid id now we can do this
			employee.setId(id);
			idIsValid = true;
		} catch (InvalidEmployeeException e) {
			System.out.println("Print a number bitch");
		}
		}
		//makie a variable sotred as a boolean and can keep looping until true
		
		
		
		System.out.println("Enter the title");
		String title = scanner.nextLine();
		employee.setTitle(title);
		
		
	
		
		
		//validating if they are 6 characters long
		boolean nameIsValid = false;
		while(!nameIsValid) {
			System.out.println("WTF is your first name");
			String firstName = scanner.nextLine();
			employee.setFirstName(firstName);
			
			
			System.out.println("Last name bitch");
			String surname = scanner.nextLine();
			employee.setTitle(surname);

		try {
			//validate two values
			employeeUtilities.validateEmployeeName(firstName, surname);//try catch block this
			nameIsValid = true;
		}catch (NameTooShortException e) {
			System.out.println("Wrong name.");
		}
		
		
		System.out.println("Enter the job title");
		String jobTitle = scanner.nextLine();
		employee.setJobTitle(jobTitle);
		
		
		boolean departmentIsValid = false;
		while(!departmentIsValid) {
		
		
		System.out.println("Enter department");
		String department = scanner.nextLine();
		try {
		//error here
		Department d = Department.valueOf(department.toUpperCase());
		employee.setDepartment(d); //the string must match the enum value exactly, except capitalization
		departmentIsValid = true;
		}catch (IllegalArgumentException e) {
			System.out.println("The department you entered isnt valid, try again");
			
		}
		}
		
		
		System.out.println("Is this a member of Staff? Y/N");
		String isAStaffMember = scanner.nextLine();
		if (isAStaffMember.toUpperCase().equals("Y")) {
			StaffEmployee staff = new StaffEmployee(employee);
			
			System.out.println("Enter the username");
			String username = scanner.nextLine();
			staff.setUsername(username);
			
			System.out.println("Enter the password");
			String password = scanner.nextLine();
			staff.setPassword(password);
			
			return staff;

			
			
		} else {
			return (employee);
		}
		}
		
		//no need to printSystem.out.println(employee);
		
		/**
		String s = scanner.nextLine();
		Integer i = scanner.nextInt();
		scanner.nextLine();
		String s2 = scanner.nextLine();
		System.out.println(s);
		System.out.println(i);
		System.out.println(s2);
**/
		
		
		
	
		return employee;

}
	
	//new method
	public ExpenseClaim registerNewExpenseClaim() {
		Scanner scanner = new Scanner(System.in);
		EmployeeUtilities employeeUtilities = new EmployeeUtilities();
		
		System.out.println("Enter the claimID");
		int claimId = scanner.nextInt();
		scanner.nextLine();
		
		
		System.out.println("Enter the employeeID");
		int employeeId = scanner.nextInt();
		scanner.nextLine();
		
		
		LocalDate dateOfClaim = LocalDate.now();
		
		System.out.println("Enter the amount");
		double totalAmount = scanner.nextDouble(); 
		scanner.nextLine();
		
		
		ExpenseClaim claim = new ExpenseClaim(claimId, employeeId, dateOfClaim, totalAmount);
		return claim;
		
		
		
	}
}
	
