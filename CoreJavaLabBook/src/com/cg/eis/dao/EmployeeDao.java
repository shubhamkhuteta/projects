package com.cg.eis.dao;

import java.util.HashMap;


import com.cg.eis.bean.Employee;

public class EmployeeDao {

	HashMap<String, Object> hm = new HashMap<String, Object>();
	Employee emp = new Employee();
	
	public boolean setData(String id, Employee emp) {
		hm.put(id, emp);
		return true;
	}

	public Employee getInfo(String id) {
		if(hm.containsKey(id)) {

			emp=(Employee) hm.get(id);
			emp.getId();
			emp.getName();
			emp.getSalary();
			emp.getDesignation();
			emp.getInsuranceScheme();
			
		}
		return emp;
	}

}
