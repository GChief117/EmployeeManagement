package com.virtualprogrammers.expenses.domain;

import java.time.LocalDate;
import java.util.Objects;

public class ExpenseClaim {
	private Integer id;
	private Integer employeeID;
	private LocalDate dateofClaim;
	private Double totalAmount;
	private Boolean approved;
	private Boolean paid;
	
	
	
	/**
	 * 
	 * @param id
	 * @param employeeID
	 * @param dateofClaim
	 * @param totalAmount
	 */
	public ExpenseClaim(Integer id, Integer employeeID, LocalDate dateofClaim, Double totalAmount) {
		super();
		this.id = id;
		this.employeeID = employeeID;
		this.dateofClaim = dateofClaim;
		this.totalAmount = totalAmount;
		this.approved = false;
		this.paid = false;
	}



	public Boolean isApproved() {
		return approved;
	}



	public void setApproved(Boolean approved) {
		this.approved = approved;
	}



	public Boolean isPaid() {
		return paid;
	}



	
	//the if statement will rely on the first condition
	
    public void setPaid(Boolean paid) {
        if (paid && !approved) {
            System.out.println("This item cannot be paid as it has not yet been approved");
        }
        else {
            this.paid = paid;
        }
    }
    
    public Boolean getPaid() {
        return paid;
    }
	
    
	
	/**
	public void setPaid(Boolean paid) {
		if(this.paid == true) {
			this.paid = paid;
		} else {
			System.out.prIntegerln("This item cannot be paid as it has not yet been approved.");
		}
	}
	**/



	public Integer getId() {
		return id;
	}
	
	
	//equals and hashcode are made


	@Override
	public int hashCode() {
		return Objects.hash(approved, dateofClaim, employeeID, id, paid, totalAmount);///taking into consieration of all parameters
	}
	//you can create a shorthand of modeling class
	//record keyword
	//and all the hashcode as are made equal
	
	
	//twostring, equals, and hashcode



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExpenseClaim other = (ExpenseClaim) obj;
		return Objects.equals(approved, other.approved) && Objects.equals(dateofClaim, other.dateofClaim)
				&& Objects.equals(employeeID, other.employeeID) && Objects.equals(id, other.id)
				&& Objects.equals(paid, other.paid) && Objects.equals(totalAmount, other.totalAmount);
	}



	@Override
	public String toString() {
		return "ExpenseClaim [id=" + id + ", employeeID=" + employeeID + ", dateofClaim=" + dateofClaim
				+ ", totalAmount=" + totalAmount + ", approved=" + approved + ", paid=" + paid + "]";
	}



	public Integer getEmployeeID() {
		return employeeID;
	}





	public LocalDate getDateofClaim() {
		return dateofClaim;
	}





	public Double getTotalAmount() {
		return totalAmount;
	}


	
	
	
	
	
	
	
	

}
