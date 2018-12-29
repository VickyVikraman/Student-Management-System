package com.Software.Student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="address")
@Table(name="address")
public class AddressEntity 
{
	@Id
	private String rollno;
	
	@Column(name="permanant_address")
	private String permanentAdd;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="communication_address")
	private String communicationAdd;
	
	@Column(name="ccity")
	private String ccity;
	
	@Column(name="cstate")
	private String cstate;
	
	@Column(name="czip")
	private String czip;
	
	@Column(name="native_place")
	private String nativePlace;
	
	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getPermanentAdd() {
		return permanentAdd;
	}
	public void setPermanentAdd(String permanentAdd) {
		this.permanentAdd = permanentAdd;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCommunicationAdd() {
		return communicationAdd;
	}
	public void setCommunicationAdd(String communicationAdd) {
		this.communicationAdd = communicationAdd;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public String getCstate() {
		return cstate;
	}
	public void setCstate(String cstate) {
		this.cstate = cstate;
	}
	public String getCzip() {
		return czip;
	}
	public void setCzip(String czip) {
		this.czip = czip;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
}
