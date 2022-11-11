package com.acc.lkm.service;

import com.acc.lkm.businessbean.AssetBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.utility.Factory;

public class EmployeeServiceImpl implements Employeeservice {

	@Override
	public Integer insertAssetwithEmployee(EmployeeBean employeeBean, AssetBean assetBean) {
		int employeeId=0;
		EmployeeDAO employeeDAO=Factory.createEmployeeDao();
		try {
			employeeId=employeeDAO.insertAssetwithEmployee(employeeBean, assetBean);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
		// TODO Auto-generated method stub
		return employeeId;
	}

}
