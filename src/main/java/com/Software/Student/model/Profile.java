package com.Software.Student.model;

public class Profile 
{
	Address address;
	Contact contact;
	School school;
	User user;
//	private String rollno;
	private boolean success;
	
//	public String getRollno() {
//		return rollno;
//	}
//	public void setRollno(String rollno) {
//		this.rollno = rollno;
//	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
