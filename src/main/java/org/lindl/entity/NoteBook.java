package org.lindl.entity;

//import android.graphics.Bitmap;

public class NoteBook {

	private int id;
	private String content;
	// private String picture_path;
	// private Bitmap picture;
	private int flag;
	private String user_id;

	public static int HAS_SETPASSWORD_DELETE = 1;
	public static int HAS_SETPASSWORD_MODIFY = 2;
	public static int HAS_SETPASSWORD_SHARE = 3;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "NoteBook{" +
				"id=" + id +
				", content='" + content + '\'' +
				", flag=" + flag +
				", user_id='" + user_id + '\'' +
				'}';
	}
}
