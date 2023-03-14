package com.example.test2.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import net.bytebuddy.utility.nullability.NeverNull.ByDefault;

@Entity
@Table(name = "investments")
@NamedQueries({@NamedQuery(name="getinvestmentbyid",query ="select objinvestments from Investments objinvestments where objinvestments.userid=?1" )})
public class Investments {

	
	@Column(name = "userid")
	int userid;
	@Id
	@GeneratedValue(generator="increment")
	@Column(name = "investmentid")
	int investmentid;
	@Column(name = "type")
	String type;
	@Column(name = "name")
	String name;
	@Column(name = "amount")
	long amount;
	@Column(name = "status")
	String status;

	public Investments() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Investments(String type, int userId, int investmentId, String dateOfPurchase, String name, long amount,
			String status, long sellingPrice, String dateOfsale, long gain, long loss) {
		super();
		this.type = type;
		this.userid = userId;
		this.investmentid = investmentId;
		
		this.name = name;
		this.amount = amount;
		status = status;
		
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getUserId() {
		return userid;
	}
	public void setUserId(int userId) {
		this.userid = userId;
	}
	public int getInvestmentId() {
		return investmentid;
	}
	public void setInvestmentId(int investmentId) {
		this.investmentid = investmentId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		status = status;
	}
	

	
	
	

}
