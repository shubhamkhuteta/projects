package com.cg.eis.service;


import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDao;

public class EmployeeService {

	Employee emp =  new Employee();
	EmployeeDao empDao = new EmployeeDao();
	
	public boolean setEmpDetails(String id, String name, double salary, String designation, String insuranceScheme) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDesignation(designation);
		emp.setInsuranceScheme(insuranceScheme);

		boolean res = empDao.setData(id,emp);
		return res;
		
	}

	public Employee getInfo(String id) {
		return emp = empDao.getInfo(id);
		
	}



	
}
