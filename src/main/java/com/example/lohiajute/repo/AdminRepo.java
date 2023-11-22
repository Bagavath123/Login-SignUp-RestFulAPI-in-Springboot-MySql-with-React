package com.example.lohiajute.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lohiajute.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

	Optional<Admin> findByAdminNameAndPassword(String adminName, String password);
	
	Admin findByadminName(String adminName);
}
