package com.example.lohiajute.service;

import com.example.lohiajute.dto.AdminDTO;
import com.example.lohiajute.dto.LoginDTO;
import com.example.lohiajute.message.LoginMessage;

public interface AdminService {

	String addAdmin(AdminDTO adminDTO);
	
	LoginMessage loginAdmin(LoginDTO loginDTO);
}
