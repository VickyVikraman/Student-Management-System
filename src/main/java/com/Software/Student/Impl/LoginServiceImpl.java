package com.Software.Student.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Software.Student.Mapper.ServiceMapper;
import com.Software.Student.dao.LoginDao;
import com.Software.Student.dao.NewUserDao;
import com.Software.Student.model.Login;
import com.Software.Student.model.NewUser;
import com.Software.Student.model.NewUserEntity;
import com.Software.Student.model.StudentLogin;

@Component
public class LoginServiceImpl {
	
	@Autowired
	private LoginDao loginDao;
	
	@Autowired
	private NewUserDao newUserDao;
	
	@Autowired
	private ServiceMapper loginMap;
	
	public Login checkUserId(String rollNo, String password) {
		Login login=new Login();
		StudentLogin studentLogin = loginDao.findByRollnoAndPassword(rollNo, password);
		NewUserEntity newUser = newUserDao.findByRollno(rollNo);
		login=loginMap.mapLoginDetails(studentLogin,newUser);
		return login;
	}
}
