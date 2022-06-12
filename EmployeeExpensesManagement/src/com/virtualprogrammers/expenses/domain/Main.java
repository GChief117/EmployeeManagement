package com.virtualprogrammers.expenses.domain;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Employee employee1 = new Employee(); //instance of employee, can also be applied for a instnace of a stack or hashmap
		employee1.setId(1);
		employee1.setFirstName("G");
		employee1.setSurname("Nelson");
		employee1.setTitle("Mr");
		
		
		//new employee referring to constructor 
		//Employee employee2 = new Employee(2, "Manager");
		System.out.println(employee1.getMailingName());
		System.out.println(employee1.getMailingName(true));
		System.out.println(employee1.getMailingName(false));
		
		
		Employee employee2 = new Employee(2, "Manager");
		employee2.setTitle("Dr");
		employee2.setFirstName("Dennis");
		employee2.setSurname("Leary");

		
		Employees employees = new Employees(); //array size of 15 with the numberOfEmployee
		employees.addEmployee(employee1);
		employees.addEmployee(employee2);
		employees.addEmployee( new Employee(3, "Mrs", "Susan", "Brown", "Director", Department.MARKETING));
		
		
		employees.printEmployee();
		
		
		Employee foundEmployee = employees.findBySurname("Brown");
        System.out.println("Found " + foundEmployee.getMailingName());

        Employee foundEmployee2 = employees.findBySurname("Cyan");
        System.out.println("Didn't find " + (foundEmployee2 == null));
		

        ExpenseClaim expenseClaim = new ExpenseClaim(24,642,LocalDate.now(),26.99);
        System.out.println(expenseClaim.getEmployeeID());
        expenseClaim.setPaid(true);
        System.out.println(expenseClaim.getPaid());
        expenseClaim.setApproved(true);
        expenseClaim.setPaid(true);
        System.out.println(expenseClaim.getPaid());

        ExpenseItem expenseItem = new ExpenseItem(24, 102, ExpenseType.ACCOMODATION, "The Grand Hotel", 69.99);
        System.out.println(expenseItem.getDesccription());
        
        
        System.out.println(employee1.toString()); //Employee@6b95977 this is the hashcode of the method
        //our IDEs will create this for us, and there is some blank space
        
        System.out.println(employee1); //same as the toString
        
        
        String name1 = "Matt";
        String name2 = "Matt";
		Employee employee3 = new Employee(); //instance of employee, can also be applied for a instnace of a stack or hashmap
		employee3.setId(1);
		employee3.setFirstName("G");
		employee3.setSurname("Nelson");
		employee3.setTitle("Mr");        

        System.out.println(employee1.equals(employee3));//we get a 
        
        
        //System.out.println(name1.equals(name2)); string is an obejct and use the dot equals method and create another employee as emloyee1
        //find where its defined
        
        //the string is the object and must use the dot equals method, same attributes as 1
        
        //going to copy and use this efficiently
        
        System.out.println(employee1.getClass());
        
        
        
    }
}
