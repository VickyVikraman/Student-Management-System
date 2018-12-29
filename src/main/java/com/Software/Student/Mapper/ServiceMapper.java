package com.Software.Student.Mapper;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import com.Software.Student.dao.OdDao;
import com.Software.Student.model.Address;
import com.Software.Student.model.AddressEntity;
import com.Software.Student.model.Contact;
import com.Software.Student.model.ContactEntity;
import com.Software.Student.model.Login;
import com.Software.Student.model.NewUserEntity;
import com.Software.Student.model.Od_Details;
import com.Software.Student.model.OnDuty;
import com.Software.Student.model.School;
import com.Software.Student.model.SchoolEntity;
import com.Software.Student.model.StudentLogin;
import com.Software.Student.model.User;
import com.Software.Student.model.UserEntity;

@Component
public class ServiceMapper {

	public Login mapLoginDetails(StudentLogin studentLogin, NewUserEntity newUser) {
		Login login = new Login();
		if(studentLogin != null ) {
			login.setRollNumber(studentLogin.getRollno());
			login.setSuccess(true);
			if(newUser.getRegistered().equals("YES"))
			{
				login.setNewUser(true);
			}
			else
			{
				login.setNewUser(false);
			}
			login.setStatus(studentLogin.getStatus());
		}
		return login;
	}
	
	public AddressEntity mapAddressDtls(Address address) {
		AddressEntity addressEntity = null;
		if(null!= address) {
			addressEntity = new AddressEntity();
			addressEntity.setRollno(address.getRollno());
			addressEntity.setCcity(address.getCcity());
			addressEntity.setCity(address.getCity());
			addressEntity.setPermanentAdd(address.getPermanentAdd());
			addressEntity.setCommunicationAdd(address.getCommunicationAdd());
			addressEntity.setCstate(address.getCstate());
			addressEntity.setCzip(address.getCzip());
			addressEntity.setNativePlace(address.getNativePlace());
			addressEntity.setState(address.getState());
			addressEntity.setZip(address.getZip());
		}
		return addressEntity;
	}

	public ContactEntity mapContactDtls(Contact contact) 
	{
		ContactEntity contactEntity = null;
		if(null != contact)
		{
			contactEntity = new ContactEntity();
			contactEntity.setRollno(contact.getRollno());
			contactEntity.setFatherIncome(contact.getFatherIncome());
			contactEntity.setFatherMobile(contact.getFatherMobile());
			contactEntity.setFatherName(contact.getFatherName());
			contactEntity.setFatherOccupation(contact.getFatherOccupation());
			contactEntity.setMotherIncome(contact.getMotherIncome());
			contactEntity.setMotherMobile(contact.getMotherMobile());
			contactEntity.setMotherName(contact.getMotherName());
			contactEntity.setMotherOccupation(contact.getMotherOccupation());
		}
		return contactEntity;
	}

	public SchoolEntity mapSchoolDtls(School school) {
		SchoolEntity schoolEntity = null;
		if(school != null)
		{
			schoolEntity = new SchoolEntity();
			schoolEntity.setRollno(school.getRollno());
			schoolEntity.setSslc(school.getSslc());
			schoolEntity.setSslcPercentage(school.getSslcPercentage());
			schoolEntity.setSslcPassing(school.getSslcPassing());
			schoolEntity.setHsc(school.getHsc());
			schoolEntity.setHscPercentage(school.getHscPassing());
			schoolEntity.setHscPassing(school.getHscPassing());
			schoolEntity.setDiploma(school.getDiploma());
			schoolEntity.setDiplomaPercentage(school.getDiplomaPercentage());
			schoolEntity.setDiplomaPassing(school.getDiplomaPassing());
		}
		return schoolEntity;
	}
	public UserEntity mapUserDtls(User user) {
		UserEntity userEntity = null;
		if(user != null)
		{
			userEntity = new UserEntity();
			userEntity.setRollno(user.getRollno());
			userEntity.setAadhaarNo(user.getAadhaarNo());
			userEntity.setAccountNo(user.getAccountNo());
			userEntity.setAge(user.getAge());
			userEntity.setBlood(user.getBlood());
			userEntity.setBoardFrom(user.getBoardFrom());
			userEntity.setBus(user.getBus());
			userEntity.setBusNo(user.getBusNo());
			userEntity.setCaste(user.getCaste());
			userEntity.setCommunity(user.getCommunity());
			userEntity.setCurrentSem(user.getCurrentSem());
//			userEntity.setDateOfBirth(user.getDateOfBirth());
			userEntity.setGender(user.getGender());
			userEntity.setHostel(user.getHostel());
			userEntity.setHostelName(user.getHostelName());
			userEntity.setRoomNo(user.getRoomNo());
			userEntity.setKonguMail(user.getKonguMail());
			userEntity.setPersonalMail(user.getPersonalMail());
			userEntity.setModeOfAdd(user.getModeOfAdd());
			userEntity.setName(user.getName());
			userEntity.setProfilePicture(user.getProfilePicture());
		}
		return userEntity;
	}
	public Address mapUpdateAddressDtls(AddressEntity addressEntity) 
	{
		Address address = new Address();
		if(addressEntity != null)
		{
			address.setRollno(addressEntity.getRollno());
			address.setCommunicationAdd(addressEntity.getCommunicationAdd());
			address.setCcity(addressEntity.getCcity());
			address.setCstate(addressEntity.getCstate());
			address.setCzip(addressEntity.getCzip());
			address.setPermanentAdd(addressEntity.getPermanentAdd());
			address.setState(addressEntity.getState());
			address.setZip(address.getZip());
			address.setCity(addressEntity.getCity());
			address.setNativePlace(addressEntity.getNativePlace());
		}
		return address;
	}
	public Contact mapUpdateContactDtls(ContactEntity contactEntity) 
	{
		Contact contact = new Contact();
		if(contactEntity != null)
		{
			contact.setRollno(contactEntity.getRollno());
			contact.setFatherIncome(contactEntity.getFatherIncome());
			contact.setFatherMobile(contactEntity.getFatherMobile());
			contact.setFatherName(contactEntity.getFatherName());
			contact.setFatherOccupation(contactEntity.getFatherOccupation());
			contact.setMotherIncome(contactEntity.getMotherIncome());
			contact.setMotherMobile(contactEntity.getMotherMobile());
			contact.setMotherName(contactEntity.getMotherName());
			contact.setMotherOccupation(contactEntity.getMotherOccupation());
		}
		return contact;
	}

	public School mapUpdateSchoolDtls(SchoolEntity schoolEntity) 
	{
		School school = new School();
		if(schoolEntity != null)
		{
			school.setRollno(schoolEntity.getRollno());
			school.setSslc(schoolEntity.getSslc());
			school.setSslcPercentage(schoolEntity.getSslcPercentage());
			school.setSslcPassing(schoolEntity.getSslcPassing());
			school.setHsc(schoolEntity.getHsc());
			school.setHscPercentage(schoolEntity.getHscPercentage());
			school.setHscPassing(schoolEntity.getHscPassing());
			school.setDiploma(schoolEntity.getDiploma());
			school.setDiplomaPercentage(schoolEntity.getDiplomaPercentage());
			school.setDiplomaPassing(schoolEntity.getDiplomaPassing());
		}
		return school;
	}

	public User mapUpdateUserDtls(UserEntity userEntity) 
	{
		User user = new User();
		if(userEntity != null)
		{
			user.setRollno(userEntity.getRollno());
			user.setAadhaarNo(userEntity.getAadhaarNo());
			user.setAccountNo(userEntity.getAccountNo());
			user.setAge(userEntity.getAge());
			user.setBlood(userEntity.getBlood());
			user.setBoardFrom(userEntity.getBoardFrom());
			user.setBus(userEntity.getBus());
			user.setBusNo(userEntity.getBusNo());
			user.setCaste(userEntity.getCaste());
			user.setCommunity(userEntity.getCommunity());
			user.setCurrentSem(userEntity.getCurrentSem());
//			user.setDateOfBirth(userEntity.getDateOfBirth());
			user.setGender(userEntity.getGender());
			user.setHostel(userEntity.getHostel());
			user.setHostelName(userEntity.getHostelName());
			user.setRoomNo(userEntity.getRoomNo());
			user.setKonguMail(userEntity.getKonguMail());
			user.setPersonalMail(userEntity.getPersonalMail());
			user.setModeOfAdd(userEntity.getModeOfAdd());
			user.setName(userEntity.getName());
			user.setProfilePicture(userEntity.getProfilePicture());
		}
		return user;
	}
	public Od_Details mapOnDutyDetails(OnDuty onduty)
	{
        Od_Details odDetails=new Od_Details();
        if(onduty!=null)
        {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            System.out.println(timestamp);
            odDetails.setOdid(timestamp);
            odDetails.setFrom_date(onduty.getFrom_date());
            odDetails.setTo_date(onduty.getTo_date());
            odDetails.setRollno(onduty.getRollno());
            odDetails.setName(onduty.getName());
            odDetails.setEvent(onduty.getEvent());
            odDetails.setTitle(onduty.getTitle());
            odDetails.setVenue(onduty.getVenue());
            odDetails.setPeriods(onduty.getPeriods());
            odDetails.setHours(onduty.getHours());
        }
		return odDetails;
		
	}
	public OnDuty mapAppliedOndutyDetails(Od_Details odDetails)
	{
		OnDuty onDuty=new OnDuty();
		if(odDetails!=null)
		{
			onDuty.setRollno(odDetails.getRollno());
			onDuty.setName(odDetails.getName());
			onDuty.setFrom_date(odDetails.getFrom_date());
			onDuty.setTo_date(odDetails.getTo_date());
			onDuty.setEvent(odDetails.getEvent());
			onDuty.setVenue(odDetails.getVenue());
			onDuty.setTitle(odDetails.getTitle());
			onDuty.setPeriods(odDetails.getPeriods());
			onDuty.setHours(odDetails.getHours());
		}
		return onDuty;
	}
}
