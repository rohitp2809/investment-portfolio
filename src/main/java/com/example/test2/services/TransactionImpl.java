package com.example.test2.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test2.dto.InvestmentsDTO;
import com.example.test2.dto.TransactionsDTO;
import com.example.test2.pojo.Investments;
import com.example.test2.pojo.Transactions;
import com.example.test2.repository.TransactionsRepository;
@Service
public class TransactionImpl implements TransactionServices{
	 @Autowired
	 SessionFactory sessionfactory;
	 @Autowired
TransactionsRepository repositoryTransaction;
	@Override
	public String addTransaction(TransactionsDTO objTransaction) {
		Transactions entityTransaction= new Transactions();
		
		BeanUtils.copyProperties(objTransaction,entityTransaction);
		repositoryTransaction.save(entityTransaction);
        return "transaction Added";
	}

	@Override
	public List<Transactions> getTransaction(int userid) {
		try (Session objSession = sessionfactory.openSession()) {
			Query objQuery=objSession.getNamedQuery("gettransactionbyid");
			objQuery.setParameter(1, userid);
		List<Transactions> result=(List<Transactions>) objQuery.getResultList();
			return (List<Transactions>) result;
		} catch (HibernateException e) {
			return null;
			
		}
	}
	@Override
	public String removeTransaction(int transactionid) {
		  repositoryTransaction.deleteById(transactionid);
		  return "investment removed";
}
}