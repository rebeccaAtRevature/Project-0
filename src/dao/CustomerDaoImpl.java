package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.CustomerPojo;

public class CustomerDaoImpl implements CustomerDao{
	
	List<CustomerPojo> allCustomers;
	
	// Constructor
	public CustomerDaoImpl() {
		allCustomers = new ArrayList<CustomerPojo>();
	}
	
	@Override
	public CustomerPojo addCustomer(CustomerPojo customerPojo) {
		// Create new customer ID
		int customerId;
		if (allCustomers.size()==0) {
			customerId = 100;
		} else {
			// Obtain the ID of the previous customer added and add one to obtain new value
			customerId = allCustomers.get(allCustomers.size()-1).getCustomerId() + 1;
		}
		customerPojo.setCustomerId(customerId);
		
		return customerPojo;
	}

	@Override
	public List<CustomerPojo> fetchAllCutomers() {
		
		return allCustomers;
	}

	@Override
	public CustomerPojo fetchCustomer(int customerId) {
		CustomerPojo returnCustomerPojo = null;
		
		// Create new ArrayList to iterate through
		List<CustomerPojo> allReturnCustomer = new ArrayList<CustomerPojo>(allCustomers);
		allReturnCustomer.stream().filter(customer -> customer.getCustomerId() != customerId);
		if (allReturnCustomer.size() == 1) {
			returnCustomerPojo = allReturnCustomer.get(0);
		}
		return returnCustomerPojo;
	}

	@Override
	public CustomerPojo updateCustomer(CustomerPojo customerPojo) {
		CustomerPojo returnCustomerPojo = null;
		
		// Create new ArrayList to iterate through
		List<CustomerPojo> allReturnCustomer = new ArrayList<CustomerPojo>();
		allReturnCustomer.stream().filter(customer -> customer.getCustomerId() != customerPojo.getCustomerId());
		if (allReturnCustomer.size() == 1) {
			returnCustomerPojo = allReturnCustomer.get(0);
		}
		return returnCustomerPojo;
	}

	@Override
	public CustomerPojo deleteCustomer(int customerId) {
		CustomerPojo returnCustomerPojo = null;
		
		List<CustomerPojo> allReturnCustomer = new ArrayList<CustomerPojo>();
		//Iterating using enhanced for loop
		for(CustomerPojo customerPojo: allCustomers) {
			if(customerPojo.getCustomerId() == customerId) {
				returnCustomerPojo = customerPojo;
				allReturnCustomer.removeIf(customer -> customer.getCustomerId() == customerPojo.getCustomerId());				
			}
		}
		return returnCustomerPojo;
	}
	
}
