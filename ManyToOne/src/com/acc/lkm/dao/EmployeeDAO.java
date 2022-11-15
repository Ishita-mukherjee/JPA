package com.acc.lkm.dao;

import com.acc.lkm.businessbean.DepartmentBean;
import com.acc.lkm.businessbean.EmployeeBean;

public interface EmployeeDAO {
	
	public Integer insertEmployeeAndDepartment(EmployeeBean employee, EmployeeBean employee2, DepartmentBean d) throws Exception;
	
}