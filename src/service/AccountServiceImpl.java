package service;

import java.util.List;

import dao.AccountDao;
import dao.AccountDaoImpl;
import pojo.AccountPojo;

public class AccountServiceImpl implements AccountService{
	
	// Create a data access object to call to the data access layer
	AccountDao accountDao;
	
	
	// Constructor takes no arguments and instantiates a data access object
	public AccountServiceImpl() {
		accountDao = new AccountDaoImpl();
	}

	// Until further notice, use every method to call the DAO layer
	@Override
	public List<AccountPojo> fetchAllAccounts() {
		
		return accountDao.fetchAllAccounts();
	}

	@Override
	public AccountPojo addAccount(AccountPojo accountPojo, double startingBalance) {
		
		return accountDao.addAccount(accountPojo, startingBalance);
	}

	@Override
	public AccountPojo fetchAccount(int accountId) {
		
		return accountDao.fetchAccount(accountId);
	}

	@Override
	public AccountPojo updateAccount(AccountPojo accountPojo) {
		
		return accountDao.updateAccount(accountPojo);
	}

	@Override
	public AccountPojo deleteAccount(int accountId) {
		
		return accountDao.deleteAccount(accountId);
	}

}
