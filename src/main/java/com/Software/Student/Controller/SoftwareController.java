package com.Software.Student.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Software.Student.Impl.AppliedODServiceImpl;
import com.Software.Student.Impl.LoginServiceImpl;
import com.Software.Student.Impl.OnDutyServiceImpl;
import com.Software.Student.Impl.RegisterServiceImpl;
import com.Software.Student.Impl.UpdateServiceImpl;
import com.Software.Student.model.Login;
import com.Software.Student.model.OnDuty;
import com.Software.Student.model.Profile;

@RestController
//@SessionAttributes("loginId")
public class SoftwareController 
{
	@Autowired
	LoginServiceImpl loginService;

	@RequestMapping(value="/check")
	public Login check(@RequestParam String rollno,@RequestParam String password)
	{	
		Login login = loginService.checkUserId(rollno, password);
		return login;
	}

	@Autowired
	RegisterServiceImpl registerService;
	
	
	@RequestMapping(value="/register")
	public Profile saveDetails(@RequestBody Profile profile)
	{
		System.out.println(profile.getAddress().getRollno());
		profile=registerService.save(profile);
		return profile;
	}
	
	
	@Autowired
	UpdateServiceImpl updateService;
	
	@RequestMapping(value="/update")
	public Profile update(@RequestParam String rollno)
	{
		Profile profile=new Profile();
		System.out.println(rollno);
		profile=updateService.fetchByRollNo(rollno);
		System.out.println(profile.getUser().getRollno());
		return profile;
	}
	
	@RequestMapping(value="/details")
	public Profile getAllDetails(@RequestParam String rollno)
	{
//		System.out.println(rollno);
		Profile profile=new Profile();
		profile=updateService.fetchByRollNo(rollno);
//		System.out.println(profile);
		return profile;
	}
	
	@Autowired
	OnDutyServiceImpl onDutyService;
	
	@RequestMapping(value="/apply")
	public OnDuty applyOnDuty(@RequestBody OnDuty onduty)
	{
		System.out.println(onduty.getHours());
		System.out.println(onduty.getEvent());
		System.out.println(onduty);
		onDutyService.applyOnDuty(onduty);
//		System.out.println(onduty);
		return onduty;
		
	}
	
	@Autowired
	AppliedODServiceImpl appliedOD;
	@RequestMapping(value="/appliedOD")
	public OnDuty[] getOdDetails(@RequestParam String rollno)
	{
		return appliedOD.fetchByRollNo(rollno);
	}
}
