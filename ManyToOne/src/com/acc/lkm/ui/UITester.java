package com.acc.lkm.ui;

import com.acc.lkm.businessbean.DepartmentBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.service.EmployeeService;
import com.acc.lkm.utility.Factory;
import com.acc.lkm.utility.JPAUtility;

public class UITester {

	public static void main(String[] args) {
		try {
			insertEmployeeAndDepartment();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			JPAUtility.closeEntityManagerFactory();
		}
	}

	static void insertEmployeeAndDepartment() {
		try {
		EmployeeService service = Factory.createEmployeeService();
		
		DepartmentBean department = new DepartmentBean();
		department.setDepartmentName("LKM");
		department.setCity("Hyderabad");
		
		EmployeeBean employee1 =  new EmployeeBean();
		employee1.setEmployeeName("Rohit");
		employee1.setRole("Sr.Analyst");
		
		EmployeeBean employee2 =  new EmployeeBean();
		employee2.setEmployeeName("Kumar");
		employee2.setRole("Analyst");
		
		service.insertEmployeeAndDepartment(employee1, employee2, department);
		System.out.println("success- done!!");		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
