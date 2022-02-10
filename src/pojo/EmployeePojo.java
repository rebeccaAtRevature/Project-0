package pojo;

public class EmployeePojo {
	
	int employeeId;
	String employeeFirstName;
	String employeeLastName;
	String password;
	String employeePhoneNumber;
	String employeeAddress;
	
	
	public EmployeePojo(String employeeFirstName, String employeeLastName, String password) {
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.password = password;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
