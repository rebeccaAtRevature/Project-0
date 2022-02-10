package dao;

import java.util.List;

import pojo.EmployeePojo;

public interface EmployeeDao {
	// Create CRUD operations
	
		// CREATE
		EmployeePojo addEmployee(EmployeePojo employeePojo);
		
		// READ
		List<EmployeePojo> fetchAllEmployees();
		EmployeePojo fetchEmployee(int employeeId);
		
		// UPDATE
		EmployeePojo updateEmployee(EmployeePojo employeePojo);
		
		// DELETE
		EmployeePojo deleteEmployee(int employeeId);
		
		CustomerPojo registerCustomer()

}
