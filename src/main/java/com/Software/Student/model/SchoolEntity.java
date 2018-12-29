package com.Software.Student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="school")
@Table(name="school")
public class SchoolEntity 
{
	@Id
	private String rollno;
	@Column(name="sslc")
	private String sslc;
	@Column(name="sslcpercentage")
	private String sslcPercentage;
	@Column(name="sslcpassing")
	private String sslcPassing;
	@Column(name="hsc")
	private String hsc;
	@Column(name="hscpercentage")
	private String hscPercentage;
	@Column(name="hscpassing")
	private String hscPassing;
	@Column(name="diploma")
	private String diploma;
	@Column(name="diplomapercentage")
	private String diplomaPercentage;
	@Column(name="diplomapassing")
	private String diplomaPassing;
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getSslc() {
		return sslc;
	}
	public void setSslc(String sslc) {
		this.sslc = sslc;
	}
	public String getSslcPercentage() {
		return sslcPercentage;
	}
	public void setSslcPercentage(String sslcPercentage) {
		this.sslcPercentage = sslcPercentage;
	}
	public String getSslcPassing() {
		return sslcPassing;
	}
	public void setSslcPassing(String sslcPassing) {
		this.sslcPassing = sslcPassing;
	}
	public String getHsc() {
		return hsc;
	}
	public void setHsc(String hsc) {
		this.hsc = hsc;
	}
	public String getHscPercentage() {
		return hscPercentage;
	}
	public void setHscPercentage(String hscPercentage) {
		this.hscPercentage = hscPercentage;
	}
	public String getHscPassing() {
		return hscPassing;
	}
	public void setHscPassing(String hscPassing) {
		this.hscPassing = hscPassing;
	}
	public String getDiploma() {
		return diploma;
	}
	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}
	public String getDiplomaPercentage() {
		return diplomaPercentage;
	}
	public void setDiplomaPercentage(String diplomaPercentage) {
		this.diplomaPercentage = diplomaPercentage;
	}
	public String getDiplomaPassing() {
		return diplomaPassing;
	}
	public void setDiplomaPassing(String diplomaPassing) {
		this.diplomaPassing = diplomaPassing;
	}
	
	
}
