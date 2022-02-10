package service;

import java.util.List;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import pojo.CustomerPojo;

public class CustomerServiceImpl implements CustomerService{
	
	// Create an object to call the DAO layer
	CustomerDao customerDao = new CustomerDaoImpl();
	
	@Override
	public CustomerPojo addCustomer(CustomerPojo customerPojo) {
		
		return customerDao.addCustomer(customerPojo);
	}

	@Override
	public List<CustomerPojo> fetchAllCutomers() {
		
		return customerDao.fetchAllCutomers();
	}

	@Override
	public CustomerPojo fetchCustomer(int customerId) {
		
		return customerDao.fetchCustomer(customerId);
	}

	@Override
	public CustomerPojo updateCustomer(CustomerPojo customerPojo) {
		
		return customerDao.updateCustomer(customerPojo);
	}

	@Override
	public CustomerPojo deleteCustomer(int customerId) {
		
		return customerDao.deleteCustomer(customerId);
	}

}
