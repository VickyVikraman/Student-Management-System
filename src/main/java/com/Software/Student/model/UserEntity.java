package com.Software.Student.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="user_details")
@Table(name="user_details")
public class UserEntity 
{
	
	
	@Id
	private String rollno;
	
	@Column(name="name")
	private String name;
	
//	@Column(name="dateofbirth")
//	private Date dateOfBirth;
//	
//	public Date getDateOfBirth() {
//		return dateOfBirth;
//	}
//	public void setDateOfBirth(Date dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="modeofaddmission")
	private String modeOfAdd;
	
	@Column(name="aadhaarno")
	private String aadhaarNo;
	
	@Column(name="accountno")
	private String accountNo;
	
	@Column(name="hostel")
	private String hostel;
	
	@Column(name="hostelname")
	private String hostelName;
	
	@Column(name="roomno")
	private int roomNo;
	
	@Column(name="bus")
	private String bus;
	
	@Column(name="boardfrom")
	private String boardFrom;
	
	@Column(name="busno")
	private int busNo;
	
	@Column(name="profilepicture")
	private String profilePicture;
	
	@Column(name="personalmail")
	private String personalMail;
	
	@Column(name="kongumail")
	private String konguMail;
	
	@Column(name="currentsem")
	private int currentSem;
	
	@Column(name="community")
	private String community;
	
	@Column(name="caste")
	private String caste;
	
	@Column(name="blood")
	private String blood;
	
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
//	public String getDateOfBirth() {
//		return dateOfBirth;
//	}
//	public void setDateOfBirth(String dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getModeOfAdd() {
		return modeOfAdd;
	}
	public void setModeOfAdd(String modeOfAdd) {
		this.modeOfAdd = modeOfAdd;
	}
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getHostel() {
		return hostel;
	}
	public void setHostel(String hostel) {
		this.hostel = hostel;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getBus() {
		return bus;
	}
	public void setBus(String bus) {
		this.bus = bus;
	}
	public String getBoardFrom() {
		return boardFrom;
	}
	public void setBoardFrom(String boardFrom) {
		this.boardFrom = boardFrom;
	}
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public String getPersonalMail() {
		return personalMail;
	}
	public void setPersonalMail(String personalMail) {
		this.personalMail = personalMail;
	}
	public String getKonguMail() {
		return konguMail;
	}
	public void setKonguMail(String konguMail) {
		this.konguMail = konguMail;
	}
	public int getCurrentSem() {
		return currentSem;
	}
	public void setCurrentSem(int currentSem) {
		this.currentSem = currentSem;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	
	
}
