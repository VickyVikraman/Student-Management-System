package com.Software.Student.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Software.Student.Mapper.ServiceMapper;
import com.Software.Student.dao.AddressDao;
import com.Software.Student.dao.ContactDao;
import com.Software.Student.dao.SchoolDao;
import com.Software.Student.dao.UserDao;
import com.Software.Student.model.AddressEntity;
import com.Software.Student.model.ContactEntity;
import com.Software.Student.model.Profile;
import com.Software.Student.model.SchoolEntity;
import com.Software.Student.model.UserEntity;

@Component
public class RegisterServiceImpl 
{

	@Autowired
	AddressDao addressDao;
	@Autowired
	ContactDao contactDao;
	@Autowired
	UserDao userDao;
	@Autowired
	SchoolDao schoolDao;
	
	@Autowired
	ServiceMapper serviceMapper;

	public Profile save(Profile profile) 
	{
		AddressEntity addressEntity = serviceMapper.mapAddressDtls(profile.getAddress());
		addressDao.save(addressEntity);
		ContactEntity contactEntity = serviceMapper.mapContactDtls(profile.getContact());
		contactDao.save(contactEntity);
		SchoolEntity schoolEntity = serviceMapper.mapSchoolDtls(profile.getSchool());
		schoolDao.save(schoolEntity);
		UserEntity userEntity = serviceMapper.mapUserDtls(profile.getUser());
		userDao.save(userEntity);
		return null;
	}
	
}
