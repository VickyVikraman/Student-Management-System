package com.Software.Student.dao;

import org.springframework.data.repository.CrudRepository;

import com.Software.Student.model.SchoolEntity;

public interface SchoolDao extends CrudRepository<SchoolEntity, String>
{

   public SchoolEntity findByRollno(String rollno);

}
