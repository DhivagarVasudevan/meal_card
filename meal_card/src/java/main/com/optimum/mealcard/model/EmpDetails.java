package com.optimum.meal_card.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "empdetails")
public class EmpDetails {
	@Id
	@Size(min = 4, max = 4)
	private Integer id;
	@NotNull
	private String name;
	@NotNull
	private String gender;
	@NotNull
	private String emailId;
	@NotNull
	private String password;
	private Boolean mealCardStatus;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getMealCardStatus() {
		return mealCardStatus;
	}
	public void setMealCardStatus(Boolean mealCardStatus) {
		this.mealCardStatus = mealCardStatus;
	}
	public EmpDetails(Integer id, String name, String gender, String emailId, String password, Boolean mealCardStatus) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.emailId = emailId;
		this.password = password;
		this.mealCardStatus = mealCardStatus;
	}
	public EmpDetails() {
		
	}
	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", name=" + name + ", gender=" + gender + ", emailId=" + emailId + ", password="
				+ password + ", mealCardStatus=" + mealCardStatus + "]";
	}
	
}
