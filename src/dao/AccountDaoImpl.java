package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.AccountPojo;

public class AccountDaoImpl implements AccountDao{
	
	// Collection to store data in place of SQL database
	List<AccountPojo> allAccounts;
	
	// Create construtor
	public AccountDaoImpl() {
		allAccounts = new ArrayList<>();
	}
	
	// Implemented Methods from AccountDao interface
	@Override
	public List<AccountPojo> fetchAllAccounts() {
		
		return allAccounts;
	}

	

	@Override
	public AccountPojo addAccount(AccountPojo accountPojo, double startingBalance) {
		// Generate new Account ID
		int accountId;
		if (allAccounts.size()==0) {
			accountId = 1000;
		} else {
			// Obtain the account ID of the previous account created and add one to obtain new value
			accountId = allAccounts.get(allAccounts.size()-1).getAccountId() + 1;
		}
		accountPojo.setAccountId(accountId);
		accountPojo.setBalance(startingBalance);
		return null;
	}

	@Override
	public AccountPojo fetchAccount(int accountId) {
		AccountPojo matchFound = null;
		// use for loop to check data for account with matching Id
		for (int i = 0; i < allAccounts.size(); i++) {
			if (allAccounts.get(i).getAccountId() == accountId) {
				matchFound = allAccounts.get(i);
			}
		}
		return matchFound;
	}

	@Override
	public AccountPojo updateAccount(AccountPojo accountPojo) {
		AccountPojo matchFound = null;
		// use for loop to check data for account with matching Id
		for (int i = 0; i < allAccounts.size(); i++) {
			if (allAccounts.get(i).getAccountId() == accountPojo.getAccountId()) {
				// If ID is a match, replace POJO
				allAccounts.set(i, accountPojo);
				// Send updated object to service layer
				matchFound = allAccounts.get(i);
			}
		}
		return matchFound;
	}

	@Override
	public AccountPojo deleteAccount(int accountId) {
		AccountPojo matchFound = null;
		// iterate through allAccounts to find matching ID, then delete matching object
		for (int i = 0; i < allAccounts.size(); i++) {
			if (allAccounts.get(i).getAccountId() == accountId) {
				matchFound = allAccounts.get(i);
				allAccounts.remove(i);
			}
		}
		return matchFound;
	}

}
