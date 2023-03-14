package com.example.test2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test2.pojo.*;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
