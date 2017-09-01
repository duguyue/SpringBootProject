package org.lindl.entity;

public class Income {
	private int id;
	private String user_id;
	private int income_type_id;
	private double amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public int getIncome_type_id() {
		return income_type_id;
	}

	public void setIncome_type_id(int income_type_id) {
		this.income_type_id = income_type_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
