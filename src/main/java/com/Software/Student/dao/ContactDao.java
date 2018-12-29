package com.Software.Student.dao;

import org.springframework.data.repository.CrudRepository;

import com.Software.Student.model.ContactEntity;

public interface ContactDao extends CrudRepository<ContactEntity,String>
{

 	public ContactEntity findByRollno(String rollno);

}
