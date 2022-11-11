package com.acc.lkm.utility;

import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.dao.EmployeeDAOIMPL;
import com.acc.lkm.service.EmployeeServiceImpl;
import com.acc.lkm.service.Employeeservice;

public class Factory {
		public static EmployeeDAO createEmployeeDao() {
			return new EmployeeDAOIMPL();
		}
		public static Employeeservice createEmployeeService() {
			return new EmployeeServiceImpl();
		}
}
