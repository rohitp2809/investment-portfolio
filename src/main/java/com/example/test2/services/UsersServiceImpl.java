package com.example.test2.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test2.dto.UsersDTO;
import com.example.test2.pojo.Users;
import com.example.test2.repository.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersRepository repositoryUsers;

    @Override
    public String addUser(UsersDTO objUser) {
        Users entityUser = new Users();
        BeanUtils.copyProperties(objUser,entityUser);
        repositoryUsers.save(entityUser);
        return "User Added";
    }

    @Override
    public UsersDTO getUser(int  userid)
    {
        Optional<Users> optUsers = repositoryUsers.findById(userid);
        if(optUsers.isPresent())
        {
            Users entityUsers = optUsers.get();
            UsersDTO dto = new UsersDTO();
            BeanUtils.copyProperties(entityUsers, dto);
            return dto;
        }
        return null;
    }

    @Override
    public List<UsersDTO> getAllUsers() {
        Iterator<Users> iter = repositoryUsers.findAll().iterator();
        ArrayList<UsersDTO> list = new ArrayList<>();
        while(iter.hasNext())
        {
            Users entityUser = iter.next();
            UsersDTO dto = new UsersDTO();
            BeanUtils.copyProperties(entityUser,dto);
            list.add(dto);
        }
        return list;
    }

    @Override
    public String removeUser(int userid) {
      repositoryUsers.deleteById(userid);
        return "User removed";
    }

	
		 @Override
		    public boolean userLogin(int userid, String password) {
		        Optional<Users> optionalUsers= repositoryUsers.findById(userid);
		        if (optionalUsers.isPresent())
		        {
		          Users objUser = optionalUsers.get();
		            if (objUser.getPassword().equals(password))
		            {
		                return true;
		            }
		        }
		        return false;
		    }
		
	}


