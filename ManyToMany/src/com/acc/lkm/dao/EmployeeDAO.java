package com.acc.lkm.dao;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.businessbean.MeetingBean;

public interface EmployeeDAO {
	
	public Integer insertEmployeeAndMeetings(EmployeeBean employeeBean1,EmployeeBean employeeBean2, MeetingBean m1, MeetingBean m2) throws Exception;

	public void deletingEmployeeAndMeeting(EmployeeBean employeeBean1)
			throws Exception;
	
}
