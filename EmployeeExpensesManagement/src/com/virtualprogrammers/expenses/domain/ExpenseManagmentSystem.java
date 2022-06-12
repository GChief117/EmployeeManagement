package com.virtualprogrammers.expenses.domain;

import java.util.Scanner;

import com.virtualprogramers.expenses.exceptions.EmployeeNotFoundException;
import com.virtualprogramers.expenses.ui.UIFunctions;

import management.ExpenseManagementProcess;
import management.ExpressExpenseManagementProcess;

public class ExpenseManagmentSystem {

	public ExpenseManagmentSystem() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Employees employees = new Employees();
		Scanner scanner = new Scanner(System.in);
		UIFunctions uiFunctions = new UIFunctions();
		
		//isntnace of UI functions
		
		
		ExpenseManagementProcess expressEMP = new ExpressExpenseManagementProcess();
		ExpenseManagementProcess regularEMP = new ExpressExpenseManagementProcess();

		
		//boolean for exist
				
		boolean readyToExit = false;
		while(!readyToExit ) {
		
		
		//making the menu;
		
		
		System.out.println("Expense Managmenet System");
		
		System.out.println("-------------------------");
		
		System.out.println("e - register new employee");
		System.out.println("c - register new claim");
		System.out.println("p - print all employees");
		System.out.println("a - approve");
		System.out.println("x - exit");
		
		
		
		
		String option = scanner.nextLine();
		
		
		switch(option) {
			case "e" : //register new employee
				Employee e = uiFunctions.registerNewEmployee();
				employees.addEmployee(e);
				break;
			case "c" : //register new claim
				ExpenseClaim claim = uiFunctions.registerNewExpenseClaim();
				
				//try catch with this
				try {
					employees.addExepnseClaim(claim);
					expressEMP.registerExpenseClaim(claim);
					regularEMP.registerExpenseClaim(claim);
					//storing result
					int id = regularEMP.registerExpenseClaim(claim);
					System.out.println("The claim has been registered with ID " + id);
					
					
					
				}catch (EmployeeNotFoundException employeeNotFoundException) {
					System.out.println("There is no valid ID" + claim.getEmployeeID());
				}
				break;
			case "p" : //print all employees
				employees.printEmployee();
				break;
			case "a":
				//get id of the claim
				System.out.println("Enter the claim ID");
				int claimId = scanner.nextInt();
				scanner.nextLine();
				
				//get the employee id
				System.out.println("Enter the employeeID");
				int employeeId = scanner.nextInt();
				scanner.nextLine();
				//find the employee
				Employee foundEmployee = employees.findById(employeeId);
				//call the relevant id
				System.out.println("Enter r for regular, or e for express");
				String claimType = scanner.nextLine();
				
				
				
				ExpenseManagementProcess requestedProcess;
				if (claimType.equals("r")) {
					requestedProcess = regularEMP;
				
				}else {
					requestedProcess = expressEMP;
				}
				boolean result = requestedProcess.approveClaim(claimId,  foundEmployee);
				System.out.println("The result was " + result);
				
				break;
			
			case "x" : //exit
				readyToExit = true;
				break;
				//when something else happens
				default:
					System.out.print("Follow the instrucitons");
			
			
			
		}
		
	}
	}

}
