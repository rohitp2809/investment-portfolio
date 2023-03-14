package com.example.test2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test2.pojo.Admin;
import com.example.test2.pojo.Users;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
