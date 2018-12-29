package com.Software.Student.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="od_details")
@Table(name="od_details")
public class Od_Details 
{
	@Id
	private Timestamp odid;
	@Column(name="rollno")
	private String rollno;
	@Column(name="name")
	private String name;
	@Column(name="event")
	private String event;
	@Column(name="venue")
	private String venue;
	@Column(name="from_date")
	private Date from_date;
	@Column(name="to_date")
	private Date to_date;
	@Column(name="periods")
	private int periods;
	@Column(name="hours")
	private String hours;
	@Column(name="title")
	private String title;
	@Column(name="remarks")
	private String remarks;
	@Column(name="status")
	private String status;
	@Column(name="approve_status")
	private String approve_status;
	@Column(name="prize")
	private String prize;
	public Timestamp getOdid() {
		return odid;
	}
	public void setOdid(Timestamp timestamp) {
		this.odid = timestamp;
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
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public int getPeriods() {
		return periods;
	}
	public void setPeriods(int periods) {
		this.periods = periods;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApprove_status() {
		return approve_status;
	}
	public void setApprove_status(String approve_status) {
		this.approve_status = approve_status;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	
	
	

}
