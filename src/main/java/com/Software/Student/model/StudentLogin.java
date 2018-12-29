	
package com.Software.Student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="login")
@Table(name="login")
public class StudentLogin 
{
	@Id
	private String rollno;
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	@Column(name="status")
	private int status;
	public int getStatus() 
	{
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "StudentLogin [rollno=" + rollno + ", name=" + name + ", password=" + password + "]";
	}
}