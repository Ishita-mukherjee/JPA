package com.acc.lkm.UI;

import java.util.Date;

import com.acc.lkm.businessbean.AssetBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.service.Employeeservice;
import com.acc.lkm.utility.Factory;
import com.acc.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			insertAssetwithEmployee();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			JPAUtility.closeEntityManagerFactory();
		}

	}

	private static void insertAssetwithEmployee() {
		int employeeId=0;
		try {
			Employeeservice employeeservice=Factory.createEmployeeService();
			EmployeeBean employeeBean=new EmployeeBean();
			employeeBean.setEmployeeName("Akshay Singh");
			employeeBean.setRole("Manager");
			employeeBean.setSalary(170000.00);
			employeeBean.setInsertTime(new Date());
			AssetBean assetBean=new AssetBean();
			assetBean.setAssetName("Laptop");
			assetBean.setAssetBrandName("DELL");
			assetBean.setValidity(7);
			employeeId=employeeservice.insertAssetwithEmployee(employeeBean, assetBean);
			System.out.println("Employee Inserted Successfully");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
