package com.virtualprogrammers.expenses.domain;

public class ExpenseItem {
	private Integer id;
	private Integer claimId;
	private ExpenseType expenseType;
	private String desccription;
	private Double amount;
	
	
	 //Create an instance of each class to test your code, using any values you like for the parameters.
	
	
	/**
	 * 
	 * @param id
	 * @param claimId
	 * @param expenseType
	 * @param desccription
	 * @param amount
	 */
	public ExpenseItem(Integer id, Integer claimId, ExpenseType expenseType, String desccription, Double amount) {
		this.id = id;
		this.claimId = claimId;
		this.expenseType = expenseType;
		this.desccription = desccription;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public Integer getClaimId() {
		return claimId;
	}

	public ExpenseType getExpenseType() {
		return expenseType;
	}

	public String getDesccription() {
		return desccription;
	}

	public Double getAmount() {
		return amount;
	}


}
