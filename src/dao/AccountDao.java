package dao;

import java.util.List;

import pojo.AccountPojo;

public interface AccountDao {
	// Include CRUD operations
	
	List<AccountPojo> fetchAllAccounts();
	
	// Create
	AccountPojo addAccount(AccountPojo accountPojo, double startingBalance);
	// Read
	AccountPojo fetchAccount(int accountId);
	// Update
	AccountPojo updateAccount(AccountPojo accountPojo);
	// Delete
	AccountPojo deleteAccount(int accountId);
		
}
