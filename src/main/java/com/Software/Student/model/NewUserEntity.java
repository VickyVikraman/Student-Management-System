package com.Software.Student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="new")
@Table(name="new")
public class NewUserEntity 
{
	@Id
	private String rollno;
	
	@Column(name="registered")
	private String registered;

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getRegistered() {
		return registered;
	}

	public void setRegistered(String registered) {
		this.registered = registered;
	}
	
	
	
}
