package com.example.bachatgat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bachatgat")
public class User {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, double monthly, double principal, double penalty, double loan, String loanDate) {
		super();
		this.id = id;
		this.name = name;
		this.monthly = monthly;
		this.principal = principal;
		this.penalty = penalty;
		this.loan = loan;
		this.loanDate = loanDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double monthly;
	private double principal;
	private double penalty;
	private double loan;
	private String loanDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthly() {
		return monthly;
	}

	public void setMonthly(double monthly) {
		this.monthly = monthly;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getPenalty() {
		return penalty;
	}

	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}

	public double getLoan() {
		return loan;
	}

	public void setLoan(double loan) {
		this.loan = loan;
	}

	public String getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(String loanDate) {
		this.loanDate = loanDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", monthly=" + monthly + ", principal=" + principal + ", penalty="
				+ penalty + ", loan=" + loan + ", loanDate=" + loanDate + "]";
	}

}
