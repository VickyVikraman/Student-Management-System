package com.Software.Student.dao;

import org.springframework.data.repository.CrudRepository;

import com.Software.Student.model.NewUser;
import com.Software.Student.model.NewUserEntity;

public interface NewUserDao extends CrudRepository<NewUserEntity, String>
{

	public NewUserEntity findByRollno(String rollNo);
	
}
