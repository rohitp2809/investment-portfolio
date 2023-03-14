package com.example.test2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.test2.dto.InvestmentsDTO;
import com.example.test2.dto.TransactionsDTO;
import com.example.test2.dto.UsersDTO;
import com.example.test2.pojo.Investments;
import com.example.test2.pojo.Transactions;
import com.example.test2.pojo.Users;
import com.example.test2.services.InvestmentsServices;
import com.example.test2.services.TransactionServices;
import com.example.test2.services.UsersService;

import java.io.Serializable;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    UsersService usersService;
    InvestmentsServices investmentsService;
   TransactionServices transactionService;
    //homepage of website
    @GetMapping("/")
    public String index(){
        return "index.html";
    }
    
    @GetMapping("/about")
    public String about(){
        return "About.html";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin.jsp";
    }
    @GetMapping("/news")
    public String news(){
        return "news.html";
    }
    @GetMapping("/contactus")
    public String contact(){
        return "contactus.html";
    }
    @GetMapping("/login")
    public String login(Model data) {
    	data.addAttribute("objUser",new Users());
    	return "login.jsp";
    }
    @GetMapping("/removeinvestment")
    public String remove(Model data) {
    	data.addAttribute("objUser",new Users());
    	return "removeinvestment.jsp";
    }
    @GetMapping("/removetransaction")
    public String remove2(Model data) {
    	data.addAttribute("objUser",new Users());
    	return "removetransaction.jsp";
    }
    //authenticate on login
    @PostMapping("/authenticate")
    public String authenticate(Model data,@RequestParam ("userid") int userid , @RequestParam("password") String password) {
    	if(userid==0 && password=="1") {
    		return "adminhome.jsp";
    	}
    	
    	else if(usersService.userLogin(userid,password)) 
    	{
    		data.addAttribute("user",userid);
    		return "userhome.jsp";
    	}
    	else
    	{
    		return "login.jsp";
    	}
    }
    //adduser method
    @GetMapping("/signup")
    public String signup() {
    	return "signup.jsp";
    }
    @PostMapping("/saveuser")
    public String saveuser(@RequestParam("firstname") String firstName,@RequestParam("lastname") String lastName,@RequestParam("mobilenumber") long mobileNumber,@RequestParam("emailid") String emailid,@RequestParam("aadharcardnumber") long aadharCardNumber,@RequestParam("password") String password) {
    	try {
    		UsersDTO objUser = new UsersDTO();
    		objUser.setFirstName(firstName);
    		objUser.setLastName(lastName);
    		objUser.setMobileNumber(mobileNumber);
    		objUser.setEmailId(emailid);
    		objUser.setAadharCardNumber(aadharCardNumber);
    		objUser.setPassword(password);
        	usersService.addUser(objUser);
        	return "login.jsp";
    	}
    	catch(Exception e) {
    		return "index.html";
    	}
    }
    //add investment method
    @GetMapping("/addinvestment")
    public String AddInvestment() {
    	return "addinvestment.jsp";
    }
    @PostMapping("/saveinvestment")
    public String Saveinvestment(@RequestParam("userid")int userid,@RequestParam("type")String type,@RequestParam("name")String name,@RequestParam("amount")long amount,@RequestParam("status")String status) {
    	try {
    		InvestmentsDTO objInvestment = new InvestmentsDTO();
    		objInvestment.setUserId(userid);
    		objInvestment.setType(type);
    		objInvestment.setName(name);
    		objInvestment.setAmount(amount);
    		objInvestment.setStatus(status);
        	investmentsService.addInvestments(objInvestment);
        	return "login.jsp";
    	}
    	catch(Exception e) {
    		return "index.html";
    	}
    	
    }
    //add transaction method
    @GetMapping("/addtransaction")
    public String AddTransaction() {
    	return "addtransaction.jsp";
    }
    @PostMapping("/savetransaction")
    public String saveTraansaction(@RequestParam("userid")int userid,@RequestParam("investmentid")int investmentid,@RequestParam("type")String type,@RequestParam("name")String name,@RequestParam("dateofsale")String dateofsale,@RequestParam("amount") long amount,@RequestParam("amountsold")long amountsold) {
    	try {
    		TransactionsDTO objUser = new TransactionsDTO();
    		objUser.setUserid(userid);
    		
    		objUser.setAmount(amount);
    		objUser.setAmountsold(amountsold);
    		objUser.setGain(0);
    		objUser.setLoss(0);
        	transactionService.addTransaction(objUser);
        	return "addtransaction.jsp";
    	}
    	catch(Exception e) {
    		return "index.html";
    	}
    	
    	
    }
    //show all methods
    @GetMapping("/showallusers")
    public String ShowAllUsers(Model data) {
    	List<UsersDTO> list=usersService.getAllUsers();
    	data.addAttribute("userList", list);

    	return "showallusers.jsp";
    	}
    @GetMapping("/showinvestment/{userId}")
	public String ShowInvestment(Model data,@PathVariable("userId")int userId) {
		List<Investments>list=investmentsService.getinvestment(userId);
		data.addAttribute("showinvestments", list);
		return "Showinvestment.jsp";
	}
    @GetMapping("/showtransaction/{userId}")
   	public String ShowTransaction(Model data,@PathVariable("userId")int userId) {
   		List<Transactions>list=transactionService.getTransaction(userId);
   		data.addAttribute("showtransaction", list);
   		return "showtransaction.jsp";
   	}
    //view profile for user
    @GetMapping("/profile/{userId}")
	public String profile(Model data,@PathVariable("userId")int userId) {
		UsersDTO objUser = usersService.getUser(userId);
		data.addAttribute("showProfile", objUser);
		return "Profile.jsp";
	}
    //removing all method
    @GetMapping("/removeuser/{userId}")
	public String removeuser(@PathVariable("userId")int userId) {
		usersService.removeUser(userId);
		return"showallusers.jsp";
	}
    @GetMapping("/removeinvestment/{investmentid}")
	public String removeinvestment(@PathVariable("investmentid")int investmentid) {
    	investmentsService.removeInvestments(investmentid);
		return"showinvestment.jsp";
	}
    @GetMapping("/removetransaction/{transactionid}")
	public String removetransaction(@PathVariable("transactionid")int transactionid) {
    transactionService.removeTransaction(transactionid);
		return"showtransaction.jsp";
	}
    
    
    }