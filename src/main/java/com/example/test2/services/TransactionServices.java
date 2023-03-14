package com.example.test2.services;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.test2.dto.TransactionsDTO;
import com.example.test2.pojo.Transactions;
public interface TransactionServices {
	public String addTransaction(@RequestBody TransactionsDTO objTransaction);
	 public List<Transactions> getTransaction(@PathVariable("userId") int userid);
	String removeTransaction(@PathVariable("transactionid") int transactionid);

}
