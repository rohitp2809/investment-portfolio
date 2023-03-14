package com.example.test2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.test2.dto.TransactionsDTO;
import com.example.test2.pojo.Transactions;
import com.example.test2.services.TransactionServices;

@RestController
@RequestMapping("/Test")
public class TestController {
	@Autowired
	 TransactionServices transactionService;
	
	@PostMapping("/savetransaction")
    public ModelAndView saveTraansaction(@RequestParam("userid")int userid,@RequestParam("name")String name,@RequestParam("amount") long amount,@RequestParam("amountsold")long amountsold,@RequestParam("loss")long loss,@RequestParam("gain")long gain) {
    	try {
    		TransactionsDTO objUser = new TransactionsDTO();
    		objUser.setUserid(userid);
    	    objUser.setAmount(amount);
    	    objUser.setName(name);
    		objUser.setAmountsold(amountsold);
    		objUser.setGain(loss);
    		objUser.setLoss(gain);
        	transactionService.addTransaction(objUser);
        	List<Transactions>list=transactionService.getTransaction(userid);
        	return new ModelAndView("showtransaction.jsp","showtransaction",list);
        	
    	}
    	catch(Exception e) {
    		return new ModelAndView("index.html","test",null);
    	}
    	

}
	  @GetMapping("/showtransaction/{userId}")
	   	public ModelAndView ShowTransaction(Model data,@PathVariable("userId")int userId) {
	   		List<Transactions>list=transactionService.getTransaction(userId);
	   		return new ModelAndView("showtransaction.jsp","showtransaction",list);
	   	}
	  @GetMapping("/removetransaction")
		public ModelAndView removetransaction(@RequestParam("transactionid")int transactionid) {
	    transactionService.removeTransaction(transactionid);
	    return new ModelAndView("addtransaction.jsp","test",null);
		}
	  
	  }
