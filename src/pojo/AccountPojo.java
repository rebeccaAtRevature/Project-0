package pojo;

public class AccountPojo {
	
	// Object Properties
	private int accountId;
	private double balance;
	private String accountType;
	
	// Constructor from fields
	public AccountPojo(double balance, String userName, int userPhoneNumber, String accountType) {
		this.balance = balance;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.accountType = accountType;
	}

	// Getters and Setters
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(int userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	

}
