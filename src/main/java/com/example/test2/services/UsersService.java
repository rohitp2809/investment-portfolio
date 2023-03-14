package com.example.test2.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.test2.dto.UsersDTO;

import java.io.Serializable;
import java.util.List;

public interface UsersService {
    public String addUser(@RequestBody UsersDTO objUser);
    public UsersDTO getUser(@PathVariable("userid") int userid);
    public List<UsersDTO> getAllUsers();
    public String removeUser(@PathVariable("userid")int userid);
    public boolean userLogin(@PathVariable("userid") int userid,@PathVariable("password") String password);
   }
