package com.example.test2.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(generator="increment")
    @Column(name = "adminid")
	int adminId;
    @Column(name = "firstname")
    String firstName;
    @Column(name = "middlename")
    String middleName;
    @Column(name = "lastname")
    String lastName;
    
    @Column(name = "adharcardnumber")
    long adharCardNumber;
    @Column(name = "mobilenumber")
    long mobileNumber;
    @Column(name = "password")
    String Password;
    
	public Admin(int adminId, String firstName, String middleName, String lastName, long aadharCardNumber,
			long mobileNumber, String password) {
		super();
		this.adminId = adminId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.adharCardNumber = aadharCardNumber;
		this.mobileNumber = mobileNumber;
		Password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
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
		return adharCardNumber;
	}
	public void setAadharCardNumber(long aadharCardNumber) {
		this.adharCardNumber = aadharCardNumber;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	


}
