package dao;

import java.util.List;

import pojo.CustomerPojo;

public interface CustomerDao {
	
	// Create CRUD operations
	
	// CREATE
	CustomerPojo addCustomer(CustomerPojo customerPojo);
	
	// READ
	List<CustomerPojo> fetchAllCutomers();
	CustomerPojo fetchCustomer(int customerId);
	
	// UPDATE
	CustomerPojo updateCustomer(CustomerPojo customerPojo);
	
	// DELETE
	CustomerPojo deleteCustomer(int customerId);
	
	
}
