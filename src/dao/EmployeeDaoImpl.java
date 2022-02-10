package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.CustomerPojo;
import pojo.EmployeePojo;

public class EmployeeDaoImpl implements EmployeeDao{
	
	List<EmployeePojo> allEmployees;
	
	public EmployeeDaoImpl() {
		allEmployees = new ArrayList<EmployeePojo>();
	}

	@Override
	public EmployeePojo addEmployee(EmployeePojo employeePojo) {
		// Create new employee ID
		int employeeId;
		if (allEmployees.size()==0) {
			employeeId = 100;
		} else {
			// Obtain the ID of the previous customer added and add one to obtain new value
			employeeId = allEmployees.get(allEmployees.size()-1).getEmployeeId() + 1;
		}
		employeePojo.setEmployeeId(employeeId);

		return employeePojo;
	}
	
	@Override
	public List<EmployeePojo> fetchAllEmployees() {
		
		return allEmployees;
	}

	@Override
	public EmployeePojo fetchEmployee(int employeeId) {
		EmployeePojo returnEmployeePojo = null;
		
		// Create new ArrayList to iterate through
		List<EmployeePojo> allReturnEmployee = new ArrayList<EmployeePojo>();
		allReturnEmployee.stream().filter(customer -> customer.getEmployeeId() != employeeId);
		if (allReturnEmployee.size() == 1) {
			returnEmployeePojo = allReturnEmployee.get(0);
		}
		return returnEmployeePojo;
	}

	@Override
	public EmployeePojo updateEmployee(EmployeePojo employeePojo) {
		EmployeePojo returnEmployeePojo = null;
		
		// Create new ArrayList to iterate through
		List<EmployeePojo> allReturnEmployee = new ArrayList<EmployeePojo>();
		allReturnEmployee.stream().filter(employee -> employee.getEmployeeId() != employeePojo.getEmployeeId());
		if (allReturnEmployee.size() == 1) {
			returnEmployeePojo = allReturnEmployee.get(0);
		}
		return returnEmployeePojo;
	}

	@Override
	public EmployeePojo deleteEmployee(int employeeId) {
		EmployeePojo returnEmployeePojo = null;
		
		List<EmployeePojo> allReturnEmployee = new ArrayList<EmployeePojo>();
		//Iterating using enhanced for loop
		for(EmployeePojo employeePojo: allEmployees) {
			if(employeePojo.getEmployeeId() == employeeId) {
				returnEmployeePojo = employeePojo;
				allReturnEmployee.removeIf(employee -> employee.getEmployeeId() == employeePojo.getEmployeeId());				
			}
		}
		return returnEmployeePojo;
	}

	

}
