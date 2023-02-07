package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;




@Entity
@Table
public class Employee extends BaseEntity {
	
	
	private String firstname;
	private String lastname;
	private String email;
	@Column(nullable=false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	private LocalDate doj;
	private double salary;
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
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee id ="+ getId() +" [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email +  
				", doj=" + doj + ", salary=" + salary + "]";
	}
	public Employee(String firstname, String lastname, String email, String password, LocalDate doj, double salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.doj = doj;
		this.salary = salary;
	}
	public Employee() {

	}
	
	
	
	
	
	
	
	
}
