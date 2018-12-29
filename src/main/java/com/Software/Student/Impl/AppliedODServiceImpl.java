package com.Software.Student.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Software.Student.Mapper.ServiceMapper;
import com.Software.Student.dao.OdDao;
import com.Software.Student.model.Od_Details;
import com.Software.Student.model.OnDuty;

@Component
public class AppliedODServiceImpl 
{
	@Autowired
	OdDao odDao;
	@Autowired
	ServiceMapper onDutyMapper;
	
	public OnDuty[] fetchByRollNo(String rollno)
	{
		List<Od_Details> odList=new ArrayList<>();
		odDao.findAllByRollno(rollno).forEach(e->odList.add(e));
		System.out.println(odDao);
		OnDuty[] onduty=new OnDuty[odList.size()];
		int i=0;
		for(Od_Details list:odList)
		{
			onduty[i]=onDutyMapper.mapAppliedOndutyDetails(odList.get(i));
			i++;
		}
		return onduty;
	}
}
