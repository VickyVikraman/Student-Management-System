package com.Software.Student.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Software.Student.model.Od_Details;

public interface OdDao extends CrudRepository<Od_Details,String>
{	
	List<Od_Details> findAllByRollno(String rollno);
}
