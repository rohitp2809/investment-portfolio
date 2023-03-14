package com.example.test2.dto;

public class AdminDTO {
	String firstName;
	String middleName;
	String lastName;
	long aadharCardNumber;
	long mobileNumber;
	String emailId;
	String Password;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getAadharCardNumber() {
		return aadharCardNumber;
	}
	public void setAadharCardNumber(long aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public AdminDTO(String firstName, String middleName, String lastName, long aadharCardNumber, long mobileNumber,
			String emailId, String password, int adminId) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.aadharCardNumber = aadharCardNumber;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		Password = password;
		this.adminId = adminId;
	}
	int adminId;
	public AdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
