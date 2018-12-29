package com.Software.Student.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Software.Student.Mapper.ServiceMapper;
import com.Software.Student.dao.OdDao;
import com.Software.Student.model.Od_Details;
import com.Software.Student.model.OnDuty;

@Component
public class OnDutyServiceImpl 
{
	@Autowired
	OdDao odDao;
	
	@Autowired
	ServiceMapper serviceMapper;
	
	public void applyOnDuty(OnDuty onduty)
	{
		
		Od_Details od_Details=serviceMapper.mapOnDutyDetails(onduty);
		odDao.save(od_Details);
		
	}
}
