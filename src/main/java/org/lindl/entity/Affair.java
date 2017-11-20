package org.lindl.entity;

import java.io.Serializable;
import java.util.Date;

public class Affair implements Serializable {

	private int id;
	private String user_id;
	private String content;
	private String address;
	private Date plan_start_time;
	private Date plan_end_time;
	private Date actual_start_time;
	private Date actual_end_time;
	private int rank;
	private String remark;
	private int belong_to_type;
	private String belongToTypeName;
	private int alarm_time;
	private int notificaton_id;

	public static final int AFFAIR_RANK_IMPORTANT_HURRY = 1;
	public static final int AFFAIR_RANK_IMPORTANT_TO_DO = 2;
	public static final int AFFAIR_RANK_DELAY = 3;
	public static final int AFFAIR_RANK_NOT_IMPORTANT = 4;

	public static final int BEFORE_FIVE_MINUTE = 0;
	public static final int BEFORE_TEN_MINUTE = 1;
	public static final int BEFORE_FIFTEEN_MINUTE = 2;
	public static final int BEFORE_ONE_HOUR = 3;
	public static final int BEFORE_TWO_HOUR = 4;
	public static final int BEFORE_FIVE_HOUR = 5;
	public static final int BEFORE_ONE_DAY = 6;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getPlan_start_time() {
		return plan_start_time;
	}

	public void setPlan_start_time(Date plan_start_time) {
		this.plan_start_time = plan_start_time;
	}

	public Date getPlan_end_time() {
		return plan_end_time;
	}

	public void setPlan_end_time(Date plan_end_time) {
		this.plan_end_time = plan_end_time;
	}

	public Date getActual_start_time() {
		return actual_start_time;
	}

	public void setActual_start_time(Date actual_start_time) {
		this.actual_start_time = actual_start_time;
	}

	public Date getActual_end_time() {
		return actual_end_time;
	}

	public void setActual_end_time(Date actual_end_time) {
		this.actual_end_time = actual_end_time;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getBelong_to_type() {
		return belong_to_type;
	}

	public void setBelong_to_type(int belong_to_type) {
		this.belong_to_type = belong_to_type;
	}

	public String getBelongToTypeName() {
		return belongToTypeName;
	}

	public void setBelongToTypeName(String belongToTypeName) {
		this.belongToTypeName = belongToTypeName;
	}

	public int getAlarm_time() {
		return alarm_time;
	}

	public void setAlarm_time(int alarm_time) {
		this.alarm_time = alarm_time;
	}

	public int getNotificaton_id() {
		return notificaton_id;
	}

	public void setNotificaton_id(int notificaton_id) {
		this.notificaton_id = notificaton_id;
	}

	@Override
	public String toString() {
		return "Affair{" +
				"id=" + id +
				", user_id='" + user_id + '\'' +
				", content='" + content + '\'' +
				", address='" + address + '\'' +
				", plan_start_time=" + plan_start_time +
				", plan_end_time=" + plan_end_time +
				", actual_start_time=" + actual_start_time +
				", actual_end_time=" + actual_end_time +
				", rank=" + rank +
				", remark='" + remark + '\'' +
				", belong_to_type=" + belong_to_type +
				", belongToTypeName='" + belongToTypeName + '\'' +
				", alarm_time=" + alarm_time +
				", notificaton_id=" + notificaton_id +
				'}';
	}
}
