package com.Software.Student.dao;

import org.springframework.data.repository.CrudRepository;

import com.Software.Student.model.Address;
import com.Software.Student.model.AddressEntity;

public interface AddressDao extends CrudRepository<AddressEntity, String>
{

	public AddressEntity findByRollno(String rollNo);
	
	


	

}
