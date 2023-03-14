package com.example.test2.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "transactions")
@NamedQueries({
		@NamedQuery(name = "gettransactionbyid", query = "select objtransactions from Transactions objtransactions where objtransactions.userid=?1") })
public class Transactions {
	@Id
	@GeneratedValue(generator = "increment")
	int transactionid;
	@Column(name = "userid")
	int userid;

	@Column(name = "name")
	String name;

	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "amount")
	long amount;
	@Column(name = "amountsold")
	long amountsold;

	@Column(name = "gain", columnDefinition = "integer default 0")
	long gain;

	@Column(name = "loss", columnDefinition = "integer default 0")
	long loss;

	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transactions(int userid, int investmentid, String dateofsale, long amount, long amountsold, long gain,
			long loss) {
		super();
		this.userid = userid;

		this.amount = amount;
		this.amountsold = amountsold;
		this.gain = gain;
		this.loss = loss;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getAmountsold() {
		return amountsold;
	}

	public void setAmountsold(long amountsold) {
		this.amountsold = amountsold;
	}

	public long getGain() {
		return gain;
	}

	public void setGain(long gain) {
		this.gain = gain;
	}

	public long getLoss() {
		return loss;
	}

	public void setLoss(long loss) {
		this.loss = loss;
	}

}
