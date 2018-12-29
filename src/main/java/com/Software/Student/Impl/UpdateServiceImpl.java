package com.Software.Student.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Software.Student.Mapper.ServiceMapper;
import com.Software.Student.dao.AddressDao;
import com.Software.Student.dao.ContactDao;
import com.Software.Student.dao.SchoolDao;
import com.Software.Student.dao.UserDao;
import com.Software.Student.model.Address;
import com.Software.Student.model.AddressEntity;
import com.Software.Student.model.Contact;
import com.Software.Student.model.ContactEntity;
import com.Software.Student.model.Profile;
import com.Software.Student.model.School;
import com.Software.Student.model.SchoolEntity;
import com.Software.Student.model.User;
import com.Software.Student.model.UserEntity;


@Component	
public class UpdateServiceImpl
{
	@Autowired
	AddressDao addressDao;
	@Autowired
	ContactDao contactDao;
	@Autowired
	SchoolDao schoolDao;
	@Autowired
	UserDao userDao;
	
	@Autowired
	ServiceMapper updateMapper;
	
	public Profile fetchByRollNo(String rollno)
	{
		Profile profile = new Profile();
		Address address =  new Address();
		AddressEntity addressEntity = addressDao.findByRollno(rollno);
//		System.out.println(addressDao.findByRollno(rollno).getRollno());
		address = updateMapper.mapUpdateAddressDtls(addressEntity);
		
		Contact contact = new Contact();
		ContactEntity contactEntity = contactDao.findByRollno(rollno);
//		System.out.println(contactDao.findByRollno(rollno).getFatherName());
		contact = updateMapper.mapUpdateContactDtls(contactEntity);
		
		School school = new School();
		SchoolEntity schoolEntity = schoolDao.findByRollno(rollno);
		school = updateMapper.mapUpdateSchoolDtls(schoolEntity);
		
		User user = new User();
		UserEntity userEntity = userDao.findByRollno(rollno);
		user = updateMapper.mapUpdateUserDtls(userEntity);
		
		profile.setAddress(address);
		profile.setContact(contact);
		profile.setSchool(school);
		profile.setUser(user);
		return profile;
	}

}
