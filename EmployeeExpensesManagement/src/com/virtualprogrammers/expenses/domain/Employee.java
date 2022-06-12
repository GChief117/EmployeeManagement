package com.virtualprogrammers.expenses.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	
	//sorting employes by ID
	
	private int id;
	private String title;
	private String firstName;
	private String surname;
	private String jobTitle;
	private Department department;
	private ArrayList<ExpenseClaim> claims = new ArrayList<>();
	
	//rather than definieng the strings,
	//Enums helps us redefine our constant values
	//Enums are all uppercase
	
	//Constructor--they dont have a return type
	
	public Employee() {
		//empty code block
		//can be if we create an employee 
		// for array claims = new ExpenseClaim[10];
	}
	
	public String getMailingName() {
		return title + " " + firstName + " " + surname;
	}
	
	
	/**
	 * 
	 * @param firstInitialOnly
	 * @return
	 */
	public String getMailingName (boolean firstInitialOnly) {
		if(firstInitialOnly) {
			return title + " + fristName ".substring(0,1) + surname;
		} else {
			return title + " " + surname;
		}
		//using this method externally
	}
	
	
	//making a second constructor
	
	/**
	 * 
	 * @param id
	 * @param jobTitle
	 */
	public Employee(int id, String jobTitle) {
		this.id = id;
		this.jobTitle = jobTitle;
		//for arrays claims = new ExpenseClaim[10];
	}
	
	/**
	 * 
	 * @param id
	 * @param title
	 * @param firstName
	 * @param surname
	 * @param jobTitle
	 * @param department
	 */
	///Eclipse constructor source---->generate constructor from fields
	public Employee(int id, String title, String firstName, String surname, String jobTitle, Department department) {
		super();
		this.id = id;
		this.title = title;
		this.firstName = firstName;
		this.surname = surname;
		this.jobTitle = jobTitle;
		this.department = department;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if (firstName.length() < 2) {
			System.out.println("Error--too small");
		} else {
			this.firstName = firstName;
		}
		
		
		this.firstName = firstName;
	}
	
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	///neeed a getter method
	

	
	
	//starting point for the class and the properties of the class
	//Private and no class to access them and the convention must set and read these values
	//values of the ID
	//set the id
	
	//remember classes in java have strings, booleans, and integers
	
	
	///To do so Source --> Getters and Setters
	
	
	
	////creating a toString
	//It is a readable version of our class
	
	//we get: Employee [id=1, title=Mr, firstName=G, surname=Nelson, jobTitle=null, department=null, claims=null]

	
	//which ones cant be null those are the 

	public ArrayList<ExpenseClaim> getClaims() {
		return claims;
	}

	public void setClaims(ArrayList<ExpenseClaim> claims) {
		this.claims = claims;
	}

	@Override
	public int hashCode() {
		return Objects.hash(claims, department, firstName, id, jobTitle, surname, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(claims, other.claims) && department == other.department
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(jobTitle, other.jobTitle) && Objects.equals(surname, other.surname)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", title=" + title + ", firstName=" + firstName + ", surname=" + surname
				+ ", jobTitle=" + jobTitle + ", department=" + department + ", claims=" + claims + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.valueOf(id).compareTo(o.getId());
	}

	//the reason for the generic type
	

	
	//generating hashcode and equals
	
	
}