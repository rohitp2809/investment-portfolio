package com.example.test2.dto;

public class TransactionsDTO {
	int transactionid;
	int userid;

	String name;

	long amount;

	long amountsold;
	long gain;

	long loss;

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
