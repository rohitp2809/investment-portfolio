package com.example.test2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.test2.dto.InvestmentsDTO;
import com.example.test2.pojo.Investments;
import com.example.test2.services.InvestmentsServices;

@RestController
@RequestMapping("/Investments")
public class InvestmentController
{
	@Autowired
	InvestmentsServices investmentsService;
    //add investment method
    @GetMapping("/addinvestment")
    public ModelAndView AddInvestment() {
    	return new ModelAndView("addinvestment.jsp","test",null);
    }
    @PostMapping("/saveinvestment")
    public ModelAndView saveInvestment(@RequestParam("userid")int userid,@RequestParam("type")String type,@RequestParam("name")String name,@RequestParam("amount")long amount,@RequestParam("status")String status) {
    	try {
    		InvestmentsDTO objInvestment = new InvestmentsDTO();
    		objInvestment.setUserId(userid);
    		objInvestment.setType(type);
    		objInvestment.setName(name);
    		objInvestment.setAmount(amount);
    		objInvestment.setStatus(status);
        	investmentsService.addInvestments(objInvestment);
        	List<Investments>list=investmentsService.getinvestment(userid);
        	return new ModelAndView("showinvestment.jsp","showinvestments",list);
    	}
    	catch(Exception e) {
    		return new ModelAndView("index.html","test",null);
    	}
    	
    }
    @GetMapping("/showinvestment/{userId}")
   	public ModelAndView showinvestment (@PathVariable("userId")int userId) {
   		List<Investments>list=investmentsService.getinvestment(userId);
   		return new ModelAndView("showinvestment.jsp","showinvestments",list);
    }
    @GetMapping("/removeinvestment")
  	public  ModelAndView removeinvestment(@RequestParam("investmentid")int investmentid) {
      	investmentsService.removeInvestments(investmentid);
      	return new ModelAndView("addinvestment.jsp","test",null);
  	}
    
}