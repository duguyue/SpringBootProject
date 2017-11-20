package org.lindl.entity;

public class IncomeType {
	private int id;
	private String user_id;
	private String income_type;

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

	public String getIncome_type() {
		return income_type;
	}

	public void setIncome_type(String income_type) {
		this.income_type = income_type;
	}

	@Override
	public String toString() {
		return "IncomeType{" +
				"id=" + id +
				", user_id='" + user_id + '\'' +
				", income_type='" + income_type + '\'' +
				'}';
	}
}
