package com.stackroute.repo;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.model.Employee;

public class EmployeeRepository {
	private List<Employee> employees;
	
	public EmployeeRepository() {
		employees = new ArrayList<Employee>();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		for(Employee e : employees) {
			if(e.getEmployeeId() == empId) {
				employees.remove(e);
				return true;
			}
		}
		return false;
	}
}
