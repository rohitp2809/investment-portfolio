package com.example.test2.services;

import com.example.test2.dto.InvestmentsDTO;
import com.example.test2.dto.UsersDTO;
import com.example.test2.pojo.Investments;
import com.example.test2.pojo.Users;
import com.example.test2.repository.*;

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

@Service
public class InvestmentsServiceImpl implements InvestmentsServices{
	 @Autowired
	 SessionFactory sessionfactory;
	 @Autowired
	 InvestmentsRepository repositoryInvestments;
	 
	@Override
	public String addInvestments(InvestmentsDTO objInvestments) {
		Investments entityInvestments= new Investments();
		BeanUtils.copyProperties(objInvestments,entityInvestments);
        repositoryInvestments.save(entityInvestments);
        return "Investments Added";
	}

	@Override
	public InvestmentsDTO getInvestments(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Investments> getinvestment(int userid) {
		try (Session objSession = sessionfactory.openSession()) {
			Query objQuery=objSession.getNamedQuery("getinvestmentbyid");
			objQuery.setParameter(1, userid);
		List<Investments> result=(List<Investments>) objQuery.getResultList();
			return (List<Investments>) result;
		} catch (Exception e) {
			return null;
			
		}
	}

	@Override
	public String removeInvestments(int investmentid) {
		  repositoryInvestments.deleteById(investmentid);
		  return "investment removed";
	}

	

}
