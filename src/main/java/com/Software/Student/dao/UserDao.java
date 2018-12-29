package com.Software.Student.dao;

import org.springframework.data.repository.CrudRepository;

import com.Software.Student.model.UserEntity;

public interface UserDao extends CrudRepository<UserEntity,String>
{

	public UserEntity findByRollno(String rollno);

}
