package com.example.test2.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(generator="increment")
    @Column(name = "userid")
	int userId;
    @Column(name = "firstname")
    String firstName;
   
    @Column(name = "lastname")
    String lastName;
    
    @Column(name = "adharcardnumber")
    long aadharCardNumber;
    @Column(name = "mobilenumber")
    long mobileNumber;
    @Column(name = "password")
    String Password;
   
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int userId, String firstName, String middleName, String lastName, long aadharCardNumber,
			long mobileNumber, String password, int adminStatus, int userStatus) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		
		this.lastName = lastName;
		this.aadharCardNumber = aadharCardNumber;
		this.mobileNumber = mobileNumber;
		Password = password;
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

    
    
    
    
   }
