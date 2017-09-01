package org.lindl.entity;

public class ExpenseType {

	private int id;
	private String user_id;
	private String expense_type;

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

	public String getExpense_type() {
		return expense_type;
	}

	public void setExpense_type(String expense_type) {
		this.expense_type = expense_type;
	}

	@Override
	public String toString() {
		return "ExpenseType{" +
				"id=" + id +
				", user_id='" + user_id + '\'' +
				", expense_type='" + expense_type + '\'' +
				'}';
	}
}
