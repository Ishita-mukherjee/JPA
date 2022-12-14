package com.acc.lkm.service;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.businessbean.MeetingBean;
import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.utility.Factory;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Integer insertEmployeeAndMeetings(EmployeeBean employeeBean1,EmployeeBean employeeBean2, MeetingBean m1, MeetingBean m2) throws Exception{
		int employeeId = 0;
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		try {
			employeeId = employeeDAO.insertEmployeeAndMeetings(employeeBean1, employeeBean2, m1, m2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return employeeId;
	}

	@Override
	public void deletingEmployeeAndMeeting(EmployeeBean employeeBean1)
			throws Exception {
		EmployeeDAO employeeDAO = Factory.createEmployeeDAO();
		try {
			 employeeDAO.deletingEmployeeAndMeeting(employeeBean1);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	
	
	
}
