package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
@Table(name="student")
public class Student extends BaseEntity {

	private String firstname;
	private String lastname;
	private String email;
	@Column(nullable=false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	private String class_std;
	private String location;
	private LocalDate admindate;
	private double scholorship;
	
	
	public Student(String firstname, String lastname, String email, String password, String class_std, String location,
			LocalDate admindate, double scholorship) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.class_std = class_std;
		this.location = location;
		this.admindate = admindate;
		this.scholorship = scholorship;
	}
	
	
	
	public Student() {
		
	}
	
	



	@Override
	public String toString() {
		return "Student id= "+ getId() +" [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + ", class_std=" + class_std + ", location=" + location + ", admindate=" + admindate
				+ ", scholorship=" + scholorship + "]";
	}



	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getClass_std() {
		return class_std;
	}
	public void setClass_std(String class_std) {
		this.class_std = class_std;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDate getAdmindate() {
		return admindate;
	}
	public void setAdmindate(LocalDate admindate) {
		this.admindate = admindate;
	}
	public double getScholorship() {
		return scholorship;
	}
	public void setScholorship(double scholorship) {
		this.scholorship = scholorship;
	}
	
	
	
}
