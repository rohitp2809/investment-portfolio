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

import com.example.test2.dto.UsersDTO;
import com.example.test2.services.UsersService;

@RestController
@RequestMapping("/Users")
public class UserController {
	 @Autowired
	    UsersService usersService;
	@GetMapping("/profile/{userId}")
	public ModelAndView profile(Model data,@PathVariable("userId")int userId) {
		UsersDTO objUser = usersService.getUser(userId);
		data.addAttribute("showProfile", objUser);
		return new ModelAndView("profile.jsp","test",null);
	}
	 @GetMapping("/showallusers")
	    public  ModelAndView ShowAllUsers(Model data) {
	    	List<UsersDTO> list=usersService.getAllUsers();
	    	data.addAttribute("userlist", list);

	    	return new ModelAndView("showallusers","userlist",list);
	    	}
	 @GetMapping("/authenticateadmin/{userId}/{password}")
	 public ModelAndView authenticateadmin(@RequestParam("userid")int userid,@RequestParam("password")String password) {
		if(userid==1 && password.equals("admin")) {
			List<UsersDTO> list=usersService.getAllUsers();
			return new ModelAndView("showalluser.jsp","userlist",list);
			
		}else
			return new ModelAndView("index.html","test",null);
		 
	 }
	 

}
