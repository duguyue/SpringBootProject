package org.lindl.entity;

public class Expense {

	private int id;
	private String user_id;
	private int expense_type_id;
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

	public int getExpense_type_id() {
		return expense_type_id;
	}

	public void setExpense_type_id(int expense_type_id) {
		this.expense_type_id = expense_type_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
