package com.sun.restservice.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recordings {
	@Id
	private String email_id;
	private int count;
	private int fav_count;
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getFav_count() {
		return fav_count;
	}
	public void setFav_count(int fav_count) {
		this.fav_count = fav_count;
	}
	@Override
	public String toString() {
		return "RecordingsEntity [email_id=" + email_id + ", count=" + count + ", fav_count=" + fav_count + "]";
	}
	 
}
