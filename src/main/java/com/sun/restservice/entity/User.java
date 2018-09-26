package com.sun.restservice.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	  @Id
	    private String email_id;
	    private String password;
	    private String name;
	    private int pregnancy_week;
	    private boolean first_time_pregnancy;
	    private boolean active_status;
		public String getEmail_id() {
			return email_id;
		}
		public void setEmail_id(String email_id) {
			this.email_id = email_id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPregnancy_week() {
			return pregnancy_week;
		}
		public void setPregnancy_week(int pregnancy_week) {
			this.pregnancy_week = pregnancy_week;
		}
		public boolean isFirst_time_pregnancy() {
			return first_time_pregnancy;
		}
		public void setFirst_time_pregnancy(boolean first_time_pregnancy) {
			this.first_time_pregnancy = first_time_pregnancy;
		}
		public boolean isActive_status() {
			return active_status;
		}
		public void setActive_status(boolean active_status) {
			this.active_status = active_status;
		}
		@Override
		public String toString() {
			return "User [email_Id=" + email_id + ", password=" + password + ", name=" + name + ", pregnancy_week="
					+ pregnancy_week + ", first_time_pregnancy=" + first_time_pregnancy + ", active_status="
					+ active_status + "]";
		}
		
	    
	    
}
