package service;

import java.util.List;

import pojo.CustomerPojo;

public interface CustomerService {
	
		CustomerPojo addCustomer(CustomerPojo customerPojo);

		List<CustomerPojo> fetchAllCutomers();
		CustomerPojo fetchCustomer(int customerId);

		CustomerPojo updateCustomer(CustomerPojo customerPojo);
		
		CustomerPojo deleteCustomer(int customerId);

}
