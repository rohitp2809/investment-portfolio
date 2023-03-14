package com.example.test2.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.test2.dto.AdminDTO;
import com.example.test2.dto.UsersDTO;
import com.example.test2.pojo.Admin;

public interface AdminServices {
	public String addAdmin(@RequestBody AdminDTO objAdmin);
 
    public List<AdminDTO> getAllAdmin();
    public String removeAdmin(@PathVariable("adminid")int adminid);
}
