package com.Software.Student.dao;

import org.springframework.data.repository.CrudRepository;

import com.Software.Student.model.StudentLogin;

public interface LoginDao extends CrudRepository<StudentLogin, String>
{	
	public StudentLogin findByRollnoAndPassword(String rollNumber, String password);
	
	
}
