package org.lindl.entity;

public class AffairType {

	private int id;
	private String affair_type;
	private String user_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAffair_type() {
		return affair_type;
	}

	public void setAffair_type(String affair_type) {
		this.affair_type = affair_type;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "AffairType{" +
				"id=" + id +
				", affair_type='" + affair_type + '\'' +
				", user_id='" + user_id + '\'' +
				'}';
	}
}
