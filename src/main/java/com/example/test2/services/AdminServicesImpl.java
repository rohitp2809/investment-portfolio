package com.example.test2.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test2.dto.AdminDTO;
import com.example.test2.dto.UsersDTO;
import com.example.test2.pojo.Admin;
import com.example.test2.pojo.Users;
import com.example.test2.repository.AdminRepository;
import com.example.test2.repository.UsersRepository;
@Service
public class AdminServicesImpl implements AdminServices{
	 @Autowired
	    AdminRepository adminRepository;
	@Override
	public String addAdmin(AdminDTO objAdmin) {
		 Admin entityAdmin = new Admin();
	        BeanUtils.copyProperties(objAdmin,entityAdmin);
	        adminRepository.save(entityAdmin);
	        return "User Added";	}

	@Override
	public List<AdminDTO> getAllAdmin() {
		 Iterator<Admin> iter = adminRepository.findAll().iterator();
	        ArrayList<AdminDTO> list = new ArrayList<>();
	        while(iter.hasNext())
	        {
	            Admin entityAdmin = iter.next();
	            AdminDTO dto = new AdminDTO();
	            BeanUtils.copyProperties(entityAdmin,dto);
	            list.add(dto);
	        }
	        return list;
	}

	@Override
	public String removeAdmin(int adminid) {
		 adminRepository.deleteById(adminid);
	        return "User removed";
	}

}
